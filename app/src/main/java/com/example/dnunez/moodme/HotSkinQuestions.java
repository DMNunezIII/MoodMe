package com.example.dnunez.moodme;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class HotSkinQuestions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_skin_questions);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void emotionsClicked(View v){
        Intent intent = new Intent(this, Brooding.class);
        startActivity(intent);
    }
    public void eruptingBloodClicked(View v){
        Intent intent = new Intent(this, Aggravated.class);
        startActivity(intent);
    }
    public void restClicked(View v){
        Intent intent = new Intent(this, Cranky.class);
        startActivity(intent);
    }
    public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.landscape_message);
        }else if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.activity_hot_skin_questions);
        }
    }

}
