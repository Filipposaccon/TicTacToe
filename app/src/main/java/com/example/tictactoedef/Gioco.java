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
import java.util.ArrayList;
import java.util.Random;

public class Gioco extends AppCompatActivity {
    private ImageView imageView;
    int livello = 0;

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

    void checkWinner(int gioco[], Button bottoni[], Intent VintoX, Intent VintoO, Intent Pareggio) {
        imageView = findViewById(R.id.testfoto);
        if (gioco[0] == gioco[1] && gioco[1] == gioco[2] && gioco[2] == gioco[0] && gioco[0] != 0)//prima riga
        {
            if (gioco[0] == 1) {
                bottoni[0].setBackgroundResource(R.drawable.xvittory);
                bottoni[1].setBackgroundResource(R.drawable.xvittory);
                bottoni[2].setBackgroundResource(R.drawable.xvittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageView);
                createImageFromBitmap(b);
                Gioco.this.startActivity(VintoX);
                finish();
            } else {
                bottoni[0].setBackgroundResource(R.drawable.ovittory);
                bottoni[1].setBackgroundResource(R.drawable.ovittory);
                bottoni[2].setBackgroundResource(R.drawable.ovittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageView);
                createImageFromBitmap(b);
                Gioco.this.startActivity(VintoO);
                finish();
            }

        } else if (gioco[3] == gioco[4] && gioco[4] == gioco[5] && gioco[5] == gioco[3] && gioco[3] != 0)//seconda riga
        {
            if (gioco[3] == 1) {
                bottoni[3].setBackgroundResource(R.drawable.xvittory);
                bottoni[4].setBackgroundResource(R.drawable.xvittory);
                bottoni[5].setBackgroundResource(R.drawable.xvittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageView);
                createImageFromBitmap(b);
                Gioco.this.startActivity(VintoX);
                finish();
            } else {
                bottoni[3].setBackgroundResource(R.drawable.ovittory);
                bottoni[4].setBackgroundResource(R.drawable.ovittory);
                bottoni[5].setBackgroundResource(R.drawable.ovittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageView);
                createImageFromBitmap(b);
                Gioco.this.startActivity(VintoO);
                finish();
            }
        } else if (gioco[6] == gioco[7] && gioco[7] == gioco[8] && gioco[8] == gioco[6] && gioco[6] != 0)//terza riga
        {
            if (gioco[6] == 1) {
                bottoni[6].setBackgroundResource(R.drawable.xvittory);
                bottoni[7].setBackgroundResource(R.drawable.xvittory);
                bottoni[8].setBackgroundResource(R.drawable.xvittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageView);
                createImageFromBitmap(b);
                Gioco.this.startActivity(VintoX);
                finish();
            } else {
                bottoni[6].setBackgroundResource(R.drawable.ovittory);
                bottoni[7].setBackgroundResource(R.drawable.ovittory);
                bottoni[8].setBackgroundResource(R.drawable.ovittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageView);
                createImageFromBitmap(b);
                Gioco.this.startActivity(VintoO);
                finish();
            }
        } else if (gioco[0] == gioco[4] && gioco[4] == gioco[8] && gioco[8] == gioco[0] && gioco[0] != 0)//diagonale da 0 a 8
        {
            if (gioco[0] == 1) {
                bottoni[0].setBackgroundResource(R.drawable.xvittory);
                bottoni[4].setBackgroundResource(R.drawable.xvittory);
                bottoni[8].setBackgroundResource(R.drawable.xvittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageView);
                createImageFromBitmap(b);
                Gioco.this.startActivity(VintoX);
                finish();
            } else {
                bottoni[0].setBackgroundResource(R.drawable.ovittory);
                bottoni[4].setBackgroundResource(R.drawable.ovittory);
                bottoni[8].setBackgroundResource(R.drawable.ovittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageView);
                createImageFromBitmap(b);
                Gioco.this.startActivity(VintoO);
                finish();
            }
        } else if (gioco[2] == gioco[4] && gioco[4] == gioco[6] && gioco[6] == gioco[2] && gioco[2] != 0)//diagonale da 2 a 6
        {

            if (gioco[2] == 1) {
                bottoni[2].setBackgroundResource(R.drawable.xvittory);
                bottoni[4].setBackgroundResource(R.drawable.xvittory);
                bottoni[6].setBackgroundResource(R.drawable.xvittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageView);
                createImageFromBitmap(b);
                Gioco.this.startActivity(VintoX);
                finish();
            } else {
                bottoni[2].setBackgroundResource(R.drawable.ovittory);
                bottoni[4].setBackgroundResource(R.drawable.ovittory);
                bottoni[6].setBackgroundResource(R.drawable.ovittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageView);
                createImageFromBitmap(b);
                Gioco.this.startActivity(VintoO);
                finish();
            }
        } else if (gioco[0] == gioco[3] && gioco[3] == gioco[6] && gioco[6] == gioco[0] && gioco[0] != 0) {//verticale sinistra
            if (gioco[0] == 1) {
                bottoni[0].setBackgroundResource(R.drawable.xvittory);
                bottoni[3].setBackgroundResource(R.drawable.xvittory);
                bottoni[6].setBackgroundResource(R.drawable.xvittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageView);
                createImageFromBitmap(b);
                Gioco.this.startActivity(VintoX);
                finish();
            } else {
                bottoni[0].setBackgroundResource(R.drawable.ovittory);
                bottoni[3].setBackgroundResource(R.drawable.ovittory);
                bottoni[6].setBackgroundResource(R.drawable.ovittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageView);
                createImageFromBitmap(b);
                Gioco.this.startActivity(VintoO);
                finish();
            }
        } else if (gioco[1] == gioco[4] && gioco[4] == gioco[7] && gioco[7] == gioco[1] && gioco[1] != 0) {//verticale centro
            if (gioco[1] == 1) {
                bottoni[1].setBackgroundResource(R.drawable.xvittory);
                bottoni[4].setBackgroundResource(R.drawable.xvittory);
                bottoni[7].setBackgroundResource(R.drawable.xvittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageView);
                createImageFromBitmap(b);
                Gioco.this.startActivity(VintoX);
                finish();
            } else {
                bottoni[1].setBackgroundResource(R.drawable.ovittory);
                bottoni[4].setBackgroundResource(R.drawable.ovittory);
                bottoni[7].setBackgroundResource(R.drawable.ovittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageView);
                createImageFromBitmap(b);
                Gioco.this.startActivity(VintoO);
                finish();
            }
        } else if (gioco[2] == gioco[5] && gioco[5] == gioco[8] && gioco[8] == gioco[2] && gioco[2] != 0) {//verticale dentra
            if (gioco[2] == 1) {
                bottoni[2].setBackgroundResource(R.drawable.xvittory);
                bottoni[5].setBackgroundResource(R.drawable.xvittory);
                bottoni[8].setBackgroundResource(R.drawable.xvittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageView);
                createImageFromBitmap(b);
                Gioco.this.startActivity(VintoX);
                finish();
            } else {
                bottoni[2].setBackgroundResource(R.drawable.ovittory);
                bottoni[5].setBackgroundResource(R.drawable.ovittory);
                bottoni[8].setBackgroundResource(R.drawable.ovittory);
                Bitmap b = Screenshot.takescreenshotOfRootView(imageView);
                createImageFromBitmap(b);
                Gioco.this.startActivity(VintoO);
                finish();
            }
        } else if (gioco[0] != 0 && gioco[1] != 0 && gioco[2] != 0 && gioco[3] != 0 && gioco[4] != 0 && gioco[5] != 0 && gioco[6] != 0 && gioco[7] != 0 && gioco[8] != 0) {
            Bitmap b = Screenshot.takescreenshotOfRootView(imageView);
            createImageFromBitmap(b);
            Gioco.this.startActivity(Pareggio);
            finish();
        }
    }

    void computer_scemo(int gioco[], Button bottoni[], int rispostaMain) {
        ArrayList<Integer> casellevuote = new ArrayList<Integer>(0);
        for (int i = 0; i < 9; i++) {
            if (gioco[i] == 0) {
                casellevuote.add(i);
            }
        }
        if (casellevuote.size() > 0) {
            Random r = new Random();
            int grandezza = casellevuote.size();
            int posizione = r.nextInt(grandezza);
            if ((int) rispostaMain == 1) {
                bottoni[casellevuote.get(posizione)].setBackgroundResource(R.drawable.o);
                gioco[casellevuote.get(posizione)] = 2;
            } else if ((int) rispostaMain == 2) {
                bottoni[casellevuote.get(posizione)].setBackgroundResource(R.drawable.x);
                gioco[casellevuote.get(posizione)] = 1;
            }
        }
    }

