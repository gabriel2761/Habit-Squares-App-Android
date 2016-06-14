package com.example.gabriel.habitsquare;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
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
            mHabitTitleEditText.setError("this ");
        } else {
            Snackbar.make(v, "This works", Snackbar.LENGTH_LONG).show();
        }
    }
}
