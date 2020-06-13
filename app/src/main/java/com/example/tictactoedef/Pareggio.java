package com.example.tictactoedef;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.FileNotFoundException;

public class Pareggio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }
        setContentView(R.layout.activity_pareggio);
        Intent indietro = new Intent(Pareggio.this, MainActivity.class);
        Button tornaindietro = findViewById(R.id.backPareggio);
        Intent avanti1 = new Intent(Pareggio.this, Gioco.class);
        Intent avanti2 = new Intent(Pareggio.this, GiocoPlayer.class);
        Button ancora = findViewById(R.id.GiocaAncoraPareggio);
        Bitmap foto = null;
        try {
            foto = BitmapFactory.decodeStream(this.openFileInput("myImage"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ImageView Stampa = findViewById(R.id.AreaScreenPareggio);
        Stampa.setImageBitmap(foto);
        SharedPreferences myPrefs;
        myPrefs = getSharedPreferences("prefID", Context.MODE_PRIVATE);
        int controllo = myPrefs.getInt("Controllo", 0);
        tornaindietro.setOnClickListener(
                (View v) -> {
                    Pareggio.this.startActivity(indietro);
                    Pareggio.this.finish();
                }
        );
        ancora.setOnClickListener(
                (View v) -> {
                    if (controllo == 1) {
                        Pareggio.this.startActivity(avanti1);
                        Pareggio.this.finish();
                    } else if (controllo == 2) {
                        Pareggio.this.startActivity(avanti2);
                        Pareggio.this.finish();
                    }
                }
        );
    }
}
