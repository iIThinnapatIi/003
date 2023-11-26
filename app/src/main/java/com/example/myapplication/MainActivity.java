package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        VideoView vdo = (VideoView)findViewById(R.id.videoView);
        String path = "android.resouce://com.example.chapter1/"+R.raw.output3;
        Uri u = Uri.parse(path);
        vdo.setVideoURI(u);
        vdo.start();
    }
}