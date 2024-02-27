package com.firstapp.sayitahminet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class EstimateActivity extends AppCompatActivity {
    private TextView textViewKalanHak, textViewYardim;
    private EditText editTextGirdi;
    private Button buttonTahminnn;

    private int rastgeleSayi;
    private int sayac = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estimate);

        textViewKalanHak = findViewById(R.id.textViewKalanHak);
        textViewYardim = findViewById(R.id.textViewYardim);

        editTextGirdi = findViewById(R.id.editTextGirdi);

        buttonTahminnn = findViewById(R.id.buttonTahmin);

        Intent intent = getIntent();
        Random r = new Random();

        if(intent != null && intent.hasExtra("difficulty"))
        {
            String difficulty = intent.getStringExtra("difficulty");

            if (difficulty.equals("kolay"))
            {
                rastgeleSayi = r.nextInt(21);
                editTextGirdi.setHint("1-20 arasında sayı giriniz.");
            }
            else if (difficulty.equals("orta"))
            {
                rastgeleSayi = r.nextInt(51);
                editTextGirdi.setHint("1-50 arasında sayı giriniz.");
            }
            else
            {
                rastgeleSayi = r.nextInt(101);
                editTextGirdi.setHint("1-100 arasında sayı giriniz.");
            }
        }
        Log.e("Rastgele Sayı: ", String.valueOf(rastgeleSayi));

        buttonTahminnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayac = sayac -1;

                int tahmin = Integer.parseInt(editTextGirdi.getText().toString());

                if ( tahmin == rastgeleSayi)
                {
                    Intent i = new Intent(EstimateActivity.this, ResultActivity.class);
                    i.putExtra("sonuc",true);
                    startActivity(i);
                    finish();
                    return;
                }

                if (tahmin > rastgeleSayi)
                {
                    textViewYardim.setText("Sayınızı Azaltınız ...");
                    textViewKalanHak.setText("Kalan Hak: "+sayac);
                }

                if (tahmin < rastgeleSayi)
                {
                    textViewYardim.setText("Sayınızı yükseltiniz...");
                    textViewKalanHak.setText("Kalan Hak: "+ sayac );
                }

                if(sayac <= 0)
                {
                    Intent i = new Intent(EstimateActivity.this, ResultActivity.class);
                    i.putExtra("sonuc",false);
                    startActivity(i);
                    finish();
                }

                editTextGirdi.setText(""); //Tahmin ettğimiz sayı kalmasın
            }
        });
    }
}