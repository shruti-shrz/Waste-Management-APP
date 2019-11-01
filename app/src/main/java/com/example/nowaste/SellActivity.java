package com.example.nowaste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class SellActivity extends AppCompatActivity {
    ListView listView;
    ArrayAdapter adapter;
    ImageView imagee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell);
        final ArrayList<Word> list = new ArrayList<>();
        list.add(new Word("Recyclable Waste",R.drawable.plastic));
        list.add(new Word("Electronic Waste",R.drawable.electronic));
        list.add(new Word("Organic Waste",R.drawable.food));
        list.add(new Word("Inert Waste",R.drawable.inert));
        list.add(new Word("Hazardous Waste",R.drawable.hazard));
        list.add(new Word("Textile Waste",R.drawable.cloth));
        list.add(new Word("Metal Waste",R.drawable.metal));
        list.add(new Word("Pharmaceutical Waste",R.drawable.medicalcat));

       // imagee.setImageResource(currentword.getImage());
       // list.add();
        listView = findViewById(R.id.slist);
        adapter adapt = new adapter(this,list);
        ListView listView = findViewById(R.id.slist);
        listView.setAdapter(adapt);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            if(position==0)
            {
                final Intent p = new Intent(SellActivity.this,PlasticActivity.class);
                startActivity(p);
            }else
                if(position==2)
                {
                    final Intent p = new Intent(SellActivity.this,BiodegradableActivity.class);
                    startActivity(p);
                }
            }
        });
    }

}
