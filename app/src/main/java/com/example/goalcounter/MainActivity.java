package com.example.goalcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreForTeamA = 0;
    int scoreForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayTeamA(0);
    }

    public void displayTeamA(int score){
        TextView textView = (TextView) findViewById(R.id.team_a_score);
        scoreForTeamA = scoreForTeamA + score;
        textView.setText(String.valueOf(scoreForTeamA));
    }

    public void displayTeamB(int score){
        TextView textView = (TextView) findViewById(R.id.team_b_score);
        scoreForTeamB = scoreForTeamB + score;
        textView.setText(String.valueOf(scoreForTeamB));
    }

    public void resetScore(View view){
        scoreForTeamA = 0;
        scoreForTeamB = 0;
        displayTeamA(scoreForTeamA);
        displayTeamB(scoreForTeamB);
    }

    public void addThreeForTeamA(View view){
        displayTeamA(3);
    }

    public void addTwoForTeamA(View view){
        displayTeamA(2);
    }

    public void addOneForTeamA(View view){
        displayTeamA(1);
    }

    public void addThreeForTeamB(View view){
        displayTeamB(3);
    }

    public void addTwoForTeamB(View view){
        displayTeamB(2);
    }

    public void addOneForTeamB(View view){
        displayTeamB(1);
    }
}