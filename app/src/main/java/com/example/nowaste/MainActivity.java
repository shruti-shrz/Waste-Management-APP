package com.example.nowaste;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
SQLiteOpenHelper openHelper;
SQLiteDatabase db;
Button b;
EditText fname, lname, pass, email, ph;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openHelper = new databaseh(this);
        b = (Button)findViewById(R.id.bu1);
        fname = (EditText)findViewById(R.id.editfname);
        lname = (EditText)findViewById(R.id.editlname);
        pass = (EditText)findViewById(R.id.editpass);
        email = (EditText)findViewById(R.id.editemail);
        ph = (EditText)findViewById(R.id.editnum);
        final Intent i = new Intent(this,Explore.class);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db = openHelper.getWritableDatabase();
                String f = fname.getText().toString();
                String l = lname.getText().toString();
                String p = pass.getText().toString();
                String e = email.getText().toString();
                String phone = ph.getText().toString();
               boolean isinserted =  InsertData(f,l,p,e,phone);
               if(isinserted==true)
               {Toast.makeText(getApplicationContext(),"SignUp Successfully",Toast.LENGTH_SHORT).show();}
               else
               {Toast.makeText(getApplicationContext(),"not saved",Toast.LENGTH_SHORT).show();}
                startActivity(i);


            }

        });


    }
    public boolean InsertData(String f, String l,String p,String e,String phone)
    {
        ContentValues contentValues = new ContentValues();
        contentValues.put(databaseh.Col_2,f);
        contentValues.put(databaseh.Col_3,l);
        contentValues.put(databaseh.Col_4,p);
        contentValues.put(databaseh.Col_5,e);
        contentValues.put(databaseh.Col_6,phone);
        long id = db.insert(databaseh.Table_Name,null, contentValues);
        if(id==-1)
            return false;
        else
        return true;
    }
}
