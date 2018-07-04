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
    RadioButton rb1_a, rb1_b, rb1_c, rb1_d,
            rb2_a, rb2_b, rb2_c, rb2_d,
            rb3_a, rb3_b, rb3_c, rb3_d,
            rb5_a, rb5_b, rb5_c, rb5_d,
            rb6_a, rb6_b, rb6_c, rb6_d,
            rb8_a, rb8_b, rb8_c, rb8_d,
            rb9_a, rb9_b, rb9_c, rb9_d,
            rb10_a, rb10_b, rb10_c, rb10_d;

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

        rb1_a = (RadioButton) findViewById(R.id.q_one_a);
        rb1_b = (RadioButton) findViewById(R.id.q_one_b);
        rb1_c = (RadioButton) findViewById(R.id.q_one_c);
        rb1_d = (RadioButton) findViewById(R.id.q_one_d);

        rb2_a = (RadioButton) findViewById(R.id.q_two_a);
        rb2_b = (RadioButton) findViewById(R.id.q_two_b);
        rb2_c = (RadioButton) findViewById(R.id.q_two_c);
        rb2_d = (RadioButton) findViewById(R.id.q_two_d);

        rb3_a = (RadioButton) findViewById(R.id.q_three_a);
        rb3_b = (RadioButton) findViewById(R.id.q_three_b);
        rb3_c = (RadioButton) findViewById(R.id.q_three_c);
        rb3_d = (RadioButton) findViewById(R.id.q_three_d);


        cb1 = (CheckBox) findViewById(R.id.q_four_a);
        cb2 = (CheckBox) findViewById(R.id.q_four_b);
        cb3 = (CheckBox) findViewById(R.id.q_four_c);
        cb4 = (CheckBox) findViewById(R.id.q_four_d);


        rb5_a = (RadioButton) findViewById(R.id.q_five_a);
        rb5_b = (RadioButton) findViewById(R.id.q_five_b);
        rb5_c = (RadioButton) findViewById(R.id.q_five_c);
        rb5_d = (RadioButton) findViewById(R.id.q_five_d);

        rb6_a = (RadioButton) findViewById(R.id.q_six_a);
        rb6_b = (RadioButton) findViewById(R.id.q_six_b);
        rb6_c = (RadioButton) findViewById(R.id.q_six_c);
        rb6_d = (RadioButton) findViewById(R.id.q_six_d);

        et = (EditText) findViewById(R.id.image_answer);

        rb8_a = (RadioButton) findViewById(R.id.q_eight_a);
        rb8_b = (RadioButton) findViewById(R.id.q_eight_b);
        rb8_c = (RadioButton) findViewById(R.id.q_eight_c);
        rb8_d = (RadioButton) findViewById(R.id.q_eight_d);

        rb9_a = (RadioButton) findViewById(R.id.q_nine_a);
        rb9_b = (RadioButton) findViewById(R.id.q_nine_b);
        rb9_c = (RadioButton) findViewById(R.id.q_nine_c);
        rb9_d = (RadioButton) findViewById(R.id.q_nine_d);

        rb10_a = (RadioButton) findViewById(R.id.q_ten_a);
        rb10_b = (RadioButton) findViewById(R.id.q_ten_b);
        rb10_c = (RadioButton) findViewById(R.id.q_ten_c);
        rb10_d = (RadioButton) findViewById(R.id.q_ten_d);
    }

    public void submitGame(View view) {
        if (rb1_a.isChecked()) {
            finalScore += 1;
        } else if (rb1_b.isChecked()) {
            finalScore += 0;
        } else if (rb1_c.isChecked()) {
            finalScore += 0;
        } else if (rb1_d.isChecked()) {
            finalScore += 0;
        }

        if (rb2_a.isChecked()) {
            finalScore += 1;
        } else if (rb2_b.isChecked()) {
            finalScore += 0;
        } else if (rb2_c.isChecked()) {
            finalScore += 0;
        } else if (rb2_d.isChecked()) {
            finalScore += 0;
        }

        if (rb3_a.isChecked()) {
            finalScore += 0;
        } else if (rb3_b.isChecked()) {
            finalScore += 0;
        } else if (rb3_c.isChecked()) {
            finalScore += 1;
        } else if (rb3_d.isChecked()) {
            finalScore += 0;
        }

        if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()) {
            finalScore += 0;
        } else if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked()) {
            finalScore += 0;
        } else if (cb1.isChecked() && cb2.isChecked() && cb4.isChecked()) {
            finalScore += 0;
        } else if (cb2.isChecked() && cb3.isChecked() && cb4.isChecked()) {
            finalScore += 0;
        } else if (cb1.isChecked() && cb3.isChecked() && cb4.isChecked()) {
            finalScore += 0;
        } else if (cb1.isChecked() && cb2.isChecked()) {
            finalScore += 0;
        } else if (cb1.isChecked() && cb3.isChecked()) {
            finalScore += 0;
        } else if (cb1.isChecked() && cb4.isChecked()) {
            finalScore += 0;
        } else if (cb2.isChecked() && cb3.isChecked()) {
            finalScore += 1;
        } else if (cb2.isChecked() && cb4.isChecked()) {
            finalScore += 0;
        } else if (cb4.isChecked() && cb3.isChecked()) {
            finalScore += 0;
        }


        if (rb5_a.isChecked()) {
            finalScore += 0;
        } else if (rb5_b.isChecked()) {
            finalScore += 1;
        } else if (rb5_c.isChecked()) {
            finalScore += 0;
        } else if (rb5_d.isChecked()) {
            finalScore += 0;
        }

        if (rb6_a.isChecked()) {
            finalScore += 0;
        } else if (rb6_b.isChecked()) {
            finalScore += 0;
        } else if (rb6_c.isChecked()) {
            finalScore += 0;
        } else if (rb6_d.isChecked()) {
            finalScore += 1;
        }

        String answer = et.getText().toString();
        if (answer.equals("tensor flow") || answer.equals("Tensor Flow") || answer.equals("TensorFlow"))
            finalScore += 1;

        if (rb8_a.isChecked()) {
            finalScore += 0;
        } else if (rb8_b.isChecked()) {
            finalScore += 0;
        } else if (rb8_c.isChecked()) {
            finalScore += 0;
        } else if (rb8_d.isChecked()) {
            finalScore += 1;
        }

        if (rb9_a.isChecked()) {
            finalScore += 1;
        } else if (rb9_b.isChecked()) {
            finalScore += 0;
        } else if (rb9_c.isChecked()) {
            finalScore += 0;
        } else if (rb9_d.isChecked()) {
            finalScore += 0;
        }

        if (rb10_a.isChecked()) {
            finalScore += 1;
        } else if (rb10_b.isChecked()) {
            finalScore += 0;
        } else if (rb10_c.isChecked()) {
            finalScore += 0;
        } else if (rb10_d.isChecked()) {
            finalScore += 0;
        }

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
