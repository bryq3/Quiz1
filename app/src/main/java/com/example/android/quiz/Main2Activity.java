package com.example.android.quiz;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.RadioButton;

public class Main2Activity extends AppCompatActivity {

    public static int score =0;
    public void pointsCounter(){
        RadioButton nawalka = (RadioButton) findViewById(R.id.nawalka);
        RadioButton lewy = (RadioButton) findViewById(R.id.lewy);
        RadioButton podium = (RadioButton) findViewById(R.id.podium);
        RadioButton basket = (RadioButton) findViewById(R.id.basket);
        RadioButton glik = (RadioButton) findViewById(R.id.glik);
        RadioButton turbo = (RadioButton) findViewById(R.id.turbo);
        RadioButton milik = (RadioButton) findViewById(R.id.milik);
        RadioButton krycha = (RadioButton) findViewById(R.id.krycha);
        RadioButton piszczek = (RadioButton) findViewById(R.id.piszczek);
        RadioButton lewandowski = (RadioButton) findViewById(R.id.lewandowski);

        if (nawalka.isChecked()){
            score+=1;
        }
        if (lewy.isChecked()){
            score+=1;
        }
        if (podium.isChecked()){
            score+=1;
        }
        if (basket.isChecked()){
            score+=1;
        }
        if (glik.isChecked()){
            score+=1;
        }
        if (turbo.isChecked()){
            score+=1;
        }
        if (milik.isChecked()){
            score+=1;
        }
        if (krycha.isChecked()){
            score+=1;
        }
        if (piszczek.isChecked()){
            score+=1;
        }
        if (lewandowski.isChecked()){
            score+=1;
        }
    }


    public void submitScore(){

        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.android.quiz.Main3Activity");
                pointsCounter();
                intent.putExtra("finalScore", score);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        submitScore();
    }
}
