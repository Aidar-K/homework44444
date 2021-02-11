package com.geektech.homework44444;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    ArrayList<RecView> titleList;
    Context context;

    public MainAdapter(ArrayList<RecView> list, Context context) {
        list = new ArrayList<>();
        this.titleList = list;
        this.context = context;   {


        }
    }

    public void addText(RecView title) {
        titleList.add(title);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_list, parent, false);

        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(titleList.get(position),position + 1);
    }

    @Override
    public int getItemCount() {
        return titleList.size();
    }


}
