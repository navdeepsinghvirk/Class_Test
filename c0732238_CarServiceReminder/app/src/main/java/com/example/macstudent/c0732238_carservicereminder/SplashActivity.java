package com.example.macstudent.c0732238_carservicereminder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;



public class SplashActivity extends Activity {
    private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);



        requestWindowFeature(Window.FEATURE_NO_TITLE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);



        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override

            public void run() {
                Intent i = new Intent(SplashActivity.this, LoginActivity.class);

                startActivity(i);

                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}