# Filippo Saccon
La mia applicazione `Android` del `TicTacToe` é formata da 12 activity e una classe java, tutte le activity hanno sia il layout verticale che orizzontale.

## Splash
L'activity `Splash` é la prima activity che viene aperta e consiste in una schermata che dura il tempo di caricamento dell'applicazione .
<br>
<br>
![Imgur](https://i.imgur.com/TSIAp6x.jpg)

## MainActivity
Questa rappresenta il menu iniziale dell'applicazione da cui si possono avviare le altre activity,é formata da due immagini che rappresentano la `X` e la `O` , al di sotto di queste sono presenti due `Radiobutton` che permettono la scelta della pedina al primo giocatore, infine sono presenti 4 bottoni: `Player vs Player` avvia la modalità due giocatori, `Player vs Computer` quella contro il computer, `Vittorie` apre un activity con le statistiche delle vittorie, infine `Informazioni` apre una finestra di Pop-up.

### MainActivity verticale
![Imgur](https://i.imgur.com/t2m0AYI.jpg)
### MainActivity orizzontale
![Imgur](https://i.imgur.com/kR2QjJh.jpg)

## GiocoPlayer
Questa activity permette a due giocatori di giocare tra di loro e tramite la finestra di pop-up quando si sceglie la modalità nella `MainActivity` anche di scrivere il proprio nome.
Nella classe Java GiocoPlayer sono presenti oltre al metodo principale `onCreate` anche altri due metodi `createImageFromBitmap` e `checkWinner`.
Il metodo checkWinner viene chiamato dall' `onCreate` tutte le volte che un player fa una mossa per verificare se uno dei due ha vinto per poi aprire activity di vittoria; invece il metodo `createImageFromBitmap` serve per creare un immagine jpeg partendo da una bitmap creata dal metodo `takescreenshotOfRootView` della classe `Screenshot`, (ho creato questa classe per poter fare un screenshot della pagina, perchè volevo mostrare all'utente come ha vinto).
<br>
![Imgur](https://i.imgur.com/QEUzrmy.png)
## GiocoComputer
Questa activity a differenza di quella precedente permette di giocare con il computer, i metodi sono gli stessi della classe player vs player a parte per i metodi: `computer_scemo` che consinte in un algoritmo che posiziona la pedina in modo random, `convertitore` questo metodo serve per gestire la scelta delle pedine che arriva dalla `MainActivity` e  infine il metodo `computer_intelligente` che contiene più o meno 150 if che permettono al computer di essere quasi imbattibile non ho considerato volontariamente dei casi per permettere al player di vincere ogni tanto. Ovviamente come nella activity player è presente la gestione dei nomi.
<br>
![Imgur](https://i.imgur.com/DtWV7pg.jpg)

## VintoO VintoX Pareggio
Queste tre activity le ho raggruppate perchè in più o meno contengono sono simili.
Tutte contengono un pulsante `Indietro` che permette di tornare alla `MainActivity` e un tasto rigioca che permette di tornare all'activity `Gioco` o `GiocoPlayer` per poter fare altre partite. Nel centro di questa schermata è presente una grande ImageView che contiene l'image che è stata creata con il metodo `createImageFromBitmap`.
<br>
![Imgur](https://i.imgur.com/L1tZaD4.jpg) ![Imgur](https://i.imgur.com/ua1xcAV.jpg)![Imgur](https://i.imgur.com/8qyoG7m.jpg)

## Classe Screenshot
Contiene due metodi entrambi che ritornano una bitmap, tramite questo metodo creo lo screenshot e lo salvo in una bitmap che però per poterla passare ad un altra activity è necessario salvarla nella memoria del telefono.
 
 ## Statistiche
Nella schermata statiche sono presenti i risultati della X e del O, tutti i risultati sono salvati nelle preferenze di sistema e quindi anche se chiudi l'applicazione i risultati vengo salvati.
![Imgur](https://i.imgur.com/lSrKiuR.jpg)
