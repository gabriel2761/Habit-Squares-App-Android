package com.example.gabriel.habitsquare;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by gab on 13/06/2016.
 */
public class Habit implements Parcelable {
    private final String name;
    private final ArrayList<Square> squares = new ArrayList<>();

    public Habit(String name) {
        this.name = name;
    }

    protected Habit(Parcel in) {
        name = in.readString();
    }

    public static final Creator<Habit> CREATOR = new Creator<Habit>() {
        @Override
        public Habit createFromParcel(Parcel in) {
            return new Habit(in);
        }

        @Override
        public Habit[] newArray(int size) {
            return new Habit[size];
        }
    };

    public void addSquare(Square square) {
        squares.add(square);
    }

    public String getName() {
        return name;
    }

    public int size() {
        return squares.size();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
    }
}
