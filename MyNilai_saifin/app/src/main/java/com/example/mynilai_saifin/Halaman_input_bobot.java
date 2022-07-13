package com.example.mynilai_saifin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Halaman_input_bobot extends AppCompatActivity {

        Button login3;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_halaman_input_bobot);
            login3=(Button) findViewById(R.id.login3);

            login3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Halaman_input_bobot.this,Halaman_lihat_hasil.class);
                    startActivity(intent);
                }
            });
        }
    }