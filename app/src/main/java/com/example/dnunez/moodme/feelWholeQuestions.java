package com.example.dnunez.moodme;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class FeelWholeQuestions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feel_whole_questions);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void resolveSteeledClicked(View v){
        Intent intent = new Intent(this, ResolveSteeledQuestions.class);
        startActivity(intent);
    }
    public void wishClicked(View v){
        Intent intent = new Intent(this, WishQuestions.class);
        startActivity(intent);
    }
    public void unsureClicked(View v){
        Intent intent = new Intent(this, UnsureQuestions.class);
        startActivity(intent);
    }
}
