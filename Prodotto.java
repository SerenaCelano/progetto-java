import java.util.ArrayList;

public class Prodotto {

    // definizione degli attributi di istanza
    private String nomeProdotto;
    private double prezzo;
    private int quantita;

    // costruttore, che è un metodo
    public Prodotto(String nomeProdotto, double prezzo, int quantita) {
        this.nomeProdotto = nomeProdotto; // con this faccio Libro
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    // definiamo i metodi per ottenere gli attributi di istanza
    public String ottengoNomeProdotto() {
        return nomeProdotto;

    }

    public double ottengoPrezzo() {
        return prezzo;
    }

    public int ottengoQuantita() {
        return quantita;
    }

    public void stampaInfoProdotto() {
        System.out.println("il nome del prodotto è: " + nomeProdotto + " \nil prezzo del prodotto è: " + prezzo
                + " \nla quantità del prodotto è: " + quantita);
    }

    // Sovrascrive il metodo toString() per ottenere una rappresentazione
    // significativa
    @Override // sovrascrizione di un metodo
    public String toString() {
        return "Prodotto : nome=" + nomeProdotto + ", prezzo=" + prezzo + ", quantità=" + quantita +" ";
    }

}
