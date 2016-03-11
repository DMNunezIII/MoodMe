package com.example.dnunez.moodme;

import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;

public class Frustrated extends AppCompatActivity {
    MediaPlayer song;
    WebView frustrate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frustrated);
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
        frustrate = new WebView(this);
        frustrate.loadUrl("file:///android_asset/frustrated.gif");
        setContentView(frustrate);
        song = MediaPlayer.create(this, R.raw.frustratedbobmarley);
        song.start();
    }
    protected void onStop(){
        super.onStop();
        song.stop();
    }
    public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.landscape_message);
        }else if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            setContentView(frustrate);
        }
    }

}
