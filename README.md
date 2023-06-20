# progetto-java
progetto del gruppo2 in java

Il codice è inerente allo sviluppo di un'applicazione per un negozio di abbigliamento, che permette un utilizzo per doppio user: 
amministratore del negozio e acquirente.

Regole del codice:
ci sono due file .java: 
1) EsercizioProgetto.java;
2) Prodotto.java

Nel codice EsercizioProgetto.java è presente il main che stampa il MENU da cui l'utente può scegliere l'operazione da fare tra le seguenti:
   1. aggiungo prodotto (nome, prezzo, quantità)
   2. visualizzare un catalogo (mostra l'elenco dei prodotti)
   3. cercare un prodotto (ricerca in base al nome)
   4. aggiungere il prodotto al carrello (nome del prodotto e quantità)
   5. rimuovere un prodotto dal carrello (nome prodotto e quantita)
   6. visualizzare il carrello (mostrare nome e quantità)
   7. effettuare l'acquisto (confermare l'acquisto e aggiornare la quantita nel catalogo)
   8. uscire (permette la chiusura del programma)
   
   Le attività dalla 1 alla 3 sono pensate per un utente amministratore di un negozio.
   Le attività dalla 4 alla 7 sono pensate per un acquirente da sito web.
   
   Il codice EsercizioProgetto.java è stato progettato utilizzando lo SWITCH in modo tale che ogni CASE corrisponda ad un'opzione che può 
   fare l'utente tra le 8 proposte.
   
Il codice Prodotto.java è la classe per generare OGGETTI di tipo PRODOTTO. Ad ogni oggetto sono associati gli attributi di istanza:
   - nomeProdotto;
   - prezzo;
   - quantita.
   
   La classe Prodotto.java presenta 4 metodi:
   - ottengoNomeProdotto: restituisce l'attributo nomeProdotto;
   - ottengoPrezzo: restituisce l'attributo prezzo;
   - ottengoQuantita: restituisce l'attributo quantita;
   - stampaInfoProdotto: restituisce i tre attributi di istanza;
   - toString: per ottenere una rappresentazione significativa dell'oggetto Prodotto una volta istanziato.
  

Regole delle variabili:
- le variabili sono scritte in italiano e sono descrittive;
- le variabili sono camelCase.

Regole dei metodi:
- i metodi della classe Prodotto.java sono scritti in camelCase.

Regole commenti:
- commenti di linea in italiano;
- scritti accanto o sopra rispetto alla riga di codice a cui si riferiscono.
