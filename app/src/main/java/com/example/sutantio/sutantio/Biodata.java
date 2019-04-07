package com.example.sutantio.sutantio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Biodata extends AppCompatActivity {
  EditText name;
  private Button selengkapnya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        name = (EditText) findViewById(R.id.nama);
        String wawa = name.getText().toString();

        selengkapnya = (Button)findViewById(R.id.selengkapnya);

        selengkapnya.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                String message=" "+((EditText)name).getText();
                Intent intent=new Intent(getApplicationContext(),Akhir.class);
                intent.putExtra("message", message);
                startActivity(intent);
            }
        });

    }
}
