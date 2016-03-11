package com.example.dnunez.moodme;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SoulCryingQuestions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soul_crying_questions);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void shellClicked(View v){
        Intent intent = new Intent(this, Depressed.class);
        startActivity(intent);
    }
    public void knowClicked(View v){
        Intent intent = new Intent(this, Guilty.class);
        startActivity(intent);
    }
    public void feelingClicked(View v){
        Intent intent = new Intent(this, Melancholy.class);
        startActivity(intent);
    }
    public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.landscape_message);
        }else if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.activity_soul_crying_questions);
        }
    }
}
