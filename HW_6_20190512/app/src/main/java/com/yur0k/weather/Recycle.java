package com.yur0k.weather;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Recycle extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle);

        RecyclerView recyclerView = findViewById(R.id.history);
        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));

        MyAdapter adapter = new MyAdapter();
        recyclerView.setAdapter(adapter);
    }
}
