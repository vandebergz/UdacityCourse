package com.example.evanadi.quizbiaza;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mulai = (Button) findViewById(R.id.button_mulai);

        mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mulaiIsi = new Intent(MainActivity.this, IdentityActivity.class);
                Toast.makeText(MainActivity.this, "Isi nama dulu ya.", Toast.LENGTH_SHORT).show();
                startActivity(mulaiIsi);
            }
        });
    }
}
