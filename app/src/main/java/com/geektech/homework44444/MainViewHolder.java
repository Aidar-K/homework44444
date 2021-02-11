package com.geektech.homework44444;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainViewHolder extends RecyclerView.ViewHolder {
    TextView textView;
    TextView date;
    TextView number;
    TextView textView1;
    RecView recView;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.first_tv);
        textView1 = itemView.findViewById(R.id.second_tv);
        date = itemView.findViewById(R.id.date);
        number = itemView.findViewById(R.id.number);

    }

    public void onBind(RecView recView , int i) {
        this.recView = recView;
        textView.setText(recView.title);
        textView1.setText(recView.sub);
        number.setText(String.valueOf(i));
        date.setText(getDate(recView.getDate()));
    }

    private String getDate(Date date){
        DateFormat dateFor = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String num = dateFor.format(date);
        return num;
    }


}
