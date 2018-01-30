package com.example.android.quiz;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main3Activity extends AppCompatActivity {




    public void reset(){
        Button resetBtn = (Button) findViewById(R.id.tryAgain);
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = getBaseContext().getPackageManager()
                        .getLaunchIntentForPackage( getBaseContext().getPackageName() );
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        int finalScoreInt = getIntent().getIntExtra("finalScore", 0);
        TextView finalScore = (TextView) findViewById(R.id.finalScore);
        finalScore.setText(String.valueOf(finalScoreInt));

        TextView congrats = (TextView) findViewById(R.id.congrats);
        TextView yourScore = (TextView) findViewById(R.id.yourScore);
        TextView outOf = (TextView) findViewById(R.id.outOf);

        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/KaushanScript-Regular.ttf");

        congrats.setTypeface(font);
        yourScore.setTypeface(font);
        outOf.setTypeface(font);

        reset();

    }
}
