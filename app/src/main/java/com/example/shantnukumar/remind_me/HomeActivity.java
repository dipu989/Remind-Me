package com.example.shantnukumar.remind_me;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listView = findViewById(R.id.listView);
        ArrayList<String> tasks = new ArrayList<>();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,tasks);
        listView.setAdapter(arrayAdapter);
        tasks.add("Get this app ready!");

        if (arrayAdapter.getCount() == 0) {

            tasks.add("Add Tasks");
        }
    }
}
