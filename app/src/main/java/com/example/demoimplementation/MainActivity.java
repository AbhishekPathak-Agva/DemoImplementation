package com.example.demoimplementation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity  {
    private TextView tv_Timer;
    private LinearLayoutCompat;
    private LinearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_Timer=(TextView) findViewById(R.id.tv_timer);
                new CountDownTimer(6000,1000){
                    @Override
                    public void onTick(long l) {
                        double value=l/1000;
                        tv_Timer.setText("Seconds remaining: "+l/1000);
                    }

                    @Override
                    public void onFinish() {
                        tv_Timer.setText("done!");
                        this.start();
                    }
                }.start();
    }

}