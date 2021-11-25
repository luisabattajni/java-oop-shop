package it.shop;

import java.util.Random;
import java.util.Scanner;

public class Prodotto {
	
	/*
	 * Inserire (quindi direi attributi):
	* 		codice (numero intero)
	* 		nome
	* 		descrizione
	* 		prezzo
	* 		iva
	* 
	* Usate opportunamente i livelli di accesso (public, private), 
	* i costruttori, i metodi getter e setter 
	* ed eventuali altri metodi di “utilità” per fare in modo che:
	* 
	* alla creazione di un nuovo prodotto 
	* il codice sia valorizzato con un numero random
	* RANDOM 
	* Il codice sia accessibile solo in lettura
	* GET
	* Gli altri attributi siano accessibili sia in lettura che in scrittura 
	* GET&SET
	* Il prodotto esponga sia un metodo per avere il prezzo base 
	* che uno per avere il prezzo comprensivo di iva
	* Il prodotto esponga un metodo per avere il nome esteso, 
	* ottenuto concatenando codice-nome
	*/
	
	
	//attributi
	
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva; //double? to google ig
	private double prezzoIva;
	private String nomeEsteso;

	
	//costruttori
	
	public Prodotto () {
		this.codice = generaCodice();
		this.nome = inputNome();
		this.descrizione = inputDescrizione();
		this.prezzo = generaPrezzo();
		this.iva = inputIva();
		this.prezzoIva = calcolaPrezzoIva();
		this.nomeEsteso = componiNomeEsteso();
		
	}
	
	//getter&setter
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getPrezzoIva() {
		return prezzoIva;
	}

	public void setPrezzoIva(double prezzoIva) {
		this.prezzoIva = prezzoIva;
	}

	public String getNomeEsteso() {
		return nomeEsteso;
	}

	public void setNomeEsteso(String nomeEsteso) {
		this.nomeEsteso = nomeEsteso;
	}

	public int getCodice() {
		return codice;
	}

	
	
	
	
	//metodi
	
	
//	public Prodotto () {
//		this.codice = generaCodice();
//		this.nome = inputNome();
//		this.descrizione = inputDescrizione();
//		this.prezzo = generaPrezzo();
//		this.iva = inputIva();
//		this.prezzoIva = calcolaPrezzoIva();
//		this.nomeEsteso = componiNomeEsteso();
//		
	//metodo che genera il codice
	private int generaCodice() {
		Random random = new Random();
		return random.nextInt(900);
	}
	
	//metodo che genera il prezzo
	private double generaPrezzo() {
		Random random = new Random();
		return random.nextDouble()*300.00;
	}
	
//	//metodo che permette di inserire un nome
//	private String inputNome() {
//		try (Scanner scan = new Scanner(System.in)) {
//			return scan.nextLine();
//		}
//	}
//	
//	//metodo che permette di inserire una descrizione
//	private String inputDescrizione() {
//		try (Scanner scan2 = new Scanner(System.in)) {
//			return scan2.nextLine();
//		}
//	}
//
//	//metodo permette di inserire l'iva
//	private double inputIva() {
//		try (Scanner scan3 = new Scanner(System.in)) {
//			return scan3.nextDouble();
//		}
//	}
	
	Scanner scan = new Scanner(System.in);
	//metodo che permette di inserire un nome
	private String inputNome() {
			return scan.nextLine();
	}
	
	//metodo che permette di inserire una descrizione
	private String inputDescrizione() {
			return scan.nextLine();
	}

	//metodo permette di inserire l'iva
	private double inputIva() {
			return scan.nextDouble();
	}
	
	//metodo per avere prezzo*iva
	private double calcolaPrezzoIva() {
		return prezzo * iva;
	}
	
	//metodo per nome esteso
	//WRONG
	private String componiNomeEsteso() {
		System.out.println(codice + "-" + nome); 
		return descrizione;
	}



	
	
	
	
	
	
	

}
