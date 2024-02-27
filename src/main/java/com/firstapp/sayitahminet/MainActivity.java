package com.firstapp.sayitahminet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonKolayy, buttonOrta, buttonZor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonKolayy = findViewById(R.id.buttonKolayy);
        buttonOrta = findViewById(R.id.buttonOrta);
        buttonZor = findViewById(R.id.buttonZor);

        buttonKolayy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, EstimateActivity.class);
                i.putExtra("difficulty", "kolay");
                startActivity(i);
            }
        });
        buttonOrta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, EstimateActivity.class);
                i.putExtra("difficulty","orta");
                startActivity(i);
            }
        });
        buttonZor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, EstimateActivity.class);
                i.putExtra("difficulty","zor");
                startActivity(i);
            }
        });
    }
}