package com.id20048076.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        tv = findViewById(R.id.textView2);
        Intent i = getIntent();
        String s = i.getStringExtra("Question");
        if(s.equals("Q1")){
            tv.setText(s + "answer is: Queue");
        }else{
            tv.setText(s + "answer is: Gone");
        }

    }
}