package com.spurs.listviewcustompractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Custom> customs=new ArrayList<>();

    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listview);

        customs.add(new Custom(R.drawable.elephant,"코끼리","100kg","2m","12살"));
        customs.add(new Custom(R.drawable.giraffe,"코끼리","100kg","2m","12살"));
        customs.add(new Custom(R.drawable.hippo,"코끼리","100kg","2m","12살"));
        customs.add(new Custom(R.drawable.monkey,"코끼리","100kg","2m","12살"));
        customs.add(new Custom(R.drawable.panda,"코끼리","100kg","2m","12살"));
        customs.add(new Custom(R.drawable.parrot,"코끼리","100kg","2m","12살"));
        customs.add(new Custom(R.drawable.penguin,"코끼리","100kg","2m","12살"));
        customs.add(new Custom(R.drawable.pig,"코끼리","100kg","2m","12살"));
        customs.add(new Custom(R.drawable.rabbit,"코끼리","100kg","2m","12살"));
        customs.add(new Custom(R.drawable.snake,"코끼리","100kg","2m","12살"));

        LayoutInflater inflater=getLayoutInflater();
        adapter=new MyAdapter(customs,inflater);
        listView.setAdapter(adapter);
    }
}