    int convertitore(int rispostaMain) {
        int opposto = 0;
        if (rispostaMain == 2) {
            return 1;
        } else {
            return 2;
        }
    }

    void computer_intelligente(int gioco[], Button bottoni[], int rispostaMain) {
        int opposto = convertitore(rispostaMain);

        if (livello == 1 && gioco[4] == 0) {
            gioco[4] = opposto;
            if (opposto == 1) {
                bottoni[4].setBackgroundResource(R.drawable.x);
            } else
                bottoni[4].setBackgroundResource(R.drawable.o);

            //imposto la risposta del computer sul centro
        } else if (livello == 1 && gioco[4] == rispostaMain) {
            gioco[0] = opposto;
            if (opposto == 1) {
                bottoni[0].setBackgroundResource(R.drawable.x);
            } else
                bottoni[0].setBackgroundResource(R.drawable.o);

            //imposto il computer sulla cella 0
        } else if (livello == 2 && gioco[0] == rispostaMain && gioco[1] == rispostaMain && gioco[4] == opposto)//caso in cui la prima x non sia stata messa al centro
        {
            gioco[2] = opposto;
            if (opposto == 1) {
                bottoni[2].setBackgroundResource(R.drawable.x);
            } else
                bottoni[2].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 2
        }//caso1
        else if (livello == 2 && gioco[1] == rispostaMain && gioco[2] == rispostaMain && gioco[4] == opposto)//caso in cui la prima x non sia stata messa al centro
        {
            gioco[0] = opposto;
            if (opposto == 1) {
                bottoni[0].setBackgroundResource(R.drawable.x);
            } else
                bottoni[0].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 0
        }//caso2
        else if (livello == 2 && gioco[2] == rispostaMain && gioco[5] == rispostaMain && gioco[4] == opposto)//caso in cui la prima x non sia stata messa al centro
        {
            gioco[8] = opposto;
            if (opposto == 1) {
                bottoni[8].setBackgroundResource(R.drawable.x);
            } else
                bottoni[8].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 8
        }//caso3
        else if (livello == 2 && gioco[8] == rispostaMain && gioco[5] == rispostaMain && gioco[4] == opposto)//caso in cui la prima x non sia stata messa al centro
        {
            gioco[2] = opposto;
            if (opposto == 1) {
                bottoni[2].setBackgroundResource(R.drawable.x);
            } else
                bottoni[2].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 2
        }//caso4
        else if (livello == 2 && gioco[8] == rispostaMain && gioco[7] == rispostaMain && gioco[4] == opposto)//caso in cui la prima x non sia stata messa al centro
        {
            gioco[6] = opposto;
            if (opposto == 1) {
                bottoni[6].setBackgroundResource(R.drawable.x);
            } else
                bottoni[6].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 6
        }//caso5
        else if (livello == 2 && gioco[6] == rispostaMain && gioco[7] == rispostaMain && gioco[4] == opposto)//caso in cui la prima x non sia stata messa al centro
        {
            gioco[8] = opposto;
            if (opposto == 1) {
                bottoni[8].setBackgroundResource(R.drawable.x);
            } else
                bottoni[8].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 8
        }//caso6
        else if (livello == 2 && gioco[0] == rispostaMain && gioco[3] == rispostaMain && gioco[4] == opposto)//caso in cui la prima x non sia stata messa al centro
        {
            gioco[6] = opposto;
            if (opposto == 1) {
                bottoni[6].setBackgroundResource(R.drawable.x);
            } else
                bottoni[6].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 6
        }//caso7
        else if (livello == 2 && gioco[3] == rispostaMain && gioco[6] == rispostaMain && gioco[4] == opposto)//caso in cui la prima x non sia stata messa al centro
        {
            gioco[0] = opposto;
            if (opposto == 1) {
                bottoni[0].setBackgroundResource(R.drawable.x);
            } else
                bottoni[0].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 0
        }//caso8
        else if (livello == 2 && gioco[0] == rispostaMain && gioco[2] == rispostaMain && gioco[4] == opposto)//caso in cui la prima x non sia stata messa al centro
        {
            gioco[1] = opposto;
            if (opposto == 1) {
                bottoni[1].setBackgroundResource(R.drawable.x);
            } else
                bottoni[1].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 1
        }//caso9
        else if (livello == 2 && gioco[0] == rispostaMain && gioco[6] == rispostaMain && gioco[4] == opposto)//caso in cui la prima x non sia stata messa al centro
        {
            gioco[3] = opposto;
            if (opposto == 1) {
                bottoni[3].setBackgroundResource(R.drawable.x);
            } else
                bottoni[3].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 3
        }//caso10
        else if (livello == 2 && gioco[2] == rispostaMain && gioco[8] == rispostaMain && gioco[4] == opposto)//caso in cui la prima x non sia stata messa al centro
        {
            gioco[5] = opposto;
            if (opposto == 1) {
                bottoni[5].setBackgroundResource(R.drawable.x);
            } else
                bottoni[5].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 5
        }//caso11
        else if (livello == 2 && gioco[6] == rispostaMain && gioco[8] == rispostaMain && gioco[4] == opposto)//caso in cui la prima x non sia stata messa al centro
        {
            gioco[7] = opposto;
            if (opposto == 1) {
                bottoni[7].setBackgroundResource(R.drawable.x);
            } else
                bottoni[7].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 7
        }//caso12
        else if (livello == 2 && gioco[0] == rispostaMain && gioco[8] == rispostaMain && gioco[4] == opposto)//caso in cui la prima x non sia stata messa al centro
        {
            gioco[3] = opposto;
            if (opposto == 1) {
                bottoni[3].setBackgroundResource(R.drawable.x);
            } else
                bottoni[3].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 3
        }//caso13
        else if (livello == 2 && gioco[2] == rispostaMain && gioco[6] == rispostaMain && gioco[4] == opposto)//caso in cui la prima x non sia stata messa al centro
        {
            gioco[5] = opposto;
            if (opposto == 1) {
                bottoni[5].setBackgroundResource(R.drawable.x);
            } else
                bottoni[5].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 5
        }//caso14
        else if (livello == 2 && gioco[1] == rispostaMain && gioco[4] == opposto && gioco[7] == rispostaMain)//caso in cui la prima x non sia stata messa al centro
        {
            gioco[5] = opposto;
            if (opposto == 1) {
                bottoni[5].setBackgroundResource(R.drawable.x);
            } else
                bottoni[5].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 5
        }//caso15
        else if (livello == 2 && gioco[0] == opposto && gioco[1] == rispostaMain && gioco[4] == rispostaMain)//caso in cui la prima x sia stata messa al centro
        {
            gioco[7] = opposto;
            if (opposto == 1) {
                bottoni[7].setBackgroundResource(R.drawable.x);
            } else
                bottoni[7].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 7
        }//caso16
        else if (livello == 2 && gioco[0] == opposto && gioco[2] == rispostaMain && gioco[4] == rispostaMain)//caso in cui la prima x sia stata messa al centro
        {
            gioco[6] = opposto;
            if (opposto == 1) {
                bottoni[6].setBackgroundResource(R.drawable.x);
            } else
                bottoni[6].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 6
        }//caso17
        else if (livello == 2 && gioco[0] == opposto && gioco[3] == rispostaMain && gioco[4] == rispostaMain)//caso in cui la prima x sia stata messa al centro
        {
            gioco[5] = opposto;
            if (opposto == 1) {
                bottoni[5].setBackgroundResource(R.drawable.x);
            } else
                bottoni[5].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 5
        }//caso18
        else if (livello == 2 && gioco[0] == opposto && gioco[5] == rispostaMain && gioco[4] == rispostaMain)//caso in cui la prima x sia stata messa al centro
        {
            gioco[3] = opposto;
            if (opposto == 1) {
                bottoni[3].setBackgroundResource(R.drawable.x);
            } else
                bottoni[3].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 3
        }//caso19
        else if (livello == 2 && gioco[0] == opposto && gioco[6] == rispostaMain && gioco[4] == rispostaMain)//caso in cui la prima x sia stata messa al centro
        {
            gioco[2] = opposto;
            if (opposto == 1) {
                bottoni[2].setBackgroundResource(R.drawable.x);
            } else
                bottoni[2].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 2
        }//caso20
        else if (livello == 2 && gioco[0] == opposto && gioco[7] == rispostaMain && gioco[4] == rispostaMain)//caso in cui la prima x sia stata messa al centro
        {
            gioco[1] = opposto;
            if (opposto == 1) {
                bottoni[1].setBackgroundResource(R.drawable.x);
            } else
                bottoni[1].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 1
        }//caso21
        else if (livello == 2 && gioco[0] == opposto && gioco[8] == rispostaMain && gioco[4] == rispostaMain)//caso in cui la prima x sia stata messa al centro
        {
            gioco[3] = opposto;
            if (opposto == 1) {
                bottoni[3].setBackgroundResource(R.drawable.x);
            } else
                bottoni[3].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 3
        }//caso22


        else if (livello == 3 && gioco[0] == rispostaMain && gioco[1] == rispostaMain && gioco[2] == opposto && gioco[3] == rispostaMain && gioco[4] == opposto) {
            gioco[6] = opposto;
            if (opposto == 1) {
                bottoni[6].setBackgroundResource(R.drawable.x);
            } else
                bottoni[6].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 6
        }//caso 1.1

        else if (livello == 3 && gioco[0] == rispostaMain && gioco[1] == rispostaMain && gioco[2] == opposto && gioco[4] == opposto && gioco[5] == rispostaMain) {
            gioco[6] = opposto;
            if (opposto == 1) {
                bottoni[6].setBackgroundResource(R.drawable.x);
            } else
                bottoni[6].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 6
        }//caso 1.3
        else if (livello == 3 && gioco[0] == rispostaMain && gioco[1] == rispostaMain && gioco[2] == opposto && gioco[4] == opposto && gioco[7] == rispostaMain) {
            gioco[6] = opposto;
            if (opposto == 1) {
                bottoni[6].setBackgroundResource(R.drawable.x);
            } else
                bottoni[6].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 6
        }//caso 1.4
        else if (livello == 3 && gioco[0] == rispostaMain && gioco[1] == rispostaMain && gioco[2] == opposto && gioco[4] == opposto && gioco[8] == rispostaMain) {
            gioco[6] = opposto;
            if (opposto == 1) {
                bottoni[6].setBackgroundResource(R.drawable.x);
            } else
                bottoni[6].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 6
        }//caso 1.5
        else if (livello == 3 && gioco[0] == rispostaMain && gioco[1] == rispostaMain && gioco[2] == opposto && gioco[4] == opposto && gioco[6] == rispostaMain) {
            gioco[3] = opposto;
            if (opposto == 1) {
                bottoni[3].setBackgroundResource(R.drawable.x);
            } else
                bottoni[3].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 3
        }//caso 1.2
        else if (livello == 4 && gioco[0] == rispostaMain && gioco[1] == rispostaMain && gioco[2] == opposto && gioco[3] == opposto && gioco[4] == opposto && gioco[7] == rispostaMain && gioco[6] == rispostaMain) {
            gioco[5] = opposto;
            if (opposto == 1) {
                bottoni[5].setBackgroundResource(R.drawable.x);
            } else
                bottoni[5].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 5
        }//caso 1.2.1
        else if (livello == 4 && gioco[0] == rispostaMain && gioco[1] == rispostaMain && gioco[2] == opposto && gioco[3] == opposto && gioco[4] == opposto && gioco[8] == rispostaMain && gioco[6] == rispostaMain) {
            gioco[5] = opposto;
            if (opposto == 1) {
                bottoni[5].setBackgroundResource(R.drawable.x);
            } else
                bottoni[5].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 5
        }//caso 1.2.2
        else if (livello == 4 && gioco[0] == rispostaMain && gioco[1] == rispostaMain && gioco[2] == opposto && gioco[3] == opposto && gioco[4] == opposto && gioco[5] == rispostaMain && gioco[6] == rispostaMain) {
            gioco[8] = opposto;
            if (opposto == 1) {
                bottoni[8].setBackgroundResource(R.drawable.x);
            } else
                bottoni[8].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 8
        }//caso 1.2.3


        else if (livello == 3 && gioco[0] == opposto && gioco[1] == rispostaMain && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[3] == rispostaMain) {
            gioco[8] = opposto;
            if (opposto == 1) {
                bottoni[8].setBackgroundResource(R.drawable.x);
            } else
                bottoni[8].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 8
        }//2.1
        else if (livello == 3 && gioco[0] == opposto && gioco[1] == rispostaMain && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[6] == rispostaMain) {
            gioco[8] = opposto;
            if (opposto == 1) {
                bottoni[8].setBackgroundResource(R.drawable.x);
            } else
                bottoni[8].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 8
        }//2.2
        else if (livello == 3 && gioco[0] == opposto && gioco[1] == rispostaMain && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[7] == rispostaMain) {
            gioco[8] = opposto;
            if (opposto == 1) {
                bottoni[8].setBackgroundResource(R.drawable.x);
            } else
                bottoni[8].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 8
        }//2.3

        else if (livello == 3 && gioco[0] == opposto && gioco[1] == rispostaMain && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[5] == rispostaMain) {
            gioco[8] = opposto;
            if (opposto == 1) {
                bottoni[8].setBackgroundResource(R.drawable.x);
            } else
                bottoni[8].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 8
        }//2.5
        else if (livello == 3 && gioco[0] == opposto && gioco[1] == rispostaMain && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[8] == rispostaMain) {
            gioco[5] = opposto;
            if (opposto == 1) {
                bottoni[5].setBackgroundResource(R.drawable.x);
            } else
                bottoni[5].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 5
        }//2.4
        else if (livello == 4 && gioco[0] == opposto && gioco[1] == rispostaMain && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[5] == opposto && gioco[8] == rispostaMain && gioco[7] == rispostaMain) {
            gioco[3] = opposto;
            if (opposto == 1) {
                bottoni[3].setBackgroundResource(R.drawable.x);
            } else
                bottoni[3].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 3
        }//2.4.1
        else if (livello == 4 && gioco[0] == opposto && gioco[1] == rispostaMain && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[5] == opposto && gioco[8] == rispostaMain && gioco[6] == rispostaMain) {
            gioco[3] = opposto;
            if (opposto == 1) {
                bottoni[3].setBackgroundResource(R.drawable.x);
            } else
                bottoni[3].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 3
        }//2.4.2
        else if (livello == 4 && gioco[0] == opposto && gioco[1] == rispostaMain && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[5] == opposto && gioco[8] == rispostaMain && gioco[3] == rispostaMain) {
            gioco[7] = opposto;
            if (opposto == 1) {
                bottoni[7].setBackgroundResource(R.drawable.x);
            } else
                bottoni[7].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 7
        }//2.4.1

        else if (livello == 3 && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[5] == rispostaMain && gioco[8] == opposto && gioco[1] == rispostaMain) {
            //imposto il computer sulla cella 0
            gioco[0] = opposto;
            if (opposto == 1) {
                bottoni[0].setBackgroundResource(R.drawable.x);
            } else
                bottoni[0].setBackgroundResource(R.drawable.o);

        }//3.1
        else if (livello == 3 && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[5] == rispostaMain && gioco[8] == opposto && gioco[3] == rispostaMain) {
            gioco[0] = opposto;
            if (opposto == 1) {
                bottoni[0].setBackgroundResource(R.drawable.x);
            } else
                bottoni[0].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 0
        }//3.2
        else if (livello == 3 && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[5] == rispostaMain && gioco[8] == opposto && gioco[6] == rispostaMain) {
            gioco[0] = opposto;
            if (opposto == 1) {
                bottoni[0].setBackgroundResource(R.drawable.x);
            } else
                bottoni[0].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 0
        }//3.3
        else if (livello == 3 && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[5] == rispostaMain && gioco[8] == opposto && gioco[7] == rispostaMain) {
            gioco[0] = opposto;
            if (opposto == 1) {
                bottoni[0].setBackgroundResource(R.drawable.x);
            } else
                bottoni[0].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 0
        }//3.4
        else if (livello == 3 && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[5] == rispostaMain && gioco[8] == opposto && gioco[0] == rispostaMain) {
            gioco[1] = opposto;
            if (opposto == 1) {
                bottoni[1].setBackgroundResource(R.drawable.x);
            } else
                bottoni[1].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 1
        }//3.5
        else if (livello == 4 && gioco[0] == rispostaMain && gioco[1] == opposto && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[8] == opposto && gioco[5] == rispostaMain && gioco[6] == rispostaMain) {
            gioco[7] = opposto;
            if (opposto == 1) {
                bottoni[7].setBackgroundResource(R.drawable.x);
            } else
                bottoni[7].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 7
        }//3.5.1
        else if (livello == 4 && gioco[0] == rispostaMain && gioco[1] == opposto && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[8] == opposto && gioco[5] == rispostaMain && gioco[3] == rispostaMain) {
            gioco[7] = opposto;
            if (opposto == 1) {
                bottoni[7].setBackgroundResource(R.drawable.x);
            } else
                bottoni[7].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 7
        }//3.5.2
        else if (livello == 4 && gioco[0] == rispostaMain && gioco[1] == opposto && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[8] == opposto && gioco[5] == rispostaMain && gioco[7] == rispostaMain) {
            gioco[3] = opposto;
            if (opposto == 1) {
                bottoni[3].setBackgroundResource(R.drawable.x);
            } else
                bottoni[3].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 3
        }//3.5.3


        else if (livello == 3 && gioco[2] == opposto && gioco[4] == opposto && gioco[5] == rispostaMain && gioco[8] == rispostaMain && gioco[1] == rispostaMain) {
            gioco[6] = opposto;
            if (opposto == 1) {
                bottoni[6].setBackgroundResource(R.drawable.x);
            } else
                bottoni[6].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 6
        }//4.1
        else if (livello == 3 && gioco[2] == opposto && gioco[4] == opposto && gioco[5] == rispostaMain && gioco[8] == rispostaMain && gioco[0] == rispostaMain) {
            gioco[6] = opposto;
            if (opposto == 1) {
                bottoni[6].setBackgroundResource(R.drawable.x);
            } else
                bottoni[6].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 6
        }//4.2
        else if (livello == 3 && gioco[2] == opposto && gioco[4] == opposto && gioco[5] == rispostaMain && gioco[8] == rispostaMain && gioco[3] == rispostaMain) {
            gioco[6] = opposto;
            if (opposto == 1) {
                bottoni[6].setBackgroundResource(R.drawable.x);
            } else
                bottoni[6].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 6
        }//4.3
        else if (livello == 3 && gioco[2] == opposto && gioco[4] == opposto && gioco[5] == rispostaMain && gioco[8] == rispostaMain && gioco[7] == rispostaMain) {
            gioco[6] = opposto;
            if (opposto == 1) {
                bottoni[6].setBackgroundResource(R.drawable.x);
            } else
                bottoni[6].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 6
        }//4.4
        else if (livello == 3 && gioco[2] == opposto && gioco[4] == opposto && gioco[5] == rispostaMain && gioco[8] == rispostaMain && gioco[6] == rispostaMain) {
            gioco[7] = opposto;
            if (opposto == 1) {
                bottoni[7].setBackgroundResource(R.drawable.x);
            } else
                bottoni[7].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 7
        }//4.5
        else if (livello == 4 && gioco[2] == opposto && gioco[4] == opposto && gioco[5] == rispostaMain && gioco[6] == rispostaMain && gioco[7] == opposto && gioco[8] == rispostaMain && gioco[3] == rispostaMain) {
            gioco[1] = opposto;
            if (opposto == 1) {
                bottoni[1].setBackgroundResource(R.drawable.x);
            } else
                bottoni[1].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 1
        }//4.5.1
        else if (livello == 4 && gioco[2] == opposto && gioco[4] == opposto && gioco[5] == rispostaMain && gioco[6] == rispostaMain && gioco[7] == opposto && gioco[8] == rispostaMain && gioco[0] == rispostaMain) {
            gioco[1] = opposto;
            if (opposto == 1) {
                bottoni[1].setBackgroundResource(R.drawable.x);
            } else
                bottoni[1].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 1
        }//4.5.2
        else if (livello == 4 && gioco[2] == opposto && gioco[4] == opposto && gioco[5] == rispostaMain && gioco[6] == rispostaMain && gioco[7] == opposto && gioco[8] == rispostaMain && gioco[1] == rispostaMain) {
            gioco[0] = opposto;
            if (opposto == 1) {
                bottoni[0].setBackgroundResource(R.drawable.x);
            } else
                bottoni[0].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 0
        }//4.5.3


        else if (livello == 3 && gioco[4] == opposto && gioco[6] == opposto && gioco[7] == rispostaMain && gioco[8] == rispostaMain && gioco[3] == rispostaMain) {
            gioco[2] = opposto;
            if (opposto == 1) {
                bottoni[2].setBackgroundResource(R.drawable.x);
            } else
                bottoni[2].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 2
        }//5.1
        else if (livello == 3 && gioco[4] == opposto && gioco[6] == opposto && gioco[7] == rispostaMain && gioco[8] == rispostaMain && gioco[0] == rispostaMain) {
            gioco[2] = opposto;
            if (opposto == 1) {
                bottoni[2].setBackgroundResource(R.drawable.x);
            } else
                bottoni[2].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 2
        }//5.2
        else if (livello == 3 && gioco[4] == opposto && gioco[6] == opposto && gioco[7] == rispostaMain && gioco[8] == rispostaMain && gioco[1] == rispostaMain) {
            gioco[2] = opposto;
            if (opposto == 1) {
                bottoni[2].setBackgroundResource(R.drawable.x);
            } else
                bottoni[2].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 2
        }//5.3
        else if (livello == 3 && gioco[4] == opposto && gioco[6] == opposto && gioco[7] == rispostaMain && gioco[8] == rispostaMain && gioco[5] == rispostaMain) {
            gioco[2] = opposto;
            if (opposto == 1) {
                bottoni[2].setBackgroundResource(R.drawable.x);
            } else
                bottoni[2].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 2
        }//5.4
        else if (livello == 3 && gioco[4] == opposto && gioco[6] == opposto && gioco[7] == rispostaMain && gioco[8] == rispostaMain && gioco[2] == rispostaMain) {
            gioco[5] = opposto;
            if (opposto == 1) {
                bottoni[5].setBackgroundResource(R.drawable.x);
            } else
                bottoni[5].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 5
        }//5.5
        else if (livello == 4 && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[5] == opposto && gioco[6] == opposto && gioco[7] == rispostaMain && gioco[8] == rispostaMain && gioco[1] == rispostaMain) {
            gioco[3] = opposto;
            if (opposto == 1) {
                bottoni[3].setBackgroundResource(R.drawable.x);
            } else
                bottoni[3].setBackgroundResource(R.drawable.o);

            //imposto il computer sulla cella 3
        }//5.5.1
        else if (livello == 4 && gioco[0] == rispostaMain && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[5] == opposto && gioco[6] == opposto && gioco[7] == rispostaMain && gioco[8] == rispostaMain) {
            gioco[3] = opposto;
            if (opposto == 1) {
                bottoni[3].setBackgroundResource(R.drawable.x);
            } else
                bottoni[3].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 3
        }//5.5.2
        else if (livello == 4 && gioco[2] == rispostaMain && gioco[3] == rispostaMain && gioco[4] == opposto && gioco[5] == opposto && gioco[6] == opposto && gioco[7] == rispostaMain && gioco[8] == rispostaMain) {
            gioco[0] = opposto;
            if (opposto == 1) {
                bottoni[0].setBackgroundResource(R.drawable.x);
            } else
                bottoni[0].setBackgroundResource(R.drawable.o);

            //imposto il computer sulla cella 0
        }//5.5.3


        else if (livello == 3 && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[7] == rispostaMain && gioco[8] == opposto && gioco[3] == rispostaMain) {
            gioco[0] = opposto;
            if (opposto == 1) {
                bottoni[0].setBackgroundResource(R.drawable.x);
            } else
                bottoni[0].setBackgroundResource(R.drawable.o);

            //imposto il computer sulla cella 0
        }//6.1
        else if (livello == 3 && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[7] == rispostaMain && gioco[8] == opposto && gioco[1] == rispostaMain) {
            gioco[0] = opposto;
            if (opposto == 1) {
                bottoni[0].setBackgroundResource(R.drawable.x);
            } else
                bottoni[0].setBackgroundResource(R.drawable.o);

            //imposto il computer sulla cella 0
        }//6.2
        else if (livello == 3 && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[7] == rispostaMain && gioco[8] == opposto && gioco[2] == rispostaMain) {
            gioco[0] = opposto;
            if (opposto == 1) {
                bottoni[0].setBackgroundResource(R.drawable.x);
            } else
                bottoni[0].setBackgroundResource(R.drawable.o);

            //imposto il computer sulla cella 0
        }//6.3
        else if (livello == 3 && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[7] == rispostaMain && gioco[8] == opposto && gioco[5] == rispostaMain) {
            gioco[0] = opposto;
            if (opposto == 1) {
                bottoni[0].setBackgroundResource(R.drawable.x);
            } else
                bottoni[0].setBackgroundResource(R.drawable.o);

            //imposto il computer sulla cella 0
        }//6.4
        else if (livello == 3 && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[7] == rispostaMain && gioco[8] == opposto && gioco[0] == rispostaMain) {
            gioco[3] = opposto;
            if (opposto == 1) {
                bottoni[3].setBackgroundResource(R.drawable.x);
            } else
                bottoni[3].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 3
        }//6.5
        else if (livello == 4 && gioco[0] == rispostaMain && gioco[3] == opposto && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[7] == rispostaMain && gioco[8] == opposto && gioco[1] == rispostaMain) {
            gioco[5] = opposto;
            if (opposto == 1) {
                bottoni[5].setBackgroundResource(R.drawable.x);
            } else
                bottoni[5].setBackgroundResource(R.drawable.o);

            //imposto il computer sulla cella 5
        }//6.5.1
        else if (livello == 4 && gioco[0] == rispostaMain && gioco[3] == opposto && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[7] == rispostaMain && gioco[8] == opposto && gioco[2] == rispostaMain) {
            gioco[5] = opposto;
            if (opposto == 1) {
                bottoni[5].setBackgroundResource(R.drawable.x);
            } else
                bottoni[5].setBackgroundResource(R.drawable.o);

            //imposto il computer sulla cella 5
        }//6.5.2
        else if (livello == 4 && gioco[0] == rispostaMain && gioco[3] == opposto && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[7] == rispostaMain && gioco[8] == opposto && gioco[5] == rispostaMain) {
            gioco[1] = opposto;
            if (opposto == 1) {
                bottoni[1].setBackgroundResource(R.drawable.x);
            } else
                bottoni[1].setBackgroundResource(R.drawable.o);

            //imposto il computer sulla cella 1
        }//6.5.3
        else if (livello == 3 && gioco[0] == rispostaMain && gioco[3] == rispostaMain && gioco[4] == opposto && gioco[6] == opposto && gioco[1] == rispostaMain) {

            gioco[2] = opposto;
            if (opposto == 1) {
                bottoni[2].setBackgroundResource(R.drawable.x);
            } else
                bottoni[2].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 2
        }//7.1
        else if (livello == 3 && gioco[0] == rispostaMain && gioco[3] == rispostaMain && gioco[4] == opposto && gioco[6] == opposto && gioco[5] == rispostaMain) {

            gioco[2] = opposto;
            if (opposto == 1) {
                bottoni[2].setBackgroundResource(R.drawable.x);
            } else
                bottoni[2].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 2
        }//7.2
        else if (livello == 3 && gioco[0] == rispostaMain && gioco[3] == rispostaMain && gioco[4] == opposto && gioco[6] == opposto && gioco[8] == rispostaMain) {

            gioco[2] = opposto;
            if (opposto == 1) {
                bottoni[2].setBackgroundResource(R.drawable.x);
            } else
                bottoni[2].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 2
        }//7.3
        else if (livello == 3 && gioco[0] == rispostaMain && gioco[3] == rispostaMain && gioco[4] == opposto && gioco[6] == opposto && gioco[7] == rispostaMain) {

            gioco[2] = opposto;
            if (opposto == 1) {
                bottoni[2].setBackgroundResource(R.drawable.x);
            } else
                bottoni[2].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 2
        }//7.4
        else if (livello == 3 && gioco[0] == rispostaMain && gioco[3] == rispostaMain && gioco[4] == opposto && gioco[6] == opposto && gioco[2] == rispostaMain) {
            gioco[1] = opposto;
            if (opposto == 1) {
                bottoni[1].setBackgroundResource(R.drawable.x);
            } else
                bottoni[1].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 1
        }//7.5
        else if (livello == 4 && gioco[0] == rispostaMain && gioco[1] == opposto && gioco[2] == rispostaMain && gioco[3] == rispostaMain && gioco[4] == opposto && gioco[6] == opposto && gioco[5] == rispostaMain) {
            gioco[7] = opposto;
            if (opposto == 1) {
                bottoni[7].setBackgroundResource(R.drawable.x);
            } else
                bottoni[7].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 7
        }//7.5.1
        else if (livello == 4 && gioco[0] == rispostaMain && gioco[1] == opposto && gioco[2] == rispostaMain && gioco[3] == rispostaMain && gioco[4] == opposto && gioco[6] == opposto && gioco[8] == rispostaMain) {
            gioco[7] = opposto;
            if (opposto == 1) {
                bottoni[7].setBackgroundResource(R.drawable.x);
            } else
                bottoni[7].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 7
        }//7.5.2
        else if (livello == 4 && gioco[0] == rispostaMain && gioco[1] == opposto && gioco[2] == rispostaMain && gioco[3] == rispostaMain && gioco[4] == opposto && gioco[6] == opposto && gioco[7] == rispostaMain) {
            gioco[8] = opposto;
            if (opposto == 1) {
                bottoni[8].setBackgroundResource(R.drawable.x);
            } else
                bottoni[8].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 8
        }//7.5.3
        else if (livello == 3 && gioco[0] == opposto && gioco[3] == rispostaMain && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[1] == rispostaMain) {
            gioco[8] = opposto;
            if (opposto == 1) {
                bottoni[8].setBackgroundResource(R.drawable.x);
            } else
                bottoni[8].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 8
        }//8.1
        else if (livello == 3 && gioco[0] == opposto && gioco[3] == rispostaMain && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[7] == rispostaMain) {
            gioco[8] = opposto;
            if (opposto == 1) {
                bottoni[8].setBackgroundResource(R.drawable.x);
            } else
                bottoni[8].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 8
        }//8.2
        else if (livello == 3 && gioco[0] == opposto && gioco[3] == rispostaMain && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[2] == rispostaMain) {
            gioco[8] = opposto;
            if (opposto == 1) {
                bottoni[8].setBackgroundResource(R.drawable.x);
            } else
                bottoni[8].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 8
        }//8.3
        else if (livello == 3 && gioco[0] == opposto && gioco[3] == rispostaMain && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[5] == rispostaMain) {
            gioco[8] = opposto;
            if (opposto == 1) {
                bottoni[8].setBackgroundResource(R.drawable.x);
            } else
                bottoni[8].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 8
        }//8.4
        else if (livello == 3 && gioco[0] == opposto && gioco[3] == rispostaMain && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[8] == rispostaMain) {
            gioco[7] = opposto;
            if (opposto == 1) {
                bottoni[7].setBackgroundResource(R.drawable.x);
            } else
                bottoni[7].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 7
        }//8.5
        else if (livello == 4 && gioco[0] == opposto && gioco[3] == rispostaMain && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[7] == opposto && gioco[8] == rispostaMain && gioco[5] == rispostaMain) {
            gioco[1] = opposto;
            if (opposto == 1) {
                bottoni[1].setBackgroundResource(R.drawable.x);
            } else
                bottoni[1].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 1
        }//8.5.1
        else if (livello == 4 && gioco[0] == opposto && gioco[3] == rispostaMain && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[7] == opposto && gioco[8] == rispostaMain && gioco[2] == rispostaMain) {
            gioco[1] = opposto;
            if (opposto == 1) {
                bottoni[1].setBackgroundResource(R.drawable.x);
            } else
                bottoni[1].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 1
        }//8.5.2
        else if (livello == 4 && gioco[0] == opposto && gioco[3] == rispostaMain && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[7] == opposto && gioco[8] == rispostaMain && gioco[1] == rispostaMain) {
            gioco[5] = opposto;
            if (opposto == 1) {
                bottoni[5].setBackgroundResource(R.drawable.x);
            } else
                bottoni[5].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 5
        }//8.5.3
        else if (livello == 3 && gioco[0] == rispostaMain && gioco[1] == opposto && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[3] == rispostaMain) {
            gioco[7] = opposto;
            if (opposto == 1) {
                bottoni[7].setBackgroundResource(R.drawable.x);
            } else
                bottoni[7].setBackgroundResource(R.drawable.o);

            //imposto il computer sulla cella 7
        }//9.1
        else if (livello == 3 && gioco[0] == rispostaMain && gioco[1] == opposto && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[6] == rispostaMain) {
            gioco[7] = opposto;
            if (opposto == 1) {
                bottoni[7].setBackgroundResource(R.drawable.x);
            } else
                bottoni[7].setBackgroundResource(R.drawable.o);

            //imposto il computer sulla cella 7
        }//9.2
        else if (livello == 3 && gioco[0] == rispostaMain && gioco[1] == opposto && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[8] == rispostaMain) {
            gioco[7] = opposto;
            if (opposto == 1) {
                bottoni[7].setBackgroundResource(R.drawable.x);
            } else
                bottoni[7].setBackgroundResource(R.drawable.o);

            //imposto il computer sulla cella 7
        }//9.3
        else if (livello == 3 && gioco[0] == rispostaMain && gioco[1] == opposto && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[5] == rispostaMain) {
            gioco[7] = opposto;
            if (opposto == 1) {
                bottoni[7].setBackgroundResource(R.drawable.x);
            } else
                bottoni[7].setBackgroundResource(R.drawable.o);

            //imposto il computer sulla cella 7
        }//9.4
        else if (livello == 3 && gioco[0] == rispostaMain && gioco[1] == opposto && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[7] == rispostaMain) {
            gioco[6] = opposto;
            if (opposto == 1) {
                bottoni[6].setBackgroundResource(R.drawable.x);
            } else
                bottoni[6].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 6
        }//9.5
        else if (livello == 4 && gioco[0] == rispostaMain && gioco[1] == opposto && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[6] == opposto && gioco[7] == rispostaMain && gioco[8] == rispostaMain) {
            gioco[5] = opposto;
            if (opposto == 1) {
                bottoni[5].setBackgroundResource(R.drawable.x);
            } else
                bottoni[5].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 5
        }//9.5.2
        else if (livello == 4 && gioco[0] == rispostaMain && gioco[1] == opposto && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[6] == opposto && gioco[7] == rispostaMain && gioco[5] == rispostaMain) {
            gioco[8] = opposto;
            if (opposto == 1) {
                bottoni[8].setBackgroundResource(R.drawable.x);
            } else
                bottoni[8].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 8
        }//9.5.3
        else if (livello == 3 && gioco[0] == rispostaMain && gioco[3] == opposto && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[1] == rispostaMain) {
            gioco[5] = opposto;
            if (opposto == 1) {
                bottoni[5].setBackgroundResource(R.drawable.x);
            } else
                bottoni[5].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 5
        }//10.1
        else if (livello == 3 && gioco[0] == rispostaMain && gioco[3] == opposto && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[2] == rispostaMain) {
            gioco[5] = opposto;
            if (opposto == 1) {
                bottoni[5].setBackgroundResource(R.drawable.x);
            } else
                bottoni[5].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 5
        }//10.2
        else if (livello == 3 && gioco[0] == rispostaMain && gioco[3] == opposto && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[8] == rispostaMain) {
            gioco[5] = opposto;
            if (opposto == 1) {
                bottoni[5].setBackgroundResource(R.drawable.x);
            } else
                bottoni[5].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 5
        }//10.3
        else if (livello == 3 && gioco[0] == rispostaMain && gioco[3] == opposto && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[7] == rispostaMain) {
            gioco[5] = opposto;
            if (opposto == 1) {
                bottoni[5].setBackgroundResource(R.drawable.x);
            } else
                bottoni[5].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 5
        }//10.4
        else if (livello == 3 && gioco[0] == rispostaMain && gioco[3] == opposto && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[5] == rispostaMain) {
            gioco[1] = opposto;
            if (opposto == 1) {
                bottoni[1].setBackgroundResource(R.drawable.x);
            } else
                bottoni[1].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 1
        }//10.5
        else if (livello == 4 && gioco[0] == rispostaMain && gioco[1] == opposto && gioco[3] == opposto && gioco[4] == opposto && gioco[5] == rispostaMain && gioco[6] == rispostaMain && gioco[2] == rispostaMain) {
            gioco[7] = opposto;
            if (opposto == 1) {
                bottoni[7].setBackgroundResource(R.drawable.x);
            } else
                bottoni[7].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 7
        }//10.5.1
        else if (livello == 4 && gioco[0] == rispostaMain && gioco[1] == opposto && gioco[3] == opposto && gioco[4] == opposto && gioco[5] == rispostaMain && gioco[6] == rispostaMain && gioco[8] == rispostaMain) {
            gioco[7] = opposto;
            if (opposto == 1) {
                bottoni[7].setBackgroundResource(R.drawable.x);
            } else
                bottoni[7].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 7
        }//10.5.2
        else if (livello == 4 && gioco[0] == rispostaMain && gioco[1] == opposto && gioco[3] == opposto && gioco[4] == opposto && gioco[5] == rispostaMain && gioco[6] == rispostaMain && gioco[7] == rispostaMain) {

            gioco[8] = opposto;
            if (opposto == 1) {
                bottoni[8].setBackgroundResource(R.drawable.x);
            } else
                bottoni[8].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 8
        }//10.5.3
        else if (livello == 3 && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[5] == opposto && gioco[8] == rispostaMain && gioco[1] == rispostaMain) {

            gioco[3] = opposto;
            if (opposto == 1) {
                bottoni[3].setBackgroundResource(R.drawable.x);
            } else
                bottoni[3].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 3
        }//11.1
        else if (livello == 3 && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[5] == opposto && gioco[8] == rispostaMain && gioco[0] == rispostaMain) {

            gioco[3] = opposto;
            if (opposto == 1) {
                bottoni[3].setBackgroundResource(R.drawable.x);
            } else
                bottoni[3].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 3
        }//11.1
        else if (livello == 3 && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[5] == opposto && gioco[8] == rispostaMain && gioco[6] == rispostaMain) {

            gioco[3] = opposto;
            if (opposto == 1) {
                bottoni[3].setBackgroundResource(R.drawable.x);
            } else
                bottoni[3].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 3
        }//11.1
        else if (livello == 3 && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[5] == opposto && gioco[8] == rispostaMain && gioco[7] == rispostaMain) {

            gioco[3] = opposto;
            if (opposto == 1) {
                bottoni[3].setBackgroundResource(R.drawable.x);
            } else
                bottoni[3].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 3
        }//11.1
        else if (livello == 3 && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[5] == opposto && gioco[8] == rispostaMain && gioco[3] == rispostaMain) {
            gioco[1] = opposto;
            if (opposto == 1) {
                bottoni[1].setBackgroundResource(R.drawable.x);
            } else
                bottoni[1].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 1
        }//11.1
        else if (livello == 4 && gioco[8] == rispostaMain && gioco[1] == opposto && gioco[2] == rispostaMain && gioco[3] == rispostaMain && gioco[4] == opposto && gioco[5] == opposto && gioco[0] == rispostaMain) {
            gioco[7] = opposto;
            if (opposto == 1) {
                bottoni[7].setBackgroundResource(R.drawable.x);
            } else
                bottoni[7].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 7
        }//11.5.1
        else if (livello == 4 && gioco[8] == rispostaMain && gioco[1] == opposto && gioco[2] == rispostaMain && gioco[3] == rispostaMain && gioco[4] == opposto && gioco[5] == opposto && gioco[6] == rispostaMain) {
            gioco[7] = opposto;
            if (opposto == 1) {
                bottoni[7].setBackgroundResource(R.drawable.x);
            } else
                bottoni[7].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 7
        }//11.5.2
        else if (livello == 4 && gioco[8] == rispostaMain && gioco[1] == opposto && gioco[2] == rispostaMain && gioco[3] == rispostaMain && gioco[4] == opposto && gioco[5] == opposto && gioco[7] == rispostaMain) {
            gioco[7] = opposto;
            if (opposto == 1) {
                bottoni[7].setBackgroundResource(R.drawable.x);
            } else
                bottoni[7].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 7
        }//11.5.3
        else if (livello == 3 && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[7] == opposto && gioco[8] == rispostaMain && gioco[3] == rispostaMain) {
            gioco[1] = opposto;
            if (opposto == 1) {
                bottoni[1].setBackgroundResource(R.drawable.x);
            } else
                bottoni[1].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 1
        }//12.1
        else if (livello == 3 && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[7] == opposto && gioco[8] == rispostaMain && gioco[0] == rispostaMain) {
            gioco[1] = opposto;
            if (opposto == 1) {
                bottoni[1].setBackgroundResource(R.drawable.x);
            } else
                bottoni[1].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 1
        }//12.2
        else if (livello == 3 && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[7] == opposto && gioco[8] == rispostaMain && gioco[2] == rispostaMain) {
            gioco[1] = opposto;
            if (opposto == 1) {
                bottoni[1].setBackgroundResource(R.drawable.x);
            } else
                bottoni[1].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 1
        }//12.3
        else if (livello == 3 && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[7] == opposto && gioco[8] == rispostaMain && gioco[5] == rispostaMain) {
            gioco[1] = opposto;
            if (opposto == 1) {
                bottoni[1].setBackgroundResource(R.drawable.x);
            } else
                bottoni[1].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 1
        }//12.4
        else if (livello == 3 && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[7] == opposto && gioco[8] == rispostaMain && gioco[1] == rispostaMain) {
            gioco[3] = opposto;
            if (opposto == 1) {
                bottoni[3].setBackgroundResource(R.drawable.x);
            } else
                bottoni[3].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 3
        }//12.5
        else if (livello == 4 && gioco[1] == rispostaMain && gioco[3] == opposto && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[7] == opposto && gioco[8] == rispostaMain && gioco[0] == rispostaMain) {
            gioco[5] = opposto;
            if (opposto == 1) {
                bottoni[5].setBackgroundResource(R.drawable.x);
            } else
                bottoni[5].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 5
        }//12.5.1
        else if (livello == 4 && gioco[1] == rispostaMain && gioco[3] == opposto && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[7] == opposto && gioco[8] == rispostaMain && gioco[2] == rispostaMain) {
            gioco[5] = 2;
            bottoni[5].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 5
        }//12.5.2
        else if (livello == 4 && gioco[1] == rispostaMain && gioco[3] == opposto && gioco[4] == opposto && gioco[6] == rispostaMain && gioco[7] == opposto && gioco[8] == rispostaMain && gioco[5] == rispostaMain) {
            gioco[0] = opposto;
            if (opposto == 1) {
                bottoni[0].setBackgroundResource(R.drawable.x);
            } else
                bottoni[0].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 0
        }//12.5.3
        else if (livello == 3 && gioco[0] == rispostaMain && gioco[3] == opposto && gioco[4] == opposto && gioco[8] == rispostaMain && gioco[1] == rispostaMain) {

            gioco[5] = opposto;
            if (opposto == 1) {
                bottoni[5].setBackgroundResource(R.drawable.x);
            } else
                bottoni[5].setBackgroundResource(R.drawable.o);

            //imposto il computer sulla cella 5
        }//13.1
        else if (livello == 3 && gioco[0] == rispostaMain && gioco[3] == opposto && gioco[4] == opposto && gioco[8] == rispostaMain && gioco[2] == rispostaMain) {

            gioco[5] = opposto;
            if (opposto == 1) {
                bottoni[5].setBackgroundResource(R.drawable.x);
            } else
                bottoni[5].setBackgroundResource(R.drawable.o);

            //imposto il computer sulla cella 5
        }//13.2
        else if (livello == 3 && gioco[0] == rispostaMain && gioco[3] == opposto && gioco[4] == opposto && gioco[8] == rispostaMain && gioco[7] == rispostaMain) {

            gioco[5] = opposto;
            if (opposto == 1) {
                bottoni[5].setBackgroundResource(R.drawable.x);
            } else
                bottoni[5].setBackgroundResource(R.drawable.o);

            //imposto il computer sulla cella 5
        }//13.3
        else if (livello == 3 && gioco[0] == rispostaMain && gioco[3] == opposto && gioco[4] == opposto && gioco[8] == rispostaMain && gioco[6] == rispostaMain) {

            gioco[5] = opposto;
            if (opposto == 1) {
                bottoni[5].setBackgroundResource(R.drawable.x);
            } else
                bottoni[5].setBackgroundResource(R.drawable.o);

            //imposto il computer sulla cella 5
        }//13.4
        else if (livello == 3 && gioco[0] == rispostaMain && gioco[3] == opposto && gioco[4] == opposto && gioco[8] == rispostaMain && gioco[5] == rispostaMain) {
            gioco[2] = opposto;
            if (opposto == 1) {
                bottoni[2].setBackgroundResource(R.drawable.x);
            } else
                bottoni[2].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 2
        }//13.5
        else if (livello == 4 && gioco[0] == rispostaMain && gioco[2] == opposto && gioco[3] == opposto && gioco[4] == opposto && gioco[5] == rispostaMain && gioco[8] == rispostaMain && gioco[1] == rispostaMain) {
            gioco[6] = opposto;
            if (opposto == 1) {
                bottoni[6].setBackgroundResource(R.drawable.x);
            } else
                bottoni[6].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 6
        }//13.5.1
        else if (livello == 4 && gioco[0] == rispostaMain && gioco[2] == opposto && gioco[3] == opposto && gioco[4] == opposto && gioco[5] == rispostaMain && gioco[8] == rispostaMain && gioco[7] == rispostaMain) {
            gioco[6] = opposto;
            if (opposto == 1) {
                bottoni[6].setBackgroundResource(R.drawable.x);
            } else
                bottoni[6].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 6
        }//13.5.2
        else if (livello == 4 && gioco[0] == rispostaMain && gioco[2] == opposto && gioco[3] == opposto && gioco[4] == opposto && gioco[5] == rispostaMain && gioco[8] == rispostaMain && gioco[6] == rispostaMain) {
            gioco[7] = opposto;
            if (opposto == 1) {
                bottoni[7].setBackgroundResource(R.drawable.x);
            } else
                bottoni[7].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 7
        }//13.5.3
        else if (livello == 3 && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[5] == opposto && gioco[6] == rispostaMain && gioco[1] == rispostaMain) {
            gioco[3] = opposto;
            if (opposto == 1) {
                bottoni[3].setBackgroundResource(R.drawable.x);
            } else
                bottoni[3].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 3
        }//14.1
        else if (livello == 3 && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[5] == opposto && gioco[6] == rispostaMain && gioco[0] == rispostaMain) {
            gioco[3] = opposto;
            if (opposto == 1) {
                bottoni[3].setBackgroundResource(R.drawable.x);
            } else
                bottoni[3].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 3
        }//14.2

        else if (livello == 3 && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[5] == opposto && gioco[6] == rispostaMain && gioco[7] == rispostaMain) {
            gioco[3] = opposto;
            if (opposto == 1) {
                bottoni[3].setBackgroundResource(R.drawable.x);
            } else
                bottoni[3].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 3
        }//14.3

        else if (livello == 3 && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[5] == opposto && gioco[6] == rispostaMain && gioco[8] == rispostaMain) {
            gioco[3] = opposto;
            if (opposto == 1) {
                bottoni[3].setBackgroundResource(R.drawable.x);
            } else
                bottoni[3].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 3
        }//14.4

        else if (livello == 3 && gioco[2] == rispostaMain && gioco[4] == opposto && gioco[5] == opposto && gioco[6] == rispostaMain && gioco[3] == rispostaMain) {
            gioco[0] = opposto;
            if (opposto == 1) {
                bottoni[0].setBackgroundResource(R.drawable.x);
            } else
                bottoni[0].setBackgroundResource(R.drawable.o);

            //imposto il computer sulla cella 0
        }//14.5
        else if (livello == 4 && gioco[0] == opposto && gioco[2] == rispostaMain && gioco[3] == rispostaMain && gioco[4] == opposto && gioco[5] == opposto && gioco[6] == rispostaMain && gioco[1] == rispostaMain) {
            gioco[8] = opposto;
            if (opposto == 1) {
                bottoni[8].setBackgroundResource(R.drawable.x);
            } else
                bottoni[8].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 8
        }//14.5.1
        else if (livello == 4 && gioco[0] == 2 && gioco[2] == rispostaMain && gioco[3] == rispostaMain && gioco[4] == 2 && gioco[5] == 2 && gioco[6] == rispostaMain && gioco[7] == rispostaMain) {
            gioco[8] = opposto;
            if (opposto == 1) {
                bottoni[8].setBackgroundResource(R.drawable.x);
            } else
                bottoni[8].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 8
        }//14.5.2
        else if (livello == 4 && gioco[0] == opposto && gioco[2] == rispostaMain && gioco[3] == rispostaMain && gioco[4] == opposto && gioco[5] == opposto && gioco[6] == rispostaMain && gioco[8] == rispostaMain) {
            gioco[7] = opposto;
            if (opposto == 1) {
                bottoni[7].setBackgroundResource(R.drawable.x);
            } else
                bottoni[7].setBackgroundResource(R.drawable.o);
            //imposto il computer sulla cella 7
        }//14.5.3


        else {
            ArrayList<Integer> casellevuote = new ArrayList<Integer>(0);
            for (int i = 0; i < 9; i++) {
                if (gioco[i] == 0) {
                    casellevuote.add(i);
                }
            }
            if (casellevuote.size() > 0) {
                Random r = new Random();
                int grandezza = casellevuote.size();
                int posizione = r.nextInt(grandezza);
                if ((int) rispostaMain == 1) {
                    bottoni[casellevuote.get(posizione)].setBackgroundResource(R.drawable.o);
                    gioco[casellevuote.get(posizione)] = 2;
                } else if ((int) rispostaMain == 2) {
                    bottoni[casellevuote.get(posizione)].setBackgroundResource(R.drawable.x);
                    gioco[casellevuote.get(posizione)] = 1;
                }
            }
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }
        setContentView(R.layout.activity_gioco);
        int gioco[] = new int[9];
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
        Button esci = findViewById(R.id.BottoneIndietroComputer);
        Intent esciI = new Intent(Gioco.this, MainActivity.class);
        bottoni[0] = findViewById(R.id.Bottone1);
        bottoni[1] = findViewById(R.id.Bottone2);
        bottoni[2] = findViewById(R.id.Bottone3);
        bottoni[3] = findViewById(R.id.Bottone4);
        bottoni[4] = findViewById(R.id.Bottone5);
        bottoni[5] = findViewById(R.id.Bottone6);
        bottoni[6] = findViewById(R.id.Bottone7);
        bottoni[7] = findViewById(R.id.Bottone8);
        bottoni[8] = findViewById(R.id.Bottone9);
        Intent VintoX = new Intent(Gioco.this, VintoX.class);
        Intent VintoO = new Intent(Gioco.this, VintoO.class);
        Intent Pareggio = new Intent(Gioco.this, Pareggio.class);

        TextView visualizzanome = (TextView) findViewById(R.id.Nomeplayersingolo);
        SharedPreferences myPrefs;
        myPrefs = getSharedPreferences("prefID", Context.MODE_PRIVATE);
        String nome = myPrefs.getString("Player1", "");
        if (nome.length() == 0) {
            visualizzanome.setText(nome);
        } else {
            String n = nome.substring(0, 1).toUpperCase();
            String nR = n + nome.substring(1);
            visualizzanome.setText(nR);

        }
        int rispostaMain = myPrefs.getInt("Scelta", 1);
        int difficolta = myPrefs.getInt("Difficolta", 1);
        bottoni[0].setOnClickListener(
                (View v) -> {
                    if (gioco[0] == 0) {
                        if ((int) rispostaMain == 1) {
                            bottoni[0].setBackgroundResource(R.drawable.x);
                            livello++;
                            gioco[0] = 1;
                        } else if ((int) rispostaMain == 2) {
                            bottoni[0].setBackgroundResource(R.drawable.o);
                            livello++;
                            gioco[0] = 2;
                        }
                        if (difficolta == 1) {
                            computer_intelligente(gioco, bottoni, rispostaMain);
                        } else if (difficolta == 2) {
                            computer_scemo(gioco, bottoni, rispostaMain);
                        }

                        checkWinner(gioco, bottoni, VintoX, VintoO, Pareggio);
                    }
                }
        );
        bottoni[1].setOnClickListener(
                (View v) -> {
                    if (gioco[1] == 0) {
                        if ((int) rispostaMain == 1) {
                            bottoni[1].setBackgroundResource(R.drawable.x);
                            livello++;
                            gioco[1] = 1;
                        } else if ((int) rispostaMain == 2) {
                            bottoni[1].setBackgroundResource(R.drawable.o);
                            livello++;
                            gioco[1] = 2;
                        }
                        if (difficolta == 1) {
                            computer_intelligente(gioco, bottoni, rispostaMain);
                        } else if (difficolta == 2) {
                            computer_scemo(gioco, bottoni, rispostaMain);
                        }

                        checkWinner(gioco, bottoni, VintoX, VintoO, Pareggio);
                    }
                }
        );
        bottoni[2].setOnClickListener(
                (View v) -> {
                    if (gioco[2] == 0) {
                        if ((int) rispostaMain == 1) {
                            bottoni[2].setBackgroundResource(R.drawable.x);
                            livello++;
                            gioco[2] = 1;
                        } else if ((int) rispostaMain == 2) {
                            bottoni[2].setBackgroundResource(R.drawable.o);
                            livello++;
                            gioco[2] = 2;
                        }
                        if (difficolta == 1) {
                            computer_intelligente(gioco, bottoni, rispostaMain);
                        } else if (difficolta == 2) {
                            computer_scemo(gioco, bottoni, rispostaMain);
                        }

                        checkWinner(gioco, bottoni, VintoX, VintoO, Pareggio);
                    }
                }
        );
        bottoni[3].setOnClickListener(
                (View v) -> {
                    if (gioco[3] == 0) {
                        if ((int) rispostaMain == 1) {
                            bottoni[3].setBackgroundResource(R.drawable.x);
                            livello++;
                            gioco[3] = 1;
                        } else if ((int) rispostaMain == 2) {
                            bottoni[3].setBackgroundResource(R.drawable.o);
                            livello++;
                            gioco[3] = 2;
                        }
                        if (difficolta == 1) {
                            computer_intelligente(gioco, bottoni, rispostaMain);
                        } else if (difficolta == 2) {
                            computer_scemo(gioco, bottoni, rispostaMain);
                        }

                        checkWinner(gioco, bottoni, VintoX, VintoO, Pareggio);
                    }
                }
        );
        bottoni[4].setOnClickListener(
                (View v) -> {
                    if (gioco[4] == 0) {
                        if ((int) rispostaMain == 1) {
                            bottoni[4].setBackgroundResource(R.drawable.x);
                            livello++;
                            gioco[4] = 1;
                        } else if ((int) rispostaMain == 2) {
                            bottoni[4].setBackgroundResource(R.drawable.o);
                            livello++;
                            gioco[4] = 2;
                        }
                        if (difficolta == 1) {
                            computer_intelligente(gioco, bottoni, rispostaMain);
                        } else if (difficolta == 2) {
                            computer_scemo(gioco, bottoni, rispostaMain);
                        }

                        checkWinner(gioco, bottoni, VintoX, VintoO, Pareggio);
                    }
                }
        );
        bottoni[5].setOnClickListener(
                (View v) -> {
                    if (gioco[5] == 0) {
                        if ((int) rispostaMain == 1) {
                            bottoni[5].setBackgroundResource(R.drawable.x);
                            livello++;
                            gioco[5] = 1;
                        } else if ((int) rispostaMain == 2) {
                            bottoni[5].setBackgroundResource(R.drawable.o);
                            livello++;
                            gioco[5] = 2;
                        }
                        if (difficolta == 1) {
                            computer_intelligente(gioco, bottoni, rispostaMain);
                        } else if (difficolta == 2) {
                            computer_scemo(gioco, bottoni, rispostaMain);
                        }

                        checkWinner(gioco, bottoni, VintoX, VintoO, Pareggio);
                    }
                }
        );
        bottoni[6].setOnClickListener(
                (View v) -> {
                    if (gioco[6] == 0) {
                        if ((int) rispostaMain == 1) {
                            bottoni[6].setBackgroundResource(R.drawable.x);
                            livello++;
                            gioco[6] = 1;
                        } else if ((int) rispostaMain == 2) {
                            bottoni[6].setBackgroundResource(R.drawable.o);
                            livello++;
                            gioco[6] = 2;
                        }
                        if (difficolta == 1) {
                            computer_intelligente(gioco, bottoni, rispostaMain);
                        } else if (difficolta == 2) {
                            computer_scemo(gioco, bottoni, rispostaMain);
                        }

                        checkWinner(gioco, bottoni, VintoX, VintoO, Pareggio);
                    }
                }
        );
        bottoni[7].setOnClickListener(
                (View v) -> {
                    if (gioco[7] == 0) {
                        if ((int) rispostaMain == 1) {
                            bottoni[7].setBackgroundResource(R.drawable.x);
                            livello++;
                            gioco[7] = 1;
                        } else if ((int) rispostaMain == 2) {
                            bottoni[7].setBackgroundResource(R.drawable.o);
                            livello++;
                            gioco[7] = 2;
                        }
                        if (difficolta == 1) {
                            computer_intelligente(gioco, bottoni, rispostaMain);
                        } else if (difficolta == 2) {
                            computer_scemo(gioco, bottoni, rispostaMain);
                        }

                        checkWinner(gioco, bottoni, VintoX, VintoO, Pareggio);
                    }
                }
        );
        bottoni[8].setOnClickListener(
                (View v) -> {
                    if (gioco[8] == 0) {
                        if ((int) rispostaMain == 1) {
                            bottoni[8].setBackgroundResource(R.drawable.x);
                            livello++;
                            gioco[8] = 1;
                        } else if ((int) rispostaMain == 2) {
                            bottoni[8].setBackgroundResource(R.drawable.o);
                            livello++;
                            gioco[8] = 2;
                        }
                        if (difficolta == 1) {
                            computer_intelligente(gioco, bottoni, rispostaMain);
                        } else if (difficolta == 2) {
                            computer_scemo(gioco, bottoni, rispostaMain);
                        }

                        checkWinner(gioco, bottoni, VintoX, VintoO, Pareggio);
                    }
                }
        );
        esci.setOnClickListener(
                (View v) -> {
                    startActivity(esciI);
                    finish();
                }
        );

    }

}


