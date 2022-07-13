package com.example.mynilai_saifin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Input_Nilai extends AppCompatActivity {
    Button login2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_nilai);
        login2=(Button) findViewById(R.id.login2);

        login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Input_Nilai.this, Halaman_input_bobot.class);
                startActivity(intent);
            }
        });
    }
}