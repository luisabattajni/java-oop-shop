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
		
	
		
		//test prodotto 1
		System.out.println("Creo un nuovo prodotto");
		System.out.println("Nome prodotto: ");

		Prodotto prodotto1 = new Prodotto();

		
		System.out.println("Codice: " + prodotto1.getCodice());
		System.out.println("Nome: " + prodotto1.getNome());
		System.out.println("Descrizione: " + prodotto1.getDescrizione());
		System.out.println("Prezzo: " + prodotto1.getPrezzo());
		System.out.println("Prezzo con IVA: " + prodotto1.getPrezzoIva());
//		System.out.println("Nome esteso: " + prodotto1.getNomeEsteso());
		
		System.out.println();


		


	}

}
