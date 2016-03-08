package com.example.dnunez.moodme;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MoodSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_selection);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void happyClicked(View v){
        Intent intent = new Intent(this, Happy.class);
        startActivity(intent);
    }
    public void sadClicked(View v){
        Intent intent = new Intent(this, Sad.class);
        startActivity(intent);
    }
    public void angryClicked(View v){
        Intent intent = new Intent(this, Angry.class);
        startActivity(intent);
    }
    public void excitedClicked(View v){
        Intent intent = new Intent(this, Excited.class);
        startActivity(intent);
    }
    public void relaxedClicked(View v){
        Intent intent = new Intent(this, Relaxed.class);
        startActivity(intent);
    }
    public void lazyClicked(View v){
        Intent intent = new Intent(this, Lazy.class);
        startActivity(intent);
    }
    public void irritatedClicked(View v){
        Intent intent = new Intent(this, Irritated.class);
        startActivity(intent);
    }
    public void hyperClicked(View v){
        Intent intent = new Intent(this, Hyper.class);
        startActivity(intent);
    }
    public void enragedClicked(View v){
        Intent intent = new Intent(this, Enraged.class);
        startActivity(intent);
    }
}
