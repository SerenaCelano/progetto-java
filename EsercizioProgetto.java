package Giorno4;

import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioProgetto {
    public static void main(String[] args) {

        //
        // Simulazione di un negozio di abbigliamento
        // Sono un negozio di una catena e devo
        // implementare un servizio
        // 1) aggiungo prodotto (nome prezzo quantita)
        // 2) visualizzare un catalogo (mostro l'elenco dei prodotti)
        // 3) cercare un prodotto (cerco in base al nome)
        // 4) aggiungere il prodotto al carrello (nome prodotto e quantita)
        // 5) visualizzo il carrello (mostro nome e quantita)
        // 6) effettua l'acquisto (confermo l'acquisto e tolgo dalla quantita del
        // catalogo)
        // 7) esci (Un solo exit point, qui si chiude il programma)

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        ArrayList<Prodotto> catalogo = new ArrayList<Prodotto>(); // è un catalogo di tipo Prodotto
        ArrayList<Prodotto> carrello = new ArrayList<Prodotto>(); // è un carrello di tipo Prodotto

        while (flag) {
            System.out.println("\nMenu:");
            System.out.println("1. Inserisci un prodotto");
            System.out.println("2. Visualizza catalogo");
            System.out.println("3. Cerca prodotto");
            System.out.println("4. Aggiungi prodotto al carrello");
            System.out.println("5. Visualizza carrello");
            System.out.println("6. Effettua un acquisto");
            System.out.println("7. Esci");
            System.out.println("Seleziona un'opzione: ");

            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1: // aggiungo prodotto (nome prezzo quantita)
                    System.out.println("Nome: ");
                    scanner.nextLine(); // pulisco lo scanner precedente, il metodo nextInt() non consuma la riga di
                                        // input, ovvero gli rimane l'ultima riga vuota in memoria. Pulendolo in questo
                                        // modo non c'è piu questo problema
                    String nuovo_prodotto = scanner.nextLine();

                    System.out.println("Prezzo: ");
                    scanner.nextDouble();
                    double prezzo = scanner.nextDouble();

                    System.out.println("Quantità: ");
                    scanner.nextInt();
                    int quantita = scanner.nextInt();

                    Prodotto prodotto = new Prodotto(nuovo_prodotto, prezzo, quantita);
                    catalogo.add(prodotto);
                    break;

                case 2: // visualizzare un catalogo (mostro l'elenco dei prodotti)
                    if (catalogo.size() == 0) {
                        System.out.println("Nessun prodotto inserito nel catalogo! ");
                    } else {
                        for (int i = 0; i < catalogo.size(); i++) {
                            System.out.println(i + " " + catalogo.get(i));
                        }
                    }
                    break;

                case 3: // cercare un prodotto (cerco in base al nome)
                    System.out.println("Dammi il nome del prodotto da cercare: ");
                    scanner.nextLine();
                    String prodotto_cercare = scanner.nextLine();

                    for (int i = 0; i < catalogo.size(); i++) {
                        if (catalogo.get(i).ottengoNomeProdotto() == prodotto_cercare) {
                            catalogo.get(i).stampaInfoProdotto();

                        }
                    }

                case 4: // aggiungere il prodotto al carrello (nome prodotto e quantita)
                    // chiediamo all'utente il nome e la quantita di prodotto da aggiungere nel
                    // carrello
                    System.out.println("Nome: ");
                    scanner.nextLine();
                    String prodotto_carrello = scanner.nextLine();

                    System.out.println("Quantità: ");
                    scanner.nextInt();
                    int quantita_carrello = scanner.nextInt();

                    // verifichiamo che il Nome del prodotto sia presente nel catalogo
                    // e cerco se di quel prodotto è presente la quantità richiesta

                    for (int i = 0; i < catalogo.size(); i++) {
                        if ((catalogo.get(i).ottengoNomeProdotto() == prodotto_carrello)
                                && (catalogo.get(i).ottengoQuantita() >= quantita_carrello)) {
                            carrello.add(catalogo.get(i));

                        } else {
                            System.out.println("LA quantità richiesta o il prodotto cercato non sono disponibili!");
                        }
                    }

                    break;

                case 5: // visualizzo il carrello (mostro nome e quantita)
                    if (carrello.size() == 0) {
                        System.out.println("Nessun prodotto inserito nel carrello! ");
                    } else {
                        for (int i = 0; i < carrello.size(); i++) {
                            System.out.println(i + " " + carrello.get(i));
                        }
                    }
                    break;

                case 6: // effettua l'acquisto (confermo l'acquisto e tolgo dalla quantita del catalogo)
                    //for(int i = 0; i ) //DA CONTINUARE!!!!!!!!!
                    break;

                default:
                    System.out.println("Opzione non valida");
                    break; // in modo tale che lui riparta
            }
        }

    }

}
