package com.example.tictactoedef;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Statistiche extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }
        setContentView(R.layout.activity_statistiche);
        TextView x = (TextView) findViewById(R.id.numerovittorieX);
        TextView o = (TextView) findViewById(R.id.numerovittorieO);
        Button reset = findViewById(R.id.ResetVittorie);
        SharedPreferences myPrefs;
        myPrefs = getSharedPreferences("prefID", Context.MODE_PRIVATE);
        int O = myPrefs.getInt("O", 0);
        int X = myPrefs.getInt("X", 0);
        o.setText(Integer.toString(O));
        x.setText(Integer.toString(X));
        Intent indietro = new Intent(Statistiche.this, MainActivity.class);
        Intent refresh = new Intent(Statistiche.this, Statistiche.class);
        Button tornaindietro = findViewById(R.id.backVittorie);
        tornaindietro.setOnClickListener(
                (View v) -> {
                    Statistiche.this.startActivity(indietro);
                    Statistiche.this.finish();

                }
        );
        reset.setOnClickListener(
                (View v) -> {
                    SharedPreferences.Editor editor = myPrefs.edit();
                    editor.putInt("O", 0);
                    editor.putInt("X", 0);
                    editor.apply();
                    editor.commit();
                    Statistiche.this.startActivity(refresh);
                    Statistiche.this.finish();
                }
        );


    }
}