package com.example.ygrek.myseekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewAzi;
    SeekBar seekBarAzi;
    TextView textViewAlt;
    SeekBar seekBarAlt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout mainLayout = (LinearLayout)findViewById(R.id.mainLayout);
        Draw2D draw2D = new Draw2D(this);
        mainLayout.addView(draw2D);

        seekBarAzi = (SeekBar) findViewById(R.id.seekBarAzi);
        textViewAzi = (TextView) findViewById(R.id.txtViewAzi);
        seekBarAlt = (SeekBar) findViewById(R.id.seekBarAlt);
        textViewAlt = (TextView) findViewById(R.id.txtViewAlt);

        textViewAzi.setText(String.valueOf(seekBarAzi.getProgress()));
        textViewAlt.setText(String.valueOf(seekBarAlt.getProgress()));
        seekBarAzi.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                textViewAzi.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBarAlt.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                textViewAlt.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
}
