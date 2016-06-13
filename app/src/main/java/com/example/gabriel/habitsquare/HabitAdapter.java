package com.example.gabriel.habitsquare;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

public class HabitAdapter extends RecyclerView.Adapter<HabitAdapter.ViewHolder> {

    private final Habits mHabits;

    public HabitAdapter(Habits habits) {
        mHabits = habits;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView mHabitTitle;
        final GridView mGridView;
        final Context mContext;

        public ViewHolder(View view) {
            super(view);
            mHabitTitle = (TextView) view.findViewById(R.id.habit_title);
            mGridView = (GridView) view.findViewById(R.id.gridview);
            mContext = view.getContext();
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.habit_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mHabitTitle.setText(mHabits.getHabit(position).getName());
        holder.mGridView.setAdapter(new ImageAdapter(holder.mContext, mHabits.getHabit(position)));
    }

    @Override
    public int getItemCount() {
        return mHabits.size();
    }

}
