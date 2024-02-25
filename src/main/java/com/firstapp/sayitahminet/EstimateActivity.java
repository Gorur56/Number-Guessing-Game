package com.firstapp.sayitahminet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EstimateActivity extends AppCompatActivity {
    private TextView textViewKalanHak, textViewYardim;
    private EditText editTextGirdi;
    private Button buttonTahmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estimate);

        textViewKalanHak = findViewById(R.id.textViewKalanHak);
        textViewYardim = findViewById(R.id.textViewYardim);

        editTextGirdi = findViewById(R.id.editTextGirdi);

        buttonTahmin = findViewById(R.id.buttonTahmin);
    }
}