package com.ekasilab.newapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {



    private MediaPlayer plyMfr;
   




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        plyMfr = new MediaPlayer();
        plyMfr = MediaPlayer.create(this,R.raw.mfr_friends);
        plyMfr.start();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        plyMfr.stop();
    }
}
