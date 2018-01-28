package com.example.android.collegebasketballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.collegebasketballcounter.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);

    }

    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);

    }

    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);

    }

    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);

    }

    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);

    }

    public void resetAandB(View v) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        View btnA = findViewById(R.id.btn_set_team_a_name);
        btnA.setVisibility(View.VISIBLE);
        EditText editTeamAName = (EditText) findViewById(R.id.edit_text_team_a_name);
        editTeamAName.setVisibility(View.VISIBLE);
        editTeamAName.setText("");
        TextView displayTeamAName = (TextView) findViewById(R.id.tv_team_a_name);
        displayTeamAName.setText("");
        displayTeamAName.setVisibility(View.GONE);


        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
        View btnB = findViewById(R.id.btn_set_team_b_name);
        btnB.setVisibility(View.VISIBLE);
        EditText editTeamBName = (EditText) findViewById(R.id.edit_text_team_b_name);
        editTeamBName.setVisibility(View.VISIBLE);
        editTeamBName.setText("");
        TextView displayTeamBName = (TextView) findViewById(R.id.tv_team_b_name);
        displayTeamBName.setText("");
        displayTeamBName.setVisibility(View.GONE);

    }


    public void btnClickSetTeamA(View v) {
        TextView displayTeamAName = (TextView) findViewById(R.id.tv_team_a_name);
        EditText editTeamAName = (EditText) findViewById(R.id.edit_text_team_a_name);
        displayTeamAName.setText(editTeamAName.getText().toString());
        displayTeamAName.setTextSize(32);

        View btnA = findViewById(R.id.btn_set_team_a_name);
        btnA.setVisibility(View.GONE);
        editTeamAName.setVisibility(View.GONE);


    }

    public void btnClickSetTeamB(View v) {
        TextView displayTeamBName = (TextView) findViewById(R.id.tv_team_b_name);
        EditText editTeamBName = (EditText) findViewById(R.id.edit_text_team_b_name);
        displayTeamBName.setText(editTeamBName.getText().toString());
        displayTeamBName.setTextSize(32);

        View btnB = findViewById(R.id.btn_set_team_b_name);
        btnB.setVisibility(View.GONE);
        editTeamBName.setVisibility(View.GONE);
    }


    public void btnClickFixTeamA(View v) {
       // TextView fixTeamA = (TextView) findViewById(R.id.fix_text_team_a_name);
       // int theFixA = Integer.parseInt(fixTeamA.getText().toString());
       // scoreTeamA = scoreTeamA - theFixA;
        scoreTeamA = scoreTeamA - 1;
        displayForTeamA(scoreTeamA);
       // fixTeamA.setText("");
    }


    public void btnClickFixTeamB(View v) {
      //  TextView fixTeamB = (TextView) findViewById(R.id.fix_text_team_b_name);
      //  int theFixB = Integer.parseInt(fixTeamB.getText().toString());
      //   scoreTeamB = scoreTeamB - theFixB;
        scoreTeamB = scoreTeamB - 1;
        displayForTeamB(scoreTeamB);
       // fixTeamB.setText("");
    }


}
