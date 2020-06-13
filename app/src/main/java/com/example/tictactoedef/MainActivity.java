package com.example.tictactoedef;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    final Context c = this;
    SharedPreferences myPrefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }
        setContentView(R.layout.activity_main);
        Intent Gioca_Vs_Computer = new Intent(MainActivity.this, Gioco.class);
        Intent Gioca_Vs_Player = new Intent(MainActivity.this, GiocoPlayer.class);
        Intent classifica = new Intent(MainActivity.this, Statistiche.class);
        Button VsComputer = findViewById(R.id.computer);
        Button VsPlayer = findViewById(R.id.umano);
        Button classificab = findViewById(R.id.Statistiche);
        RadioButton butX = findViewById(R.id.BottoneX);
        RadioButton butO = findViewById(R.id.BottoneO);
        SharedPreferences myPref;
        myPref = getSharedPreferences("prefID", Context.MODE_PRIVATE);
        int checked = myPref.getInt("Scelta", 2);
        if (checked == 1) {
            butO.setChecked(true);
        } else if (checked == 2) {
            butX.setChecked(true);
        }
        Button informazioni = findViewById(R.id.Informazioni);
        radioGroup = findViewById(R.id.gruppo);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            int risposta = 0;

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if (checkedId == R.id.BottoneO) {
                    risposta = 1;
                    SharedPreferences myPrefs;
                    myPrefs = getSharedPreferences("prefID", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = myPrefs.edit();
                    editor.putInt("Scelta", 1);
                    editor.apply();
                    editor.commit();
                } else if (checkedId == R.id.BottoneX) {
                    risposta = 2;
                    SharedPreferences myPrefs;
                    myPrefs = getSharedPreferences("prefID", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = myPrefs.edit();
                    editor.putInt("Scelta", 2);
                    editor.apply();
                    editor.commit();
                }
            }

        });
        VsComputer.setOnClickListener(
                (View v) -> {
                    LayoutInflater layoutInflaterAndroid = LayoutInflater.from(c);
                    View mView = layoutInflaterAndroid.inflate(R.layout.activity_finestra_input, null);
                    AlertDialog.Builder alertDialogBuilderUserInput = new AlertDialog.Builder(c);
                    alertDialogBuilderUserInput.setView(mView);
                    final EditText userInputDialogEditText = (EditText) mView.findViewById(R.id.userInputDialog);
                    alertDialogBuilderUserInput
                            .setCancelable(false)
                            .setPositiveButton("Gioca", (dialogBox, id) -> {
                                String nome = userInputDialogEditText.getText().toString();

                                myPrefs = getSharedPreferences("prefID", Context.MODE_PRIVATE);
                                SharedPreferences.Editor editor = myPrefs.edit();
                                editor.putString("Player1", nome);
                                editor.putInt("Controllo", 1);
                                editor.apply();
                                editor.commit();
                                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                                alertDialog.setTitle("Scelta della difficoltà");
                                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Difficile",
                                        new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int which) {
                                                myPrefs = getSharedPreferences("prefID", Context.MODE_PRIVATE);
                                                SharedPreferences.Editor editor = myPrefs.edit();
                                                editor.putInt("Difficolta", 1);
                                                editor.apply();
                                                editor.commit();
                                                MainActivity.this.startActivity(Gioca_Vs_Computer);
                                            }
                                        });
                                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Facile",
                                        new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int which) {
                                                myPrefs = getSharedPreferences("prefID", Context.MODE_PRIVATE);
                                                SharedPreferences.Editor editor = myPrefs.edit();
                                                editor.putInt("Difficolta", 2);
                                                editor.apply();
                                                editor.commit();
                                                MainActivity.this.startActivity(Gioca_Vs_Computer);
                                                MainActivity.this.startActivity(Gioca_Vs_Computer);
                                            }
                                        });
                                alertDialog.show();


                            })
                            .setNegativeButton("Annulla", (dialogBox, id) -> dialogBox.cancel());
                    AlertDialog alertDialogAndroid = alertDialogBuilderUserInput.create();
                    alertDialogAndroid.show();
                });


        VsPlayer.setOnClickListener(
                (View v) -> {
                    LayoutInflater layoutInflaterAndroid = LayoutInflater.from(c);
                    View mView = layoutInflaterAndroid.inflate(R.layout.finestra_input_2player, null);
                    AlertDialog.Builder alertDialogBuilderUserInput = new AlertDialog.Builder(c);
                    alertDialogBuilderUserInput.setView(mView);
                    final EditText userInputDialogEditText1 = (EditText) mView.findViewById(R.id.userInputDialogpl1);
                    final EditText userInputDialogEditText2 = (EditText) mView.findViewById(R.id.userInputDialogpl2);
                    alertDialogBuilderUserInput
                            .setCancelable(false)
                            .setPositiveButton("Gioca", (dialogBox, id) -> {
                                String nome1 = userInputDialogEditText1.getText().toString();
                                String nome2 = userInputDialogEditText2.getText().toString();
                                SharedPreferences myPrefs;
                                myPrefs = getSharedPreferences("prefID", Context.MODE_PRIVATE);
                                SharedPreferences.Editor editor = myPrefs.edit();
                                editor.putString("Player1", nome1);
                                editor.putString("Player2", nome2);
                                editor.putInt("Controllo", 2);
                                editor.apply();
                                editor.commit();
                                MainActivity.this.startActivity(Gioca_Vs_Player);

                            })
                            .setNegativeButton("Annulla",
                                    (dialogBox, id) -> dialogBox.cancel());

                    AlertDialog alertDialogAndroid = alertDialogBuilderUserInput.create();
                    alertDialogAndroid.show();
                });

        classificab.setOnClickListener(
                (View v) -> {
                    MainActivity.this.startActivity(classifica);
                });
        informazioni.setOnClickListener(
                (View v) -> {
                    LayoutInflater layoutInflaterAndroid = LayoutInflater.from(c);
                    View mView = layoutInflaterAndroid.inflate(R.layout.informazionipersonali, null);
                    AlertDialog.Builder alertDialogBuilderUserInput = new AlertDialog.Builder(c);
                    alertDialogBuilderUserInput.setView(mView);
                    alertDialogBuilderUserInput
                            .setCancelable(false)
                            .setNegativeButton("Fatto", (dialogBox, id) -> dialogBox.cancel());

                    AlertDialog alertDialogAndroid = alertDialogBuilderUserInput.create();
                    alertDialogAndroid.show();
                });

    }

}