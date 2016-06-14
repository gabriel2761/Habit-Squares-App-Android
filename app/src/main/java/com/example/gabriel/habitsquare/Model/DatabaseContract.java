package com.example.gabriel.habitsquare.Model;

import android.provider.BaseColumns;

/**
 * Created by gab on 15/06/2016.
 */
public class DatabaseContract {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "habits.db";
    private static final String TEXT_TYPE = " TEXT";
    private static final String INTEGER_TYPE = " INTEGER";
    private static final String COMMA_SEP = ",";

    // Suppress Instantiation
    private DatabaseContract() {}

    public static abstract class HabitTable implements BaseColumns {
        public static final String TABLE_NAME = "habittable";
        public static final String HABIT_TITLE = "habittitle";

        public static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY," +
                        HABIT_TITLE + TEXT_TYPE + COMMA_SEP +
                        ")";
        public static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + TABLE_NAME;

    }
}
