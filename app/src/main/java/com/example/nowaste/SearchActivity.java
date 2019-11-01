package com.example.nowaste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {
SearchView mysearch;
ListView listView;
ArrayList<String> mylist;
ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        mysearch = (SearchView)findViewById(R.id.search2);
        listView = (ListView)findViewById(R.id.list);
        mylist = new ArrayList<String>();
        mylist.add("Alluminium Rod");
        mylist.add("Books");
        mylist.add("Computer");
        mylist.add("Food Waste");
        mylist.add("Connecting wires");
        mylist.add("Iron rod");
        mylist.add("Metal Can");
        mylist.add("Oven");
        mylist.add("Paper Waste");
        mylist.add("Plastic Bottle");
        mylist.add("Plastic Cover");
        mylist.add("Plastic Furniture");
        mylist.add("Plywood");
        mylist.add("Plastic Toys");
        mylist.add("Refrigerator");
        mylist.add("Syringe");
        mylist.add("Steel rod");
        mylist.add("Utensils");
        mylist.add("Wooden Furniture");
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,mylist);
        listView.setAdapter(adapter);
        mysearch.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
    }
}
