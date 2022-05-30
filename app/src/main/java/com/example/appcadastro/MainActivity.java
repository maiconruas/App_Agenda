package com.example.appcadastro;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton add = (FloatingActionButton) findViewById(R.id.Add);

        add.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CadastroActivity.class);

            startActivity(intent);
        });
    }
}