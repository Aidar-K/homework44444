package com.geektech.homework44444;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    MainAdapter adapter;
    List<RecView> titleList;
    Button button;
    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        recyclerView = findViewById(R.id.recyclerView);
        button = findViewById(R.id.button);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        titleList = new ArrayList<>();
        adapter = new MainAdapter((ArrayList<RecView>) titleList, this);
        recyclerView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = editText1.getText().toString();
                String sub = editText2.getText().toString();
                RecView rv = new RecView();
                rv.setTitle(title);
                rv.setSub(sub);
                rv.setDate(new Date(System.currentTimeMillis()));
                adapter.addText(rv);
                titleList.add(rv);
            }
        });
    }
}