package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class franciaActivity extends AppCompatActivity {
    Button btnVideoDragon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dragon);

        btnVideoDragon=(Button)findViewById(R.id.btnVideoDragon);

        btnVideoDragon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent formvideodragon = new Intent(franciaActivity.this,Dragonvideo.class);
                startActivity(formvideodragon);
            }
        });
    }
}