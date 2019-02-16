package com.hugoguillin.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mScore1, mScore2;
    private TextView mScoreText1, mScoreText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScoreText1 = findViewById(R.id.score_1);
        mScoreText2 = findViewById(R.id.score_2);

    }

    public void decreaseScore(View view) {
        int viewId = view.getId();
        switch (viewId){
            case R.id.decreaseTeam1:
                mScore1--;
                mScoreText1.setText(Integer.toString(mScore1));
                break;

            case R.id.decreaseTeam2:
                mScore2--;
                mScoreText2.setText(Integer.toString(mScore2));

        }
    }

    public void increaseScore(View view) {
        int viewId = view.getId();
        switch (viewId){
            case R.id.increaseTeam1:
                mScore1++;
                mScoreText1.setText(Integer.toString(mScore1));
                break;

                case R.id.increaseTeam2:
                    mScore2++;
                    mScoreText2.setText(Integer.toString(mScore2));

        }
    }
}
