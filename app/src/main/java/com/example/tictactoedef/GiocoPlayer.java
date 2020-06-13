package com.example.tictactoedef;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class GiocoPlayer extends AppCompatActivity {
    private ImageView imageViewP;

    public String createImageFromBitmap(Bitmap bitmap) {
        String fileName = "myImage";//no .png or .jpg needed
        try {
            ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
            FileOutputStream fo = openFileOutput(fileName, Context.MODE_PRIVATE);
            fo.write(bytes.toByteArray());
            // remember close file output
            fo.close();
        } catch (Exception e) {
            e.printStackTrace();
            fileName = null;
        }
        return fileName;
    }

    private Boolean turno;

    void checkWinner(int gioco[], Button bottoni[], Intent VintoX, Intent VintoO, Intent Pareggio) {
        imageViewP = findViewById(R.id.testfotoPlayer);
        if (gioco[0] == gioco[1] && gioco[1] == gioco[2] && gioco[2] == gioco[0] && gioco[0] != 0)//prima riga
        {
            if (gioco[0] == 1) {
                bottoni[0].setBackgroundResource(R.drawable.xvittory);
                bottoni[1].setBackgroundResource(R.drawable.xvittory);
                bottoni[2].setBackgroundResource(R.drawable.xvittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageViewP);
                createImageFromBitmap(b);
                GiocoPlayer.this.startActivity(VintoX);
                finish();
            } else {
                bottoni[0].setBackgroundResource(R.drawable.ovittory);
                bottoni[1].setBackgroundResource(R.drawable.ovittory);
                bottoni[2].setBackgroundResource(R.drawable.ovittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageViewP);
                createImageFromBitmap(b);
                GiocoPlayer.this.startActivity(VintoO);
                finish();
            }

        } else if (gioco[3] == gioco[4] && gioco[4] == gioco[5] && gioco[5] == gioco[3] && gioco[3] != 0)//seconda riga
        {
            if (gioco[3] == 1) {
                bottoni[3].setBackgroundResource(R.drawable.xvittory);
                bottoni[4].setBackgroundResource(R.drawable.xvittory);
                bottoni[5].setBackgroundResource(R.drawable.xvittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageViewP);
                createImageFromBitmap(b);
                GiocoPlayer.this.startActivity(VintoX);
                finish();
            } else {
                bottoni[3].setBackgroundResource(R.drawable.ovittory);
                bottoni[4].setBackgroundResource(R.drawable.ovittory);
                bottoni[5].setBackgroundResource(R.drawable.ovittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageViewP);
                createImageFromBitmap(b);
                GiocoPlayer.this.startActivity(VintoO);
                finish();
            }
        } else if (gioco[6] == gioco[7] && gioco[7] == gioco[8] && gioco[8] == gioco[6] && gioco[6] != 0)//terza riga
        {
            if (gioco[6] == 1) {
                bottoni[6].setBackgroundResource(R.drawable.xvittory);
                bottoni[7].setBackgroundResource(R.drawable.xvittory);
                bottoni[8].setBackgroundResource(R.drawable.xvittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageViewP);
                createImageFromBitmap(b);
                GiocoPlayer.this.startActivity(VintoX);
                finish();
            } else {
                bottoni[6].setBackgroundResource(R.drawable.ovittory);
                bottoni[7].setBackgroundResource(R.drawable.ovittory);
                bottoni[8].setBackgroundResource(R.drawable.ovittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageViewP);
                createImageFromBitmap(b);
                GiocoPlayer.this.startActivity(VintoO);
                finish();
            }
        } else if (gioco[0] == gioco[4] && gioco[4] == gioco[8] && gioco[8] == gioco[0] && gioco[0] != 0)//diagonale da 0 a 8
        {
            if (gioco[0] == 1) {
                bottoni[0].setBackgroundResource(R.drawable.xvittory);
                bottoni[4].setBackgroundResource(R.drawable.xvittory);
                bottoni[8].setBackgroundResource(R.drawable.xvittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageViewP);
                createImageFromBitmap(b);
                GiocoPlayer.this.startActivity(VintoX);
                finish();
            } else {
                bottoni[0].setBackgroundResource(R.drawable.ovittory);
                bottoni[4].setBackgroundResource(R.drawable.ovittory);
                bottoni[8].setBackgroundResource(R.drawable.ovittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageViewP);
                createImageFromBitmap(b);
                GiocoPlayer.this.startActivity(VintoO);
                finish();
            }
        } else if (gioco[2] == gioco[4] && gioco[4] == gioco[6] && gioco[6] == gioco[2] && gioco[2] != 0)//diagonale da 2 a 6
        {

            if (gioco[2] == 1) {
                bottoni[2].setBackgroundResource(R.drawable.xvittory);
                bottoni[4].setBackgroundResource(R.drawable.xvittory);
                bottoni[6].setBackgroundResource(R.drawable.xvittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageViewP);
                createImageFromBitmap(b);
                GiocoPlayer.this.startActivity(VintoX);
                finish();
            } else {
                bottoni[2].setBackgroundResource(R.drawable.ovittory);
                bottoni[4].setBackgroundResource(R.drawable.ovittory);
                bottoni[6].setBackgroundResource(R.drawable.ovittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageViewP);
                createImageFromBitmap(b);
                GiocoPlayer.this.startActivity(VintoO);
                finish();
            }
        } else if (gioco[0] == gioco[3] && gioco[3] == gioco[6] && gioco[6] == gioco[0] && gioco[0] != 0) {//verticale sinistra
            if (gioco[0] == 1) {
                bottoni[0].setBackgroundResource(R.drawable.xvittory);
                bottoni[3].setBackgroundResource(R.drawable.xvittory);
                bottoni[6].setBackgroundResource(R.drawable.xvittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageViewP);
                createImageFromBitmap(b);
                GiocoPlayer.this.startActivity(VintoX);
                finish();
            } else {
                bottoni[0].setBackgroundResource(R.drawable.ovittory);
                bottoni[3].setBackgroundResource(R.drawable.ovittory);
                bottoni[6].setBackgroundResource(R.drawable.ovittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageViewP);
                createImageFromBitmap(b);
                GiocoPlayer.this.startActivity(VintoO);
                finish();
            }
        } else if (gioco[1] == gioco[4] && gioco[4] == gioco[7] && gioco[7] == gioco[1] && gioco[1] != 0) {//verticale centro
            if (gioco[1] == 1) {
                bottoni[1].setBackgroundResource(R.drawable.xvittory);
                bottoni[4].setBackgroundResource(R.drawable.xvittory);
                bottoni[7].setBackgroundResource(R.drawable.xvittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageViewP);
                createImageFromBitmap(b);
                GiocoPlayer.this.startActivity(VintoX);
                finish();
            } else {
                bottoni[1].setBackgroundResource(R.drawable.ovittory);
                bottoni[4].setBackgroundResource(R.drawable.ovittory);
                bottoni[7].setBackgroundResource(R.drawable.ovittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageViewP);
                createImageFromBitmap(b);
                GiocoPlayer.this.startActivity(VintoO);
                finish();
            }
        } else if (gioco[2] == gioco[5] && gioco[5] == gioco[8] && gioco[8] == gioco[2] && gioco[2] != 0) {//verticale dentra
            if (gioco[2] == 1) {
                bottoni[2].setBackgroundResource(R.drawable.xvittory);
                bottoni[5].setBackgroundResource(R.drawable.xvittory);
                bottoni[8].setBackgroundResource(R.drawable.xvittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageViewP);
                createImageFromBitmap(b);
                GiocoPlayer.this.startActivity(VintoX);
                finish();
            } else {
                bottoni[2].setBackgroundResource(R.drawable.ovittory);
                bottoni[5].setBackgroundResource(R.drawable.ovittory);
                bottoni[8].setBackgroundResource(R.drawable.ovittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageViewP);
                createImageFromBitmap(b);
                GiocoPlayer.this.startActivity(VintoO);
                finish();
            }
        } else if (gioco[0] != 0 && gioco[1] != 0 && gioco[2] != 0 && gioco[3] != 0 && gioco[4] != 0 && gioco[5] != 0 && gioco[6] != 0 && gioco[7] != 0 && gioco[8] != 0) {
            Bitmap b = Screenshot.takescreenshotOfRootView(imageViewP);
            createImageFromBitmap(b);
            GiocoPlayer.this.startActivity(Pareggio);
            finish();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }
        setContentView(R.layout.activity_gioco_player);
        int gioco[] = new int[9];
        Button esci = findViewById(R.id.BottoneIndietroPlayer);
        Intent esciP = new Intent(GiocoPlayer.this, MainActivity.class);
        gioco[0] = 0;
        gioco[1] = 0;
        gioco[2] = 0;
        gioco[3] = 0;
        gioco[4] = 0;
        gioco[5] = 0;
        gioco[6] = 0;
        gioco[7] = 0;
        gioco[8] = 0;
        Button[] bottoni = new Button[9];
        bottoni[0] = findViewById(R.id.Bottone1P);
        bottoni[1] = findViewById(R.id.Bottone2P);
        bottoni[2] = findViewById(R.id.Bottone3P);
        bottoni[3] = findViewById(R.id.Bottone4P);
        bottoni[4] = findViewById(R.id.Bottone5P);
        bottoni[5] = findViewById(R.id.Bottone6P);
        bottoni[6] = findViewById(R.id.Bottone7P);
        bottoni[7] = findViewById(R.id.Bottone8P);
        bottoni[8] = findViewById(R.id.Bottone9P);
        Intent VintoX = new Intent(GiocoPlayer.this, VintoX.class);
        Intent VintoO = new Intent(GiocoPlayer.this, VintoO.class);
        Intent Pareggio = new Intent(GiocoPlayer.this, Pareggio.class);
        turno = true;
        TextView visualizzanome1 = (TextView) findViewById(R.id.Nomeplayer1);
        TextView visualizzanome2 = (TextView) findViewById(R.id.Nomeplayer2);
        SharedPreferences myPrefs;
        myPrefs = getSharedPreferences("prefID", Context.MODE_PRIVATE);
        int rispostaMain = myPrefs.getInt("Scelta", 1);
        String nome1 = myPrefs.getString("Player1", "Test");
        String nome2 = myPrefs.getString("Player2", "Test");
        if (nome1.length() == 0 || nome2.length() == 0) {
            visualizzanome1.setText(nome1);
            visualizzanome2.setText(nome2);
        } else {
            String n1 = nome1.substring(0, 1).toUpperCase();
            String n2 = nome2.substring(0, 1).toUpperCase();
            String nR1 = n1 + nome1.substring(1);
            String nR2 = n2 + nome2.substring(1);
            visualizzanome1.setText(nR1);
            visualizzanome2.setText(nR2);

        }


        bottoni[0].setOnClickListener(
                (View v) -> {
                    if (gioco[0] == 0) {
                        if (turno) {
                            if ((int) rispostaMain == 1) {
                                bottoni[0].setBackgroundResource(R.drawable.x);
                                gioco[0] = 1;
                            } else if ((int) rispostaMain == 2) {
                                bottoni[0].setBackgroundResource(R.drawable.o);
                                gioco[0] = 2;
                            }
                            turno = false;
                        } else {
                            if ((int) rispostaMain == 2) {
                                bottoni[0].setBackgroundResource(R.drawable.x);
                                gioco[0] = 1;
                            } else if ((int) rispostaMain == 1) {
                                bottoni[0].setBackgroundResource(R.drawable.o);
                                gioco[0] = 2;
                            }
                            turno = true;
                        }
                        checkWinner(gioco, bottoni, VintoX, VintoO, Pareggio);
                    }
                }
        );
        bottoni[1].setOnClickListener(
                (View v) -> {
                    if (gioco[1] == 0) {
                        if (turno) {
                            if ((int) rispostaMain == 1) {
                                bottoni[1].setBackgroundResource(R.drawable.x);
                                gioco[1] = 1;
                            } else if ((int) rispostaMain == 2) {
                                bottoni[1].setBackgroundResource(R.drawable.o);
                                gioco[1] = 2;
                            }
                            turno = false;
                        } else {
                            if ((int) rispostaMain == 2) {
                                bottoni[1].setBackgroundResource(R.drawable.x);
                                gioco[1] = 1;
                            } else if ((int) rispostaMain == 1) {
                                bottoni[1].setBackgroundResource(R.drawable.o);
                                gioco[1] = 2;
                            }
                            turno = true;
                        }
                        checkWinner(gioco, bottoni, VintoX, VintoO, Pareggio);
                    }
                }
        );
        bottoni[2].setOnClickListener(
                (View v) -> {
                    if (gioco[2] == 0) {
                        if (turno) {
                            if ((int) rispostaMain == 1) {
                                bottoni[2].setBackgroundResource(R.drawable.x);
                                gioco[2] = 1;
                            } else if ((int) rispostaMain == 2) {
                                bottoni[2].setBackgroundResource(R.drawable.o);
                                gioco[2] = 2;
                            }
                            turno = false;
                        } else {
                            if ((int) rispostaMain == 2) {
                                bottoni[2].setBackgroundResource(R.drawable.x);
                                gioco[2] = 1;
                            } else if ((int) rispostaMain == 1) {
                                bottoni[2].setBackgroundResource(R.drawable.o);
                                gioco[2] = 2;
                            }
                            turno = true;
                        }
                        checkWinner(gioco, bottoni, VintoX, VintoO, Pareggio);
                    }
                }
        );
        bottoni[3].setOnClickListener(
                (View v) -> {
                    if (gioco[3] == 0) {
                        if (turno) {
                            if ((int) rispostaMain == 1) {
                                bottoni[3].setBackgroundResource(R.drawable.x);
                                gioco[3] = 1;
                            } else if ((int) rispostaMain == 2) {
                                bottoni[3].setBackgroundResource(R.drawable.o);
                                gioco[3] = 2;
                            }
                            turno = false;
                        } else {
                            if ((int) rispostaMain == 2) {
                                bottoni[3].setBackgroundResource(R.drawable.x);
                                gioco[3] = 1;
                            } else if ((int) rispostaMain == 1) {
                                bottoni[3].setBackgroundResource(R.drawable.o);
                                gioco[3] = 2;
                            }
                            turno = true;
                        }
                        checkWinner(gioco, bottoni, VintoX, VintoO, Pareggio);
                    }
                }
        );
        bottoni[4].setOnClickListener(
                (View v) -> {
                    if (gioco[4] == 0) {
                        if (turno) {
                            if ((int) rispostaMain == 1) {
                                bottoni[4].setBackgroundResource(R.drawable.x);
                                gioco[4] = 1;
                            } else if ((int) rispostaMain == 2) {
                                bottoni[4].setBackgroundResource(R.drawable.o);
                                gioco[4] = 2;
                            }
                            turno = false;
                        } else {
                            if ((int) rispostaMain == 2) {
                                bottoni[4].setBackgroundResource(R.drawable.x);
                                gioco[4] = 1;
                            } else if ((int) rispostaMain == 1) {
                                bottoni[4].setBackgroundResource(R.drawable.o);
                                gioco[4] = 2;
                            }
                            turno = true;
                        }
                        checkWinner(gioco, bottoni, VintoX, VintoO, Pareggio);
                    }
                }
        );
        bottoni[5].setOnClickListener(
                (View v) -> {
                    if (gioco[5] == 0) {
                        if (turno) {
                            if ((int) rispostaMain == 1) {
                                bottoni[5].setBackgroundResource(R.drawable.x);
                                gioco[5] = 1;
                            } else if ((int) rispostaMain == 2) {
                                bottoni[5].setBackgroundResource(R.drawable.o);
                                gioco[5] = 2;
                            }
                            turno = false;
                        } else {
                            if ((int) rispostaMain == 2) {
                                bottoni[5].setBackgroundResource(R.drawable.x);
                                gioco[5] = 1;
                            } else if ((int) rispostaMain == 1) {
                                bottoni[5].setBackgroundResource(R.drawable.o);
                                gioco[5] = 2;
                            }
                            turno = true;
                        }
                        checkWinner(gioco, bottoni, VintoX, VintoO, Pareggio);
                    }
                }
        );
        bottoni[6].setOnClickListener(
                (View v) -> {
                    if (gioco[6] == 0) {
                        if (turno) {
                            if ((int) rispostaMain == 1) {
                                bottoni[6].setBackgroundResource(R.drawable.x);
                                gioco[6] = 1;
                            } else if ((int) rispostaMain == 2) {
                                bottoni[6].setBackgroundResource(R.drawable.o);
                                gioco[6] = 2;
                            }
                            turno = false;
                        } else {
                            if ((int) rispostaMain == 2) {
                                bottoni[6].setBackgroundResource(R.drawable.x);
                                gioco[6] = 1;
                            } else if ((int) rispostaMain == 1) {
                                bottoni[6].setBackgroundResource(R.drawable.o);
                                gioco[6] = 2;
                            }
                            turno = true;
                        }
                        checkWinner(gioco, bottoni, VintoX, VintoO, Pareggio);
                    }
                }
        );
        bottoni[7].setOnClickListener(
                (View v) -> {
                    if (gioco[7] == 0) {
                        if (turno) {
                            if ((int) rispostaMain == 1) {
                                bottoni[7].setBackgroundResource(R.drawable.x);
                                gioco[7] = 1;
                            } else if ((int) rispostaMain == 2) {
                                bottoni[7].setBackgroundResource(R.drawable.o);
                                gioco[7] = 2;
                            }
                            turno = false;
                        } else {
                            if ((int) rispostaMain == 2) {
                                bottoni[7].setBackgroundResource(R.drawable.x);
                                gioco[7] = 1;
                            } else if ((int) rispostaMain == 1) {
                                bottoni[7].setBackgroundResource(R.drawable.o);
                                gioco[7] = 2;
                            }
                            turno = true;
                        }
                        checkWinner(gioco, bottoni, VintoX, VintoO, Pareggio);
                    }
                }
        );
        bottoni[8].setOnClickListener(
                (View v) -> {
                    if (gioco[8] == 0) {
                        if (turno) {
                            if ((int) rispostaMain == 1) {
                                bottoni[8].setBackgroundResource(R.drawable.x);
                                gioco[8] = 1;
                            } else if ((int) rispostaMain == 2) {
                                bottoni[8].setBackgroundResource(R.drawable.o);
                                gioco[8] = 2;
                            }
                            turno = false;
                        } else {
                            if ((int) rispostaMain == 2) {
                                bottoni[8].setBackgroundResource(R.drawable.x);
                                gioco[8] = 1;
                            } else if ((int) rispostaMain == 1) {
                                bottoni[8].setBackgroundResource(R.drawable.o);
                                gioco[8] = 2;
                            }
                            turno = true;
                        }
                        checkWinner(gioco, bottoni, VintoX, VintoO, Pareggio);
                    }
                }
        );
        esci.setOnClickListener(
                (View v) -> {
                    startActivity(esciP);
                    finish();
                }
        );
    }

}


