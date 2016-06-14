package com.example.gabriel.habitsquare;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class CreateHabitActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mHabitTitleEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_habit);

        mHabitTitleEditText = (EditText) findViewById(R.id.habit_title_edittext);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.create_habit_fab);
        fab.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String habittitle = mHabitTitleEditText.getText().toString().trim();
        if (TextUtils.isEmpty(habittitle)) {
            mHabitTitleEditText.setError("Must not be empty");
        } else {
            
        }
    }
}
