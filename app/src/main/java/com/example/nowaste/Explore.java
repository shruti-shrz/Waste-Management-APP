package com.example.nowaste;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Explore extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);
        BottomNavigationView bottomNavigationView = findViewById(R.id.nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new home()).commit();
    }

    BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            Fragment selectedfrag = null;
            switch(menuItem.getItemId())
            {
                case R.id.home:
                    selectedfrag = new home();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,selectedfrag).commit();
                    break;
                case R.id.sell:
                    final Intent k = new Intent(Explore.this,SellActivity.class);
                    startActivity(k);
                    break;
                case R.id.account:
                    selectedfrag = new account();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,selectedfrag).commit();
                    break;
            }
            return true;
        }
    };
}
