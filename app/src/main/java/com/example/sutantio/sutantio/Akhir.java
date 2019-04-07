package com.example.sutantio.sutantio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Akhir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akhir);

        TextView textView=(TextView) findViewById(R.id.akhir);
        Intent intent=getIntent();
        textView.setText(intent.getStringExtra("message"));
    }
}
