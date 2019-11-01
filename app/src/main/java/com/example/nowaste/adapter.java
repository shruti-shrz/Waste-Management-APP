package com.example.nowaste;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class adapter extends ArrayAdapter<Word> {
    public adapter(Context context, ArrayList<Word> lists) {
        super(context,0,lists);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listviewitem = convertView;
        if (listviewitem == null) {
            listviewitem = LayoutInflater.from(getContext()).inflate(R.layout.liststyle, parent, false);
        }
        Word currentword = getItem(position);
        TextView a = listviewitem.findViewById(R.id.txt);
        a.setText(currentword.getTitle());
        ImageView m = listviewitem.findViewById(R.id.icon);
        m.setImageResource(currentword.getimg());
        return listviewitem;
    }
}
