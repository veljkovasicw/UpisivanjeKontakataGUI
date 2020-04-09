package model;

import javafx.beans.property.SimpleStringProperty;

public class Brojevi {

	
	private SimpleStringProperty brojevi;
	
	
	
	public Brojevi (String broj) {
		
		this.brojevi= new SimpleStringProperty(broj);
		
	}



	public String getBrojevi() {
		return brojevi.get();
	}



	public void setBrojevi(SimpleStringProperty brojevi) {
		this.brojevi = brojevi;
	}
	
	
	@Override
	public String toString() {
		
		return brojevi.get();
	}
	
}
