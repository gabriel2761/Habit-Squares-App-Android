package com.example.gabriel.habitsquare;

import java.util.ArrayList;

/**
 * Created by gab on 13/06/2016.
 */
public class Habit {
    private final String name;
    private final ArrayList<Square> squares = new ArrayList<>();

    public Habit(String name) {
        this.name = name;
    }

    public void addSquare(Square square) {
        squares.add(square);
    }

    public String getName() {
        return name;
    }

    public int size() {
        return squares.size();
    }
}
