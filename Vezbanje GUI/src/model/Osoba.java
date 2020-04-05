package model;

import java.util.ArrayList;

import javafx.beans.property.SimpleStringProperty;

public class Osoba {

	private String ime;
	private String prezime;
	private String adresa;
	private String email;
	private ArrayList<Brojevi> brojevi;
	
	private SimpleStringProperty imeIPrezime;
	
	public Osoba(String ime , String prezime , String adresa, String email, ArrayList<Brojevi> brojevi) {
		
		this.ime=ime;
		this.prezime=prezime;
		this.adresa= adresa;
		this.email= email;
		this.brojevi=brojevi;
		this.imeIPrezime= new SimpleStringProperty(ime+" "+prezime);
		
		
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Brojevi> getBrojevi() {
		return brojevi;
	}

	public void setBrojevi(ArrayList<Brojevi> brojevi) {
		this.brojevi = brojevi;
	}
	
	@Override
	public String toString() {
		
	return ime+" "+prezime;
	}

	public String getImeIPrezime() {
		return imeIPrezime.get();
	}

	public void setImeIPrezime(SimpleStringProperty imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	
	
}
