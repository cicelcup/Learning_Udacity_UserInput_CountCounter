package com.example.android.counter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import org.jetbrains.annotations.NotNull;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {
    //    score variables
    int scoreTeam1;
    int scoreTeam2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setToZero();

    }

//    Set the score to 0
    private void setToZero(){
        showScore(0, (TextView) findViewById(
                R.id.label_team_1));
        showScore(0, (TextView) findViewById(
                R.id.label_team2));
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
