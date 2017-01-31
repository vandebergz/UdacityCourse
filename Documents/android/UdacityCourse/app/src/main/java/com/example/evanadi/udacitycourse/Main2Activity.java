package com.example.evanadi.udacitycourse;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    private ImageView iconAndroid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        iconAndroid = (ImageView) findViewById(R.id.android_imgvw);
        iconAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahNext2 = new Intent(Main2Activity.this, BirthdayCardActivity.class);
                startActivity(pindahNext2);
            }
        });
    }
}
