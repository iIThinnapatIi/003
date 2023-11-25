package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        VideoView vdo = findViewById(R.id.vdoView);
        String videoPath = "android.resource://"+ getPackageName() + "/" + R.raw.output2;
        Uri u = Uri.parse(videoPath);
        vdo.setVideoURI(u);
        vdo.start();

        MediaController mediaController = new MediaController(this);
        vdo.setMediaController(mediaController);
        mediaController.setAnchorView(vdo);
    }

}