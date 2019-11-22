package com.example.android.counter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import org.jetbrains.annotations.NotNull;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {
    //    score view model variable
    ScoreViewModel scoreViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreViewModel = ViewModelProviders.of(this).get(ScoreViewModel.class);
        setScores();

    }

//    Set the score to 0
    private void setScores(){
        showScore(scoreViewModel.scoreTeam1, (TextView) findViewById(
                R.id.label_team_1));
        showScore(scoreViewModel.scoreTeam2, (TextView) findViewById(
                R.id.label_team2));
    }

//    Show the score in the text view
    private void showScore(int x, @NotNull TextView y) {
        y.setText(String.format(Locale.getDefault(),"%d",x));
    }

//    reset the view to 0
    public void reset(View view){
        setScores();
    }

//    increase the score according which button is pressed
    public void increaseScore(@NotNull View view){
        String whichButton = getResources().getResourceEntryName(view.getId());

        switch (whichButton){
            case "btn_1point_team1":
                scoreViewModel.scoreTeam1 = scoreViewModel.scoreTeam1 +1;
                showScore(scoreViewModel.scoreTeam1, (TextView) findViewById(R.id.label_team_1));
                break;
            case "btn_2points_team1":
                scoreViewModel.scoreTeam1 = scoreViewModel.scoreTeam1 +2;
                showScore(scoreViewModel.scoreTeam1, (TextView) findViewById(R.id.label_team_1));
                break;
            case "btn_3points_team1":
                scoreViewModel.scoreTeam1 = scoreViewModel.scoreTeam1 +3;
                showScore(scoreViewModel.scoreTeam1, (TextView) findViewById(R.id.label_team_1));
                break;
            case "btn_1point_team2":
                scoreViewModel.scoreTeam2 = scoreViewModel.scoreTeam2 +1;
                showScore(scoreViewModel.scoreTeam2, (TextView) findViewById(R.id.label_team2));
                break;
            case "btn_2points_team2":
                scoreViewModel.scoreTeam2 = scoreViewModel.scoreTeam2 +2;
                showScore(scoreViewModel.scoreTeam2, (TextView) findViewById(R.id.label_team2));
                break;
            case "btn_3points_team2":
                scoreViewModel.scoreTeam2 = scoreViewModel.scoreTeam2 +3;
                showScore(scoreViewModel.scoreTeam2, (TextView) findViewById(R.id.label_team2));
                break;
        }

    }
}
