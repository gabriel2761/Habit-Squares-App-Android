package com.example.gabriel.habitsquare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Habits habits = new Habits();
        Habit brushTeeth = new Habit("Brush Teeth");
        brushTeeth.addSquare(new Square());
        habits.addHabit(brushTeeth);
        habits.addHabit(new Habit("Practise Skating"));

        RecyclerView habitList = (RecyclerView) findViewById(R.id.habit_list);
        habitList.setHasFixedSize(true);
        habitList.setLayoutManager(new LinearLayoutManager(this));
        habitList.setAdapter(new HabitAdapter(this, habits));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.new_habit:
                startCreateHabitActivity();
        }

        return super.onOptionsItemSelected(item);
    }

    public void startCreateHabitActivity() {
        Intent intent = new Intent(this, CreateHabitActivity.class);
        startActivity(intent);
    }
}
