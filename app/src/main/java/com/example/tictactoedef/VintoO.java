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

public class VintoO extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }
        setContentView(R.layout.activity_vinto_o);
        Intent indietro = new Intent(VintoO.this, MainActivity.class);
        Button tornaindietro = findViewById(R.id.backO);
        Intent avanti1 = new Intent(VintoO.this, Gioco.class);
        Intent avanti2 = new Intent(VintoO.this, GiocoPlayer.class);
        Button ancora = findViewById(R.id.GiocaAncoraO);
        Bitmap foto = null;
        try {
            foto = BitmapFactory.decodeStream(this.openFileInput("myImage"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        SharedPreferences myPrefs;
        myPrefs = getSharedPreferences("prefID", Context.MODE_PRIVATE);

        int O = myPrefs.getInt("O", 0);
        O++;
        SharedPreferences.Editor editor = myPrefs.edit();
        int controllo = myPrefs.getInt("Controllo", 0);
        editor.putInt("O", O);
        editor.apply();
        editor.commit();
        ImageView Stampa = findViewById(R.id.AreaScreenO);
        Stampa.setImageBitmap(foto);
        tornaindietro.setOnClickListener(
                (View v) -> {
                    VintoO.this.startActivity(indietro);
                    VintoO.this.finish();


                }
        );
        ancora.setOnClickListener(
                (View v) -> {
                    if (controllo == 1) {
                        VintoO.this.startActivity(avanti1);
                        VintoO.this.finish();
                    } else if (controllo == 2) {
                        VintoO.this.startActivity(avanti2);
                        VintoO.this.finish();
                    }
                }
        );
    }
}
