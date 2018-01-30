package com.example.android.quiz;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static Button nextBtn;


    public void nextActivity(){
        nextBtn = (Button) findViewById(R.id.startBtn);

        nextBtn.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.android.quiz.Main2Activity");
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextActivity();

        TextView football = (TextView) findViewById(R.id.football);
        TextView quiz = (TextView) findViewById(R.id.quiz);

        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/KaushanScript-Regular.ttf");
        football.setTypeface(font);
        quiz.setTypeface(font);
    }

}

