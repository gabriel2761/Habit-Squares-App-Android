package com.example.gabriel.habitsquare;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

public class HabitAdapter extends RecyclerView.Adapter<HabitAdapter.ViewHolder> {

    private final Habits mHabits;
    private final Context mContext;

    public HabitAdapter(Context context, Habits habits) {
        mHabits = habits;
        mContext = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView mHabitTitle;
        final GridView mGridView;
        final CardView mCardView;
        final View mTouchOverlay;
        final Context mContext;

        public ViewHolder(View view) {
            super(view);
            mHabitTitle = (TextView) view.findViewById(R.id.habit_title);
            mGridView = (GridView) view.findViewById(R.id.gridview);
            mCardView = (CardView) view.findViewById(R.id.habit_cardview);
            mTouchOverlay = view.findViewById(R.id.cardview_overlay_listener);
            mContext = view.getContext();
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.habit_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.mHabitTitle.setText(mHabits.getHabit(position).getName());
        holder.mGridView.setAdapter(new ImageAdapter(holder.mContext, mHabits.getHabit(position)));

        holder.mTouchOverlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, HabitActivity.class);
                Activity activity = (Activity) mContext;
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mHabits.size();
    }

}
