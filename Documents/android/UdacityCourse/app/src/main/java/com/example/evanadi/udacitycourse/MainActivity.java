package com.example.evanadi.udacitycourse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView guestList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        guestList = (TextView) findViewById(R.id.guest_list_txvw);
        guestList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahNext = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(pindahNext);
            }
        });
    }
}
