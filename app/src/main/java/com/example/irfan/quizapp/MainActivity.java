package com.example.irfan.quizapp;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.RadioGroup;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg1, rg2, rg3, rg5, rg6, rg8, rg9, rg10;
    RadioButton rb1, rb2, rb3, rb5, rb6, rb8, rb9, rb10;
    CheckBox cb1, cb2, cb3, cb4;
    EditText et;
    int finalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg1 = (RadioGroup) findViewById(R.id.question_one_rg);
        rg2 = (RadioGroup) findViewById(R.id.question_two_rg);
        rg3 = (RadioGroup) findViewById(R.id.question_three_rg);
        rg5 = (RadioGroup) findViewById(R.id.question_five_rg);
        rg6 = (RadioGroup) findViewById(R.id.question_six_rg);
        rg8 = (RadioGroup) findViewById(R.id.question_eight_rg);
        rg9 = (RadioGroup) findViewById(R.id.question_nine_rg);
        rg10 = (RadioGroup) findViewById(R.id.question_ten_rg);

        rb1 = (RadioButton) findViewById(R.id.q_one_a);
        rb2 = (RadioButton) findViewById(R.id.q_two_a);
        rb3 = (RadioButton) findViewById(R.id.q_three_c);
        cb1 = (CheckBox) findViewById(R.id.q_four_b);
        cb2 = (CheckBox) findViewById(R.id.q_four_c);
        cb3 = (CheckBox) findViewById(R.id.q_four_a);
        cb4 = (CheckBox) findViewById(R.id.q_four_d);
        rb5 = (RadioButton) findViewById(R.id.q_five_b);
        rb6 = (RadioButton) findViewById(R.id.q_six_d);
        et = (EditText) findViewById(R.id.image_answer);
        rb8 = (RadioButton) findViewById(R.id.q_eight_d);
        rb9 = (RadioButton) findViewById(R.id.q_nine_a);
        rb10 = (RadioButton) findViewById(R.id.q_ten_a);
    }

    public void submitGame(View view) {
        if (rb1.isChecked()) finalScore += 1;
        if (rb2.isChecked()) finalScore += 1;
        if (rb3.isChecked()) finalScore += 1;
        if (cb1.isChecked() && cb2.isChecked()) finalScore += 1;
        if (rb5.isChecked()) finalScore += 1;
        if (rb6.isChecked()) finalScore += 1;
        String answer = et.getText().toString();
        if (answer.equals("tensor flow") || answer.equals("Tensor Flow") || answer.equals("TensorFlow"))
            finalScore += 1;
        if (rb8.isChecked()) finalScore += 1;
        if (rb9.isChecked()) finalScore += 1;
        if (rb10.isChecked()) finalScore += 1;

        if (finalScore > 0) {
            final Toast myToast = Toast.makeText(MainActivity.this, "Your score is: " + finalScore, Toast.LENGTH_SHORT);
            myToast.show();
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    myToast.cancel();
                }
            }, 10000);
        } else {
            final Toast myToast = Toast.makeText(MainActivity.this, "Your score is 0. Please read the questions carefully and try again. Good luck!: ", Toast.LENGTH_SHORT);
            myToast.show();
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    myToast.cancel();
                }
            }, 10000);
        }
    }

    private void reset() {
        rg1.clearCheck();
        rg2.clearCheck();
        rg3.clearCheck();
        cb1.setChecked(false);
        cb2.setChecked(false);
        cb3.setChecked(false);
        cb4.setChecked(false);
        rg5.clearCheck();
        rg6.clearCheck();
        et.setText("");
        rg8.clearCheck();
        rg9.clearCheck();
        rg10.clearCheck();

    }

    /*Reset game score and clear answers*/
    public void resetGame(View view) {
        finalScore = 0;
        reset();
    }
}
