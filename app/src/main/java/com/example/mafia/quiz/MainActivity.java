package com.example.mafia.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private TextView mButton1Choice;
    private TextView mButton2Choice;
    private TextView mButton3Choice;

    private String mAnswer;
    private int mScore=0;
    private int mQuestionNumber=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreView=(TextView)findViewById(R.id.score);
        mQuestionView=(TextView)findViewById(R.id.Question);
        mButton1Choice=(TextView)findViewById(R.id.Choice1);
        mButton2Choice=(TextView)findViewById(R.id.Choice2);
        mButton3Choice=(TextView)findViewById(R.id.Choice3);

        mButton1Choice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButton1Choice.getText() == mAnswer) {
                    mScore = mScore - 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();

                }
            }
        });

        mButton2Choice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButton2Choice.getText() == mAnswer) {
                    mScore = mScore - 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();

                }
            }
        });

        mButton3Choice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButton3Choice.getText() == mAnswer) {
                    mScore = mScore - 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();

                }
            }
        });




    }



    private void updateQuestion()
    {
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButton1Choice.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButton2Choice.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButton3Choice.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

        mAnswer=mQuestionLibrary.getCorrectAnsweres(mQuestionNumber);
        mQuestionNumber++;
    };

    private void updateScore(int point)
    {
        mScoreView.setText(" "+mScore);
    }
};

