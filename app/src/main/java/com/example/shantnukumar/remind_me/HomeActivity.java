package com.example.shantnukumar.remind_me;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    ListView listView;
    String result;
    TextView textView;
    ImageButton button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listView = findViewById(R.id.listView);
        button = (ImageButton) findViewById(R.id.addTask);
        ArrayList<String> tasks = new ArrayList<>();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,tasks);
        listView.setAdapter(arrayAdapter);
        tasks.add("Get this app ready!");

        if (arrayAdapter.getCount() == 0) {

            tasks.add("Add Tasks");
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(getApplicationContext(), "Position "+position,Toast.LENGTH_SHORT).show();
                }
            });

        } else {

        }
    }

    public void addTask(View view) {

        Intent intent = new Intent(getApplicationContext(),TaskActivity.class);
        startActivity(intent);
    }
}
