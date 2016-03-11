package com.example.dnunez.moodme;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class FireBloodQuestions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_blood_questions);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void gnawingClicked(View v){
        Intent intent = new Intent(this, GnawingQuestions.class);
        startActivity(intent);
    }
    public void hotSkinClicked(View v){
        Intent intent = new Intent(this, HotSkinQuestions.class);
        startActivity(intent);
    }
    public void rageClicked(View v){
        Intent intent = new Intent(this, RageQuestions.class);
        startActivity(intent);
    }
    public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.landscape_message);
        }else if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.activity_fire_blood_questions);
        }
    }
}
