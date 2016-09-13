package com.ekasilab.newapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    private Button btnView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);



                btnView = (Button) findViewById(R.id.btnViewWish);
                btnView.setOnClickListener(new btnClickListener());

    }
    private class btnClickListener implements View.OnClickListener
    {
        @Override
        public void onClick(View v) {
            Intent objIntent = new Intent(WelcomeActivity.this,BirthdayWishesActivity.class);
            startActivity(objIntent);

        }
    }

}
