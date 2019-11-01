package com.example.nowaste;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.SearchView;

public class home extends Fragment {
    SearchView searchView;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        RelativeLayout relative = (RelativeLayout) inflater.inflate(R.layout.home_fragment,container,false);
       searchView = relative.findViewById(R.id.search);
       final Intent j = new Intent(getActivity(),SearchActivity.class);
       searchView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                  startActivity(j);
           }
       });

       return relative;
    }


}
