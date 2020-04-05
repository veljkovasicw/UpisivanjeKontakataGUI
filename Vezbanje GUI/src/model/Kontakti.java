package model;

import java.util.ArrayList;

public class Kontakti {

	private ArrayList<Osoba> kontakti;
	
	
	public Kontakti() {
		
		kontakti= new ArrayList<Osoba>();
	}

	public ArrayList<Osoba> getKontakti() {
		return kontakti;
	}

	public void setKontakti(ArrayList<Osoba> kontakti) {
		this.kontakti = kontakti;
	}
}
