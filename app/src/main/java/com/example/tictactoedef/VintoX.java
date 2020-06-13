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

public class VintoX extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }
        setContentView(R.layout.activity_vinto_x);
        Intent indietro = new Intent(VintoX.this, MainActivity.class);
        Button tornaindietro = findViewById(R.id.backX);
        Intent avanti1 = new Intent(VintoX.this, Gioco.class);
        Intent avanti2 = new Intent(VintoX.this, GiocoPlayer.class);
        Button ancora = findViewById(R.id.GiocaAncoraX);
        Bitmap foto = null;
        try {
            foto = BitmapFactory.decodeStream(this.openFileInput("myImage"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        SharedPreferences myPrefs;
        myPrefs = getSharedPreferences("prefID", Context.MODE_PRIVATE);
        int X = myPrefs.getInt("X", 0);
        int controllo = myPrefs.getInt("Controllo", 0);
        X++;
        SharedPreferences.Editor editor = myPrefs.edit();
        editor.putInt("X", X);
        editor.apply();
        editor.commit();
        ImageView Stampa = findViewById(R.id.AreaScreenX);
        Stampa.setImageBitmap(foto);
        tornaindietro.setOnClickListener(
                (View v) -> {
                    VintoX.this.startActivity(indietro);
                    VintoX.this.finish();
                }
        );
        ancora.setOnClickListener(
                (View v) -> {
                    if (controllo == 1) {
                        VintoX.this.startActivity(avanti1);
                        VintoX.this.finish();
                    } else if (controllo == 2) {
                        VintoX.this.startActivity(avanti2);
                        VintoX.this.finish();
                    }
                }
        );
    }
}
