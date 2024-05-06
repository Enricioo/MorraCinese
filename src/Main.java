import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String[] scelta = {"Sasso", "Carta", "Forbici"}; // Creazione Array
        String mossaUtente, mossaComputer; // Creazione stringhe
        int punteggioComputer, punteggioUtente; // Creazioni variabili di tipo intero
        String risposta;


        do {
            // Inizialiazzazione gioco
            punteggioUtente = 0;
            punteggioComputer = 0;
            System.out.println("Benvenuto nel gioco della morra cinese, buon divertimento!");

            do {
                // Inializzazione mosse
                System.out.println("Inserire la tua mossa:");
                mossaUtente = sc.nextLine();
                mossaComputer = scelta[r.nextInt(3)];

                // Possibili situazioni
                if (mossaComputer.equalsIgnoreCase(mossaUtente)) {
                    System.out.println("Hai scelto " + mossaUtente + " e il computer ha scelto " + mossaComputer);
                    System.out.println("Il round risulta in un pareggio!");
                    System.out.println("Il tuo punteggio: " + punteggioUtente);
                    System.out.println("Il punteggio del computer: " + punteggioComputer);
                } else if (mossaComputer.equalsIgnoreCase("Sasso") && mossaUtente.equalsIgnoreCase("Carta")) {
                    System.out.println("Hai scelto: " + mossaUtente + " e il computer ha scelto: " + mossaComputer);
                    System.out.println("Hai vinto questo round!");
                    punteggioUtente++;
                    System.out.println("Il tuo punteggio: " + punteggioUtente);
                    System.out.println("Il punteggio del computer: " + punteggioComputer);
                } else if (mossaComputer.equalsIgnoreCase("Sasso") && mossaUtente.equalsIgnoreCase("Forbici")) {
                    System.out.println("Hai scelto: " + mossaUtente + " e il computer ha scelto: " + mossaComputer);
                    System.out.println("Il computer ha vinto questo round!");
                    punteggioComputer++;
                    System.out.println("Il tuo punteggio: " + punteggioUtente);
                    System.out.println("Il punteggio del computer: " + punteggioComputer);
                } else if (mossaComputer.equalsIgnoreCase("Carta") && mossaUtente.equalsIgnoreCase("Sasso")) {
                    System.out.println("Hai scelto: " + mossaUtente + " e il computer ha scelto: " + mossaComputer);
                    System.out.println("Il computer ha vinto questo round!");
                    punteggioComputer++;
                    System.out.println("Il tuo punteggio: " + punteggioUtente);
                    System.out.println("Il punteggio del computer: " + punteggioComputer);
                } else if (mossaComputer.equalsIgnoreCase("Carta") && mossaUtente.equalsIgnoreCase("Forbici")) {
                    System.out.println("Hai scelto: " + mossaUtente + " e il computer ha scelto: " + mossaComputer);
                    System.out.println("Hai vinto questo round!");
                    punteggioUtente++;
                    System.out.println("Il tuo punteggio: " + punteggioUtente);
                    System.out.println("Il punteggio del computer: " + punteggioComputer);
                } else if (mossaComputer.equalsIgnoreCase("Forbici") && mossaUtente.equalsIgnoreCase("Sasso")) {
                    System.out.println("Hai scelto: " + mossaUtente + " e il computer ha scelto: " + mossaComputer);
                    System.out.println("Hai vinto questo round!");
                    punteggioUtente++;
                    System.out.println("Il tuo punteggio: " + punteggioUtente);
                    System.out.println("Il punteggio del computer: " + punteggioComputer);
                } else {
                    System.out.println("Hai scelto: " + mossaUtente + " e il computer ha scelto: " + mossaComputer);
                    System.out.println("Il computer ha vinto questo round!");
                    punteggioComputer++;
                    System.out.println("Il tuo punteggio: " + punteggioUtente);
                    System.out.println("Il punteggio del computer: " + punteggioComputer);
                }
            // Fine primo ciclo
            } while (punteggioUtente < 5 && punteggioComputer < 5);
            // Fine partita
            if (punteggioUtente > punteggioComputer) {
                System.out.println("Hai vinto la partita!");
            } else {
                System.out.println("Hai perso! Ha vinto il computer!");
            }
            // Riavvio partita
            System.out.println("Vuoi rigiocare la partita? Si o No?");
            risposta = sc.nextLine();
        // Fine secondo ciclo
        } while (risposta.equalsIgnoreCase("Si"));

        System.out.println("Alla prossima!");
        sc.close();
    }
}