package com.example.sutantio.sutantio;
// NIM :10116053
// Nama:Sutantio Ramdhani
// Kelas: AKB-2
// Tanggal Pembuatan : 5 April 2019

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mulai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mulai = (Button)findViewById(R.id.button_mulai);

        mulai.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, login.class);
                startActivity(intent);
            }
        });
        }
}