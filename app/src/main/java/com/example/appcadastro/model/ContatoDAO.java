package com.example.appcadastro.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {

    private  static String Table_Agenda = "AGENDA";
    private DBGateway dbGateway;
    private List<Contato> contatos;

    public ContatoDAO(Context context) {
        dbGateway = DBGateway.getInstance(context);
        this.contatos = new ArrayList<>();
    }
    public boolean cadastrar(String nome, String nome_social, String genero, String pai, String mae, Double renda) {
        ContentValues contentValues = new ContentValues();

        contentValues.put("NOME", nome);
        contentValues.put("NOME_SOCIAL", nome_social);
        contentValues.put("GENERO", genero);
        contentValues.put("PAI", pai);
        contentValues.put("MAE", mae);
        contentValues.put("RENDA", renda);

        return dbGateway.getDatabase().insert(Table_Agenda, null, contentValues) > 0 ;
    }
    public boolean atualizar(int id, String nome, String nome_social, String genero, String pai, String mae, Double renda) {
        ContentValues contentValues = new ContentValues();

        contentValues.put("NOME", nome);
        contentValues.put("NOME_SOCIAL", nome_social);
        contentValues.put("GENERO", genero);
        contentValues.put("PAI", pai);
        contentValues.put("MAE", mae);
        contentValues.put("RENDA", renda);

        return dbGateway.getDatabase().update(Table_Agenda, contentValues,"ID=?", new String[]{id+""}) > 0 ;
    }
    public boolean deletar(int id) {
        return dbGateway.getDatabase().delete(Table_Agenda,"ID=?", new String[]{id+""}) > 0 ;
    }
    public List<Contato> findAll()
    {
        try {
            Cursor cursor = dbGateway.getDatabase().rawQuery("SELECT * FROM AGENDA",null);

            while (cursor.moveToNext()) {
                String nome = cursor.getString(cursor.getColumnIndex("NOME"));
                String nome_social = cursor.getString(cursor.getColumnIndex("NOME_SOCIAL"));
                String genero = cursor.getString(cursor.getColumnIndex("GENERO"));
                String pai = cursor.getString(cursor.getColumnIndex("PAI"));
                String mae = cursor.getString(cursor.getColumnIndex("MAE"));
                double renda = cursor.getDouble(cursor.getColumnIndex("RENDA"));
                this.contatos.add(new Contato(nome,nome_social,genero,pai,mae,renda));

            }

        }catch (Exception err) {
            Log.d("erro",err.getMessage().toString());
        }
        return this.contatos;

    }
}
