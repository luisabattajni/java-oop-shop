package it.shop;

import java.util.Random;

public class Prodotto {
	
	
	//attributi
	
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva; //double? to google ig

	
	//costruttori
	
	public Prodotto (String nome, String descrizione, int prezzo, double iva) {
		this.codice = generaCodice();
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
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

	public int getCodice() {
		return codice;
	}


	//metodo che genera il codice
	private int generaCodice() {
		Random random = new Random();
		return random.nextInt(900);
	}
	
	//metodo per avere prezzo con iva
	public double getPrezzoIva() {
		return prezzo + (prezzo * iva);
	}
	
	//metodo per nome esteso
	public String getNomeEsteso() {
		return codice + "-" + nome; 
	}

	

}
