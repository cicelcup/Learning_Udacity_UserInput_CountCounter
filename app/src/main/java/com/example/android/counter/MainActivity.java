package com.example.android.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import org.jetbrains.annotations.NotNull;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {
    int scoreTeam1;
    int scoreTeam2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setToZero();
    }

    private void setToZero(){
        scoreTeam1 = 0;
        scoreTeam2 = 0;
        showScore(scoreTeam1, (TextView) findViewById(
                R.id.label_team_1));
        showScore(scoreTeam2, (TextView) findViewById(
                R.id.label_team2));

    }
    private void showScore(int x, @NotNull TextView y) {
        y.setText(String.format(Locale.getDefault(),"%d",x));
    }

    public void reset(View view){
        setToZero();
    }

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
