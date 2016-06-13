package com.example.gabriel.habitsquare;

import java.util.ArrayList;

/**
 * Created by gab on 13/06/2016.
 */
public class Habits {
    private final ArrayList<Habit> habits = new ArrayList<>();

    public Habits() {
    }

    public void addHabit(Habit habit) {
        habits.add(habit);
    }

    public int size() {
        return habits.size();
    }
}
