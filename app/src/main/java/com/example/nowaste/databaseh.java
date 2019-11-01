package com.example.nowaste;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class databaseh extends SQLiteOpenHelper{

        public static final String DataBase_Name = "register.db";
        public static final String Table_Name = "register";
        public static final String Table_Name2 = "sell";
        public static final String Col_1 = "ID";
        public static final String col_1 = "ID2";
        public static final String Col_2 = "FirstName";
        public static final String col_2 = "title";
        public static final String Col_3 = "LastName";
    public static final String col_3 = "price";
        public static final String Col_4 = "Password";
    public static final String col_4 = "detail";
        public static final String Col_5 = "Email";
        public static final String Col_6 = "Phone";
    public databaseh(Context context) {
        super(context, DataBase_Name, null, 1);
    }

        @Override
        public void onCreate (SQLiteDatabase db){
        String create_Table = "CREATE TABLE " + Table_Name + "(ID INTEGER PRIMARY KEY AUTOINCREMENT,FirstName Text,LastName Text,Password Text,Email Text,Phone Text)";
        String create_Table2 = "CREATE TABLE " + Table_Name2 + "(ID2 INTEGER PRIMARY KEY AUTOINCREMENT,title Text,price Text,detail Text)";

        db.execSQL(create_Table);
        db.execSQL(create_Table2);
    }


        @Override
        public void onUpgrade (SQLiteDatabase db,int oldVersion, int newVersion){

        db.execSQL("Drop Table if EXISTS " + Table_Name);
        db.execSQL("Drop Table if EXISTS " + Table_Name2);
        onCreate(db);
    }
    }

