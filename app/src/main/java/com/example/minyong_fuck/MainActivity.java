package com.example.minyong_fuck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list);
        ArrayList<ItemList> items = new ArrayList<>();

        items.add(new ItemList("나인채", "010-1234-4444"));
        items.add(new ItemList("이민용", "010-5678-8888"));
        items.add(new ItemList("오현택", "010-4444-4321"));


        MyAdapter adpater = new MyAdapter(items, this);
        listView.setAdapter(adpater);
    }
}
