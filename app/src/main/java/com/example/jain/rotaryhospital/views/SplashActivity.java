package com.example.jain.rotaryhospital.views;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.jain.rotaryhospital.R;

public class SplashActivity extends AppCompatActivity {

    ProgressBar mProgress;
    TextView textView;
    private int value;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Show the splash screen
        setContentView(R.layout.activity_splash);
        mProgress = (ProgressBar) findViewById(R.id.progressBarSplash);
        textView = (TextView) findViewById(R.id.textViewSplashProgress);
        final Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                if (value == 100) {
                    Intent intent = new Intent(SplashActivity.this, HomeActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    textView.setText("Opening: " + value + "%");
                    mProgress.setProgress(value);
                }
                value+= 10;
                handler.postDelayed(this,500);
            }
        };
        handler.postDelayed(runnable, 100);
    }

}



