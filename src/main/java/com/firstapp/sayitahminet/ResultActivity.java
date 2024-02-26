package com.firstapp.sayitahminet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private ImageView imageViewSonuc;
    private TextView textViewSonuc;
    private Button buttonTekrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        imageViewSonuc = findViewById(R.id.imageViewSonuc);
        textViewSonuc = findViewById(R.id.textViewSonuc);
        buttonTekrar = findViewById(R.id.buttonTekrar);

        buttonTekrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(ResultActivity.this, EstimateActivity.class));
               finish();
            }
        });


    }
}