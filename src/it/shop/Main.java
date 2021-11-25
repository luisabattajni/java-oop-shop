package it.shop;


public class Main {

	public static void main(String[] args) {
		//here:
		//testate tutte le funzionalità della classe Prodotto
		
//		* codice (numero intero)
//		* 		nome
//		* 		descrizione
//		* 		prezzo
//		* 		iva
		
	
		
		// prodotto test 1
		
		Prodotto prodotto1 = new Prodotto ("iphone", "magnifico iphone nero", 32, 0.22);

		
		System.out.println("Codice: " + prodotto1.getCodice());
		System.out.println("Nome: " + prodotto1.getNome());
		System.out.println("Nome esteso: " + prodotto1.getNomeEsteso());
		System.out.println("Descrizione: " + prodotto1.getDescrizione());
		System.out.println("Prezzo: " + prodotto1.getPrezzo());
		System.out.println("Prezzo con l'iva: " + prodotto1.getPrezzoIva());
		
		System.out.println();
		
		// prodotto test 2
		
		Prodotto prodotto2 = new Prodotto ("ipad", "splendido ipad bianco", 1234, 0.22);

		
		System.out.println("Codice: " + prodotto2.getCodice());
		System.out.println("Nome: " + prodotto2.getNome());
		System.out.println("Nome esteso: " + prodotto2.getNomeEsteso());
		System.out.println("Descrizione: " + prodotto2.getDescrizione());
		System.out.println("Prezzo: " + prodotto2.getPrezzo());
		System.out.println("Prezzo con l'iva: " + prodotto2.getPrezzoIva());
		
		System.out.println();


		


	}

}


