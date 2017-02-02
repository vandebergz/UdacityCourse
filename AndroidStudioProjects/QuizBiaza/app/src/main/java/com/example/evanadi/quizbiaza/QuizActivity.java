package com.example.evanadi.quizbiaza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private Button trueButton, falseButton;
    private boolean isClicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        trueButton = (Button) findViewById(R.id.button_true);
        falseButton = (Button) findViewById(R.id.button_false);
      Intent nex = new Intent(QuizActivity.this, Quiz2Activity.class);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.equals(trueButton)){
                    Toast.makeText(QuizActivity.this, "Bener nih ye", Toast.LENGTH_SHORT).show();
                    Intent nex = new Intent(QuizActivity.this, Quiz2Activity.class);
                    startActivity(nex);
                } else if (v.equals(falseButton)){
                    Toast.makeText(QuizActivity.this, "Salah oy", Toast.LENGTH_SHORT).show();

                }
            }
        };

        trueButton.setOnClickListener(listener);
        falseButton.setOnClickListener(listener);

    }
}
