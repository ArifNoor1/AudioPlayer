package com.example.audioplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(this,R.raw.abhi);
        Toast.makeText(this, "MP3 is on", Toast.LENGTH_SHORT).show();
    }

    public void startSong(View view){
        mp.start();
        Toast.makeText(this, "MP3 is pause", Toast.LENGTH_SHORT).show();
    }

    public void pauseSong(View view){
        mp.pause();
    }
    public void stopSong(View view){
        mp.stop();
        mp = MediaPlayer.create(this,R.raw.abhi);
        Toast.makeText(this, "MP3 is stop", Toast.LENGTH_SHORT).show();
    }
}