package com.example.dnunez.moodme;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class Happy extends AppCompatActivity {
    MediaPlayer kennyG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy);
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
        WebView gif = new WebView(this);
        gif.loadUrl("file:///android_asset/otherfire.gif");
        setContentView(gif);
//        ImageView gif = (ImageView)findViewById(R.id.fireGif);
//        Ion.with(gif).load("@drawable/happyfireplacecat.gif");
        kennyG = MediaPlayer.create(this, R.raw.kennyg);
        kennyG.start();
    }
    public void createGif(){

    }
}