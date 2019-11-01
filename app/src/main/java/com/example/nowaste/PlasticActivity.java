package com.example.nowaste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PlasticActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> mylistR;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plastic);
        listView = findViewById(R.id.rlist);
        mylistR = new ArrayList<>();
        mylistR.add("Paper");
        mylistR.add("Plastic Bottle");
        mylistR.add("Plastic Cover");
        mylistR.add("Plastic Furniture");
        mylistR.add("Cardboard");
        mylistR.add("Glass");
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,mylistR);
        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if(position==1)
//                {
//                    final Intent p = new Intent(PlasticActivity.this,PlasticActivity.class);
//                    startActivity(p);
//                }
//
//            }
//        });
    }

}
