package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        String id = "";
        Bundle extras = getIntent().getExtras();
        if(extras != null) id = extras.getString("ID");

        VideoView vdo = findViewById(R.id.vdoView);
        String videoPath = "android.resource://"+ getPackageName() + "/" + R.raw.shorts;
        Uri u = Uri.parse(videoPath);
        vdo.setVideoURI(u);
        vdo.start();

        MediaController mediaController = new MediaController(this);
        vdo.setMediaController(mediaController);
        mediaController.setAnchorView(vdo);

        Button btn2 = (Button) findViewById(R.id.button5);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity5.this,MainActivity4.class);
                startActivity(intent);

            }
        });


    }

}