package com.example.tulio.proyectoinformatico;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    private static int SPLASH_TIME_OUT= 4000;
    private ImageView I;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        I= findViewById(R.id.imageView2);
        Animation myanimation= AnimationUtils.loadAnimation(this, R.anim.mytransition);

        I.startAnimation(myanimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent= new Intent(Splash.this, LogIn.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
