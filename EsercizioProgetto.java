import java.util.ArrayList;
import java.util.Scanner;
import java.util.Objects;

public class EsercizioProgetto {
    public static void main(String[] args) {

        // Simulazione di un negozio di abbigliamento.
        // Si tratta di un negozio di una catena e e si deve
        // implementare un servizio che permetta di fare le seguenti operazioni:
        // 1) aggiungere prodotto (nome, prezzo, quantità);
        // 2) visualizzare il catalogo (mostrare l'elenco dei prodotti);
        // 3) cercare un prodotto (cercare in base al nome);
        // 4) aggiungere un prodotto al carrello (nome prodotto e quantità);
        // 5) rimuovere un prodotto dal carrello (nome prodotto e quantita);
        // 6) visualizzare il carrello (mostrare nome e quantità);
        // 7) effettuare l'acquisto (confermare l'acquisto e togliere dalla quantità del
        // catalogo)
        // 8) uscire (un solo exit point: da qui si chiude il programma).

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        ArrayList<Prodotto> catalogo = new ArrayList<>(); // è un catalogo di tipo Prodotto
        ArrayList<Prodotto> carrello = new ArrayList<>(); // è un carrello di tipo Prodotto

        while (flag) {
            System.out.println("\nMenu:");
            System.out.println("1. Inserisci un prodotto");
            System.out.println("2. Visualizza catalogo");
            System.out.println("3. Cerca prodotto");
            System.out.println("4. Aggiungi prodotto al carrello");
            System.out.println("5. Rimuovere un prodotto dal carrello");
            System.out.println("6. Visualizza carrello");
            System.out.println("7. Effettua un acquisto");
            System.out.println("8. Esci");
            System.out.println("Seleziona un'opzione: ");

            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1: // aggiungere prodotto (nome, prezzo, quantità)
                    System.out.println("Nome: "); // chiedo all'utente il nome del prodotto
                    scanner.nextLine(); // pulisce lo scanner precedente, il metodo nextInt() non consuma la riga di
                                        // input, ovvero gli rimane l'ultima riga vuota in memoria. Pulendolo in questo
                                        // modo non c'è piu questo problema
                    String nuovoProdotto = scanner.nextLine();

                    System.out.println("Prezzo: "); // chiedo all'utente il prezzo del prodotto
                    // scanner.nextDouble();
                    double prezzo = scanner.nextDouble();

                    System.out.println("Quantità: "); // chiedo all'utente la quantità del prodotto
                    // scanner.nextInt();
                    int quantita = scanner.nextInt();

                    Prodotto prodotto = new Prodotto(nuovoProdotto, prezzo, quantita); // si crea l'oggetto di tipo
                                                                                       // prodotto
                    catalogo.add(prodotto);
                    break;

                case 2: // visualizzare il catalogo (mostrare l'elenco dei prodotti);
                    if (catalogo.size() == 0) {
                        System.out.println("Nessun prodotto inserito nel catalogo! ");
                    } else {
                        for (int i = 0; i < catalogo.size(); i++) {
                            System.out.println(i + " " + catalogo.get(i).toString());
                            catalogo.get(i).stampaInfoProdotto();
                        }
                    }
                    break;

                case 3: // cercare un prodotto (cercare in base al nome);
                    System.out.println("Dammi il nome del prodotto da cercare: ");
                    scanner.nextLine();
                    String prodottoCercare = scanner.nextLine();


                    System.out.println("Risultati di ricerca:");
                    for (Prodotto prodotto2 : catalogo) {
                        if (prodotto2.ottengoNomeProdotto().equalsIgnoreCase(prodottoCercare)) { // equalsIgnoreCase è un metodo della libreria String per confrontare stringhe
                            System.out.println(prodotto2.ottengoNomeProdotto() + " - " + prodotto2.ottengoPrezzo() + " - Disponibilità: "
                                    + prodotto2.ottengoQuantita());
                        }
                    }
                    break;

                case 4: // aggiungere un prodotto al carrello (nome prodotto e quantità)
                    // si chiede all'utente il nome e la quantità di prodotto da aggiungere nel
                    // carrello
                    System.out.println("Nome prodotto da aggiungere: ");
                    scanner.nextLine();
                    String prodottoCarrello = scanner.nextLine();

                    System.out.println("Quantità: ");
                   
                    int quantitaCarrello = scanner.nextInt();

                    boolean trovato = false; //
                    // si verifica che il Nome del prodotto sia presente nel catalogo
                    // e si cerca se di quel prodotto è presente la quantità richiesta

                    for (Prodotto prodotto3 : catalogo) {
                        if ((prodotto3.ottengoNomeProdotto().equalsIgnoreCase(prodottoCarrello))
                                && (prodotto3.ottengoQuantita() >= quantitaCarrello)) {
                                    
                                    trovato = true;
                                
                                    // Aggiornamento della quantita per il carrello
                                    Prodotto prodottoAggiornato = new Prodotto(prodottoCarrello,prodotto3.ottengoPrezzo(), quantitaCarrello);
                                    
                                    // aggiornamento quantità nel carrello
                                    carrello.add(prodottoAggiornato);
                                    System.out.println("Prodotto aggiunto con successo!");

                        }
                    }

                    if (!trovato){
                        System.out.println("Il prodotto richiesto non può essere aggiunto!");
                    }

                    break;

                case 5: // rimuovere un prodotto dal carrello (nome prodotto e quantita)

                    System.out.println("Scegli il Nome del prodotto da rimuovere tra quelli presenti: ");
                    // stampa carrello
                    for(Prodotto prodotto4: carrello){
                        prodotto4.stampaInfoProdotto();

                    }
                    scanner.nextLine();
                    String prodottoRimosso = scanner.nextLine();

                    System.out.println("Quantità: ");
                    
                    int quantitaDaRimuovere = scanner.nextInt();
                    
                    boolean rimosso = false;
                    for (Prodotto prodotto5: carrello) {
                        if ((prodotto5.ottengoNomeProdotto().equals(prodottoRimosso)) && (prodotto5.ottengoQuantita() > quantitaDaRimuovere)) {
                                // Aggiornamento della quantita per il carrello
                                Prodotto prodottoAggiornatoCarrello = new Prodotto(prodottoRimosso,prodotto5.ottengoPrezzo(), prodotto5.ottengoQuantita()-quantitaDaRimuovere);
                                carrello.remove(prodotto5);
                                carrello.add(prodottoAggiornatoCarrello);
                                rimosso = true;

                        }
                    }
                    if(!rimosso){
                        System.out.println("Errore! Non è possibile rimuovere il prodotto");

                    }
                    

                    break;

                case 6: // visualizzare il carrello (mostrare nome e quantità)
                    if (carrello.size() == 0) {
                        System.out.println("Nessun prodotto inserito nel carrello! ");
                    } else {
                        for (int i = 0; i < carrello.size(); i++) {
                            System.out.println(i + " " + carrello.get(i));
                        }
                    }
                    break;

                case 7: // effettuare l'acquisto (confermare l'acquisto di tutto il carrello e aggiornare le quantità del
                        // catalogo)

                    // - conferma del prodotto/dei prodotti che stanno nel carrello come domanda
                    // - il prodotto/i prodotti vengono rimossi dal catalogo e il carrello si svuota
                    // completamente

                    System.out.println("Confermare l'acquisto di tutto il carrello? Digita si o no. ");
                    scanner.nextLine();
                    String risposta = scanner.nextLine();

                    // gestione della risposta
                    risposta = risposta.toLowerCase(); // la risposta sarà settata sempre in minuscolo

                    if (risposta.equalsIgnoreCase("si")) {

    
                        double saldo = 0.0;
                        for(Prodotto carrello1:carrello){
                            saldo += carrello1.ottengoQuantita()*carrello1.ottengoPrezzo();
                        }
                        System.out.println("il conto da pagare è: " + saldo);

                        // decremento della quantità del prodotto dal catalogo:
                        // - se il prodotto nel catalogo è uguale alla quantita nel carrello, allora viene eliminato totalmente dal catalogo (si
                        // elimina il nome e la quantità)
                        // - se il prodotto nel catalogo è maggiore della quantita del carrelo, allora si decrementa della quantita del carrello.
                        for(Prodotto prodotto7:catalogo){
                            for(Prodotto carrello2:carrello){
                                if(carrello2.ottengoNomeProdotto().equals(prodotto7.ottengoNomeProdotto()) && carrello2.ottengoQuantita() == prodotto7.ottengoQuantita()){
                                    catalogo.remove(prodotto7);
                                    carrello.remove(carrello2);

                                }else if(carrello2.ottengoNomeProdotto().equals(prodotto7.ottengoNomeProdotto()) && carrello2.ottengoQuantita() < prodotto7.ottengoQuantita()){
                                    Prodotto prodottoQuantitaAggiornata = new Prodotto(prodotto7.ottengoNomeProdotto(),prodotto7.ottengoPrezzo(),prodotto7.ottengoQuantita()-carrello2.ottengoQuantita());   
                                    catalogo.add(prodottoQuantitaAggiornata);   
                                    System.out.println("la quantità del prodotto " + prodotto7.ottengoNomeProdotto() + " nel CATALOGO è stata aggiornata a: " + prodottoQuantitaAggiornata.ottengoQuantita());
                                    catalogo.remove(prodotto7);
                                    carrello.remove(carrello2);
                                }
                            }
                        }

                        // pulizia totale del carrello
                        // carrello.clear();
                    }else{
                        System.out.println("Acquisto non eseguito!");
                    }
                    break;

                case 8: // uscire (un solo exit point: da qui si chiude il programma)

                    System.out.println("Grazie per aver utilizzato il nostro shop! ");
                    flag = false;
                    break;

                default:
                    System.out.println("Opzione non valida");
                    break;

            }
        }
    }

}
