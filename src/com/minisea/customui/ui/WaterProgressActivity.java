package com.minisea.customui.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;

import com.minisea.cookbook.R;
import com.minisea.customui.view.WaveView;

/**
 * Created by kai.wang on 6/17/14.
 */
public class WaterProgressActivity extends Activity {

    private SeekBar seekBar;
    private WaveView waveView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_wave);

        seekBar = (SeekBar) findViewById(R.id.seek_bar);
        waveView = (WaveView) findViewById(R.id.wave_view);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                waveView.setProgress(progress);
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