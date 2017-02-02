package com.example.evanadi.quizbiaza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IdentityActivity extends AppCompatActivity {


    private Button mulaiQuiz;
    EditText textNama, textKelas;
    String userNama, userKelas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity);
        //Intent pindah = getIntent();

//        userNama = textNama.getText().toString();
      //  userKelas = textKelas.getText().toString();
        mulaiQuiz = (Button) findViewById(R.id.button_start);

        mulaiQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mulai = new Intent(IdentityActivity.this, QuizActivity.class);
                startActivity(mulai);
            }
        });
    }
}
