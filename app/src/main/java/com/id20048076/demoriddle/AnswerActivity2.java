package com.id20048076.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tv = findViewById(R.id.textView);

        Intent intentReceived = getIntent();
        String stringReceived = intentReceived.getStringExtra("Question");
        tv.setText(stringReceived+" answer is: Gone");
    }
}