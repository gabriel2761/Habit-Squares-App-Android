package com.example.gabriel.habitsquare;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class HabitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habit);

        Habit habit = (Habit) getIntent().getParcelableExtra(Constant.HABIT_DETAILS);

        TextView title = (TextView) findViewById(R.id.habit_activity_title);
        title.setText(habit.getName());
    }
}
