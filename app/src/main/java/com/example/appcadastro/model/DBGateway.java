package com.example.appcadastro.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DBGateway {

    private static  DBGateway dbGateway;
    private SQLiteDatabase database;

    private DBGateway(Context context) {
        DBHelper helper = new DBHelper(context);
        database = helper.getWritableDatabase();
    }
    public static DBGateway getInstance(Context context) {
        if (dbGateway == null)
            dbGateway = new DBGateway(context);
        return  dbGateway;
    }
    public  SQLiteDatabase getDatabase() {
        return  this.database;
    }
}
