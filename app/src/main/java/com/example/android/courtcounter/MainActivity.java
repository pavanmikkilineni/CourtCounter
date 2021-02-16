package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA=0;
    private int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayTeamA(int score){
        TextView scoreTextView=(TextView) findViewById(R.id.score_a_text_view);
        scoreTextView.setText(""+score);
    }
    public void points3TeamA(View view){
        scoreTeamA=scoreTeamA+3;
        displayTeamA(scoreTeamA);
    }
    public void points2TeamA(View view){
         scoreTeamA=scoreTeamA+2;
        displayTeamA(scoreTeamA);
    }
    public void freeThrowTeamA(View view){
        scoreTeamA=scoreTeamA+1;
        displayTeamA(scoreTeamA);
    }
    public void displayTeamB(int score){
        TextView scoreTextView=(TextView) findViewById(R.id.score_b_text_view);
        scoreTextView.setText(""+score);
    }
    public void points3TeamB(View view){
        scoreTeamB=scoreTeamB+3;
        displayTeamB(scoreTeamB);
    }
    public void points2TeamB(View view){
        scoreTeamB=scoreTeamB+2;
        displayTeamB(scoreTeamB);
    }
    public void freeThrowTeamB(View view){
        scoreTeamB=scoreTeamB+1;
        displayTeamB(scoreTeamB);
    }
    public void resetScore(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);
    }
}
