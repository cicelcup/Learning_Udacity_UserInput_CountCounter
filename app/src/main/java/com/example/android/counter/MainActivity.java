package com.example.android.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import org.jetbrains.annotations.NotNull;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {
//    constants for saving the instance
    static final String SCORE_TEAM_1 = "team1";
    static final String SCORE_TEAM_2 = "team2";
//    score variables
    int scoreTeam1;
    int scoreTeam2;

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current score
        savedInstanceState.putInt(SCORE_TEAM_1,scoreTeam1);
        savedInstanceState.putInt(SCORE_TEAM_2, scoreTeam2);

        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        check if there's a previous score before the activity is created
        if (savedInstanceState!=null){
            previousScore(savedInstanceState.getInt(SCORE_TEAM_1),
                    savedInstanceState.getInt(SCORE_TEAM_2));
        }
        else{
            setToZero();
        }
    }

//    Set the previous score
    private void previousScore(int scoreTeam1, int scoreTeam2) {
        this.scoreTeam1 = scoreTeam1;
        this.scoreTeam2 = scoreTeam2;
        showScore(this.scoreTeam1, (TextView) findViewById(
                R.id.label_team_1));
        showScore(this.scoreTeam2, (TextView) findViewById(
                R.id.label_team2));
    }

//    Set the score to 0
    private void setToZero(){
        previousScore(0, 0);

    }

//    Show the score in the text view
    private void showScore(int x, @NotNull TextView y) {
        y.setText(String.format(Locale.getDefault(),"%d",x));
    }

//    reset the view to 0
    public void reset(View view){
        setToZero();
    }

//    increase the score according which button is pressed
    public void increaseScore(@NotNull View view){
        String whichButton = getResources().getResourceEntryName(view.getId());

        switch (whichButton){
            case "btn_1point_team1":
                scoreTeam1 = scoreTeam1 +1;
                showScore(scoreTeam1, (TextView) findViewById(R.id.label_team_1));
                break;
            case "btn_2points_team1":
                scoreTeam1 = scoreTeam1 +2;
                showScore(scoreTeam1, (TextView) findViewById(R.id.label_team_1));
                break;
            case "btn_3points_team1":
                scoreTeam1 = scoreTeam1 +3;
                showScore(scoreTeam1, (TextView) findViewById(R.id.label_team_1));
                break;
            case "btn_1point_team2":
                scoreTeam2 = scoreTeam2 +1;
                showScore(scoreTeam2, (TextView) findViewById(R.id.label_team2));
                break;
            case "btn_2points_team2":
                scoreTeam2 = scoreTeam2 +2;
                showScore(scoreTeam2, (TextView) findViewById(R.id.label_team2));
                break;
            case "btn_3points_team2":
                scoreTeam2 = scoreTeam2 +3;
                showScore(scoreTeam2, (TextView) findViewById(R.id.label_team2));
                break;
        }

    }
}
