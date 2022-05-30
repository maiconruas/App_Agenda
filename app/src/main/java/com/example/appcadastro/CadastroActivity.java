package com.example.appcadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.appcadastro.model.ContatoDAO;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        Button cadastrar = (Button) findViewById(R.id.cadastrar);
        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText nome = (EditText) findViewById(R.id.nome);
                EditText nome_social = (EditText) findViewById(R.id.nome_social);
                EditText genero = (EditText) findViewById(R.id.genero);
                EditText pai = (EditText) findViewById(R.id.pai);
                EditText mae = (EditText) findViewById(R.id.mae);
                EditText renda = (EditText) findViewById(R.id.renda);

                ContatoDAO dao = new ContatoDAO(getBaseContext());
                if (dao.cadastrar(nome.getText().toString(),nome_social.getText().toString(),
                        genero.getText().toString(), pai.getText().toString(), mae.getText().toString(),
                        Double.valueOf(renda.getText().toString()))){
                    Toast.makeText(getBaseContext(),"Contato cadastrardo com sucesso",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getBaseContext(),"Erro ao cadastrar o contato",Toast.LENGTH_LONG).show();
                    finish();
                }
            }
        });
    }
}