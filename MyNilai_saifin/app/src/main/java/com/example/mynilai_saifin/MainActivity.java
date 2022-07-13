package com.example.mynilai_saifin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    Button login;

    private String[] Item = {"Basic 3D","Pemrograman Dasar","Sistem Informasi","Mobile Computing",
            "Praktikum Mobile Computing"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=(Button) findViewById(R.id.login);
        final Spinner List = findViewById(R.id.spinner);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, Input_Nilai.class);
                startActivity(intent);
            }
        });

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item,Item);

        List.setAdapter(adapter);

        List.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(),"Anda Memilih "+adapter.getItem(i),
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(getApplicationContext(),"Tidak Ada Item Yang Dipilih", Toast.LENGTH_SHORT).show();
            }
        });
    }
}