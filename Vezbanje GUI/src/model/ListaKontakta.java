package model;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ListaKontakta {

	
	public static ArrayList<Kontakti> kontakti= new ArrayList<Kontakti>();
	
	public static ObservableList<String> grupeLista ;
	
	public ListaKontakta() {
		
		kontakti.add(Porodica.getInstance());
		kontakti.add(Prijatelji.getInstance());
		kontakti.add(Posao.getInstance());
		
		
		grupeLista = FXCollections.observableArrayList(kontakti.get(0).toString(),kontakti.get(1).toString(),kontakti.get(2).toString() );
		
	}	
}
