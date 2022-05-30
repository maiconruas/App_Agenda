package com.example.appcadastro.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    private  static final  String DATABASE_NAME="DBCadastro.db";
    private static final int DATABASE_VERSION = 1;
    private  static final String CREATE_TABLE_CONTATO="CREATE TABLE AGENDA(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
            "NOME TEXT NOT NULL, NOME_SOCIAL TEXT NOT NULL, GENERO TEXT NOT NULL," +
            "PAI TEXT NOT NULL, MAE TEXT NOT NULL, RENDA DOUBLE NOT NULL )";

    public DBHelper(@Nullable Context context) {
        super(context,DATABASE_NAME,null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE_CONTATO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
