package Giorno4;

import java.util.ArrayList;

public class Prodotto {
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

    // definizione degli attributi
    private String nome_prodotto;
    private double prezzo;
    private int quantita;


    // costruttore, che è un metodo
    public Prodotto(String nome_prodotto, double prezzo, int quantita) {
        this.nome_prodotto = nome_prodotto; // con this faccio Libro
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    // definiamo i metodi per ottenere gli attributi di istanza
    public String ottengoNomeProdotto() {
        return nome_prodotto;

    }

    public double ottengoPrezzo() {
        return prezzo;
    }

    public int ottengoQuantita() {
        return quantita;
    }

    public void stampaInfoProdotto() {
        System.out.println("il nome del prodotto è: " + nome_prodotto + " \nil prezzo del prodotto è: " + prezzo + " \nla quantità del prodotto è: " + quantita);
    }


}
