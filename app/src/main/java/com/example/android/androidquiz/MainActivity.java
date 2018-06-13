package com.example.android.androidquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //declare the views found in the quiz
    RadioButton question_one, question_three, question_seven, question_nine;
    CheckBox question_two_choice1, question_two_choice2,
            question_two_choice3, question_two_choice4,
            question_five_choice1, question_five_choice2,
            question_five_choice3, question_five_choice4,
            question_ten_choice1, question_ten_choice2,
            question_ten_choice3, question_ten_choice4;
    EditText    name_field, question_four, question_six, question_eight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide the keyboard
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
    }

    //call on the menu methods
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.mymenus, menu);
        return true;
    }

    //call on the options item selected method for the menu
    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        int id = item.getItemId();
        return id == R.id.action_settings;
    }

    public void submitAnswers(View view){
        // declare scores for each question
        int score1, score2, score3, score4, score5,
                score6, score7, score8, score9, score10, final_score;
        String resultsGotten;

        //get the name of the person taking the quiz
        name_field = findViewById(R.id.edit_Text1);
        String name = name_field.getText().toString();

        //know when the correct option is selected from the radio group and give a score
        Boolean answer1;
        question_one    = findViewById(R.id.first_question_choice1);
        answer1 = question_one.isChecked();
        if (answer1) {
            score1 = 1;
        } else {
            score1 = 0;
        }

        //know when the correct options are been selected from checkbox and give score
        Boolean question2_checkBox_choice1;
        Boolean question2_checkBox_choice2;
        Boolean question2_checkBox_choice3;
        Boolean question2_checkBox_choice4;
        question_two_choice1 = findViewById(R.id.second_question_checkbox1);
        question_two_choice2 = findViewById(R.id.second_question_checkbox2);
        question_two_choice3 = findViewById(R.id.second_question_checkbox3);
        question_two_choice4 = findViewById(R.id.second_question_checkbox4);
        question2_checkBox_choice1 = question_two_choice1.isChecked();
        question2_checkBox_choice2 = question_two_choice2.isChecked();
        question2_checkBox_choice3 = question_two_choice3.isChecked();
        question2_checkBox_choice4 = question_two_choice4.isChecked();
        if(question2_checkBox_choice1 && question2_checkBox_choice2 && question2_checkBox_choice3 && ! question2_checkBox_choice4){
            score2 = 1;
        }else {
            score2 = 0;
        }

        //know when the correct option is selected from the radio group and give a score
        Boolean answer3;
        question_three    = findViewById(R.id.third_question_choice1);
        answer3 = question_three.isChecked();
        if (answer3) {
            score3 = 1;
        } else {
            score3 = 0;
        }

        //get the text that was typed into the edit text and check if it is correct
        String answer4;
        question_four = findViewById(R.id.fourt_question_EditText);
        answer4 = question_four.getText().toString().toLowerCase();
        if (answer4.equals("setting properties of elements")) {
            score4 = 1;
        } else {
            score4 = 0;
        }

        //know when the correct options are been selected from checkbox and give score
        Boolean question5_checkBox_choice1;
        Boolean question5_checkBox_choice2;
        Boolean question5_checkBox_choice3;
        Boolean question5_checkBox_choice4;
        question_five_choice1 = findViewById(R.id.fifth_question_checkbox1);
        question_five_choice2 = findViewById(R.id.fifth_question_checkbox2);
        question_five_choice3 = findViewById(R.id.fifth_question_checkbox3);
        question_five_choice4 = findViewById(R.id.fifth_question_checkbox4);
        question5_checkBox_choice1 = question_five_choice1.isChecked();
        question5_checkBox_choice2 = question_five_choice2.isChecked();
        question5_checkBox_choice3 = question_five_choice3.isChecked();
        question5_checkBox_choice4 = question_five_choice4.isChecked();
        if(question5_checkBox_choice1 && question5_checkBox_choice2 && question5_checkBox_choice3 && ! question5_checkBox_choice4){
            score5 = 1;
        }else {
            score5 = 0;
        }

        //get the text that was typed into the edit text and check if it is correct
        String answer6;
        question_six = findViewById(R.id.sixth_question_EditText);
        answer6 = question_six.getText().toString().toLowerCase();
        if (answer6.equals("density independent pixels")) {
            score6 = 1;
        } else {
            score6 = 0;
        }

        //know when the correct option is selected from the radio group and give a score
        Boolean answer7;
        question_seven    = findViewById(R.id.seventh_question_choice1);
        answer7 = question_seven.isChecked();
        if (answer7) {
            score7 = 1;
        } else {
            score7 = 0;
        }

        //get the text that was typed into the edit text and check if it is correct
        String answer8;
        question_eight = findViewById(R.id.eight_question_EditText);
        answer8 = question_eight.getText().toString().toLowerCase();
        if (answer8.equals("vertical and horizontal")) {
            score8 = 1;
        } else {
            score8 = 0;
        }

        //know when the correct option is selected from the radio group and give a score
        Boolean answer9;
        question_nine    = findViewById(R.id.ninth_question_choice1);
        answer9 = question_nine.isChecked();
        if (answer9) {
            score9 = 1;
        } else {
            score9 = 0;
        }

        //know when the correct options are been selected from checkbox and give score
        Boolean question10_checkBox_choice1;
        Boolean question10_checkBox_choice2;
        Boolean question10_checkBox_choice3;
        Boolean question10_checkBox_choice4;
        question_ten_choice1 = findViewById(R.id.tenth_question_checkbox1);
        question_ten_choice2 = findViewById(R.id.tenth_question_checkbox2);
        question_ten_choice3 = findViewById(R.id.tenth_question_checkbox3);
        question_ten_choice4 = findViewById(R.id.tenth_question_checkbox4);
        question10_checkBox_choice1 = question_ten_choice1.isChecked();
        question10_checkBox_choice2 = question_ten_choice2.isChecked();
        question10_checkBox_choice3 = question_ten_choice3.isChecked();
        question10_checkBox_choice4 = question_ten_choice4.isChecked();
        if(question10_checkBox_choice1 && question10_checkBox_choice2 && ! question10_checkBox_choice3 &&  question10_checkBox_choice4){
            score10 = 1;
        }else {
            score10 = 0;
        }

        // Final Score
        final_score = score1 + score2 + score3 +score4 + score5 +
                score6 + score7 + score8 + score9 + score10;

        if (final_score == 10) {
            resultsGotten = "Great Performance! You scored 10 out of 10";
        } else {
            resultsGotten = "Try again. You scored " + final_score + " out of 10";
        }

        Toast.makeText(this, "Dear "+name + "\n" +resultsGotten, Toast.LENGTH_LONG).show();

    }

    public void resetQuiz(View view){
        //make the nameEditText blank
        name_field.setText("");

        //make the questionFourEditText blank
        question_four.setText("");

        //make the questionSixEditText blank
        question_six.setText("");

        //make the questionEightEditText blank
        question_eight.setText("");

        //set questionTwoCheckBox to unchecked
        question_two_choice1.setChecked(false);
        question_two_choice2.setChecked(false);
        question_two_choice3.setChecked(false);
        question_two_choice4.setChecked(false);

        //set questionFiveCheckBox to unchecked
        question_five_choice1.setChecked(false);
        question_five_choice2.setChecked(false);
        question_five_choice3.setChecked(false);
        question_five_choice4.setChecked(false);

        //set questionTenCheckBox to unchecked
        question_ten_choice1.setChecked(false);
        question_ten_choice2.setChecked(false);
        question_ten_choice3.setChecked(false);
        question_ten_choice4.setChecked(false);

        //set questionOneRadioButton to unchecked
        question_one.setChecked(false);

        //set questionOneRadioButtonRemainingOptions to unchecked
        RadioButton question_one_opt2 = findViewById(R.id.first_question_choice2);
        question_one_opt2.setChecked(false);
        RadioButton question_one_opt3 = findViewById(R.id.first_question_choice3);
        question_one_opt3.setChecked(false);
        RadioButton question_one_opt4 = findViewById(R.id.first_question_choice4);
        question_one_opt4.setChecked(false);

        //set questionThreeRadioButton to unchecked
        question_three.setChecked(false);

        //set questionThreeRadioButtonRemainingOptions to unchecked
        RadioButton question_three_opt2 = findViewById(R.id.third_question_choice2);
        question_three_opt2.setChecked(false);

        //set questionSevenRadioButton to unchecked
        question_seven.setChecked(false);

        //set questionSevenRadioButtonRemainingOptions to unchecked
        RadioButton question_seven_opt2 = findViewById(R.id.seventh_question_choice2);
        question_seven_opt2.setChecked(false);
        RadioButton question_seven_opt3 = findViewById(R.id.seventh_question_choice3);
        question_seven_opt3.setChecked(false);
        RadioButton question_seven_opt4 = findViewById(R.id.seventh_question_choice4);
        question_seven_opt4.setChecked(false);

        //set questionNineRadioButton to unchecked
        question_nine.setChecked(false);

        //set questionNineRadioButtonRemainingOptions to unchecked
        RadioButton question_nine_opt2 = findViewById(R.id.ninth_question_choice2);
        question_nine_opt2.setChecked(false);
    }

}
