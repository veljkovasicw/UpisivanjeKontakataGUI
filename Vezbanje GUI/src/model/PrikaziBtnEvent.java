package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import view.GrupeKontaktaCombo;
import view.ListaImenaIPrezimena;

public class PrikaziBtnEvent implements EventHandler<javafx.event.ActionEvent>{

	
	private GrupeKontaktaCombo comboScena2;
	private ComboBox<String> comboScena1;
	private ListaImenaIPrezimena listaImenaIPrezimena;
	
	
	public  PrikaziBtnEvent(GrupeKontaktaCombo comboScena2,ComboBox<String> comboScena1,ListaImenaIPrezimena listaImenaIPrezimena) {
		this.comboScena2=comboScena2;
		this.comboScena1=comboScena1;
		this.listaImenaIPrezimena=listaImenaIPrezimena;
		
	}
	
	
	@Override
	public void handle(ActionEvent event) {
		


		ObservableList<Osoba> listaImenaIprezimena1 = FXCollections.observableArrayList();
		
		ObservableList<Osoba> listaImenaIprezimena2 = FXCollections.observableArrayList();
		ObservableList<Osoba> listaImenaIprezimena3 = FXCollections.observableArrayList();
		
		
		for (Kontakti kontakt : comboScena2.getKontakti()) {

			System.out.println(kontakt.getKontakti().size());
			System.out.println(kontakt.toString());

		if(kontakt.toString().equals("Porodica")){

				for (Osoba osoba : kontakt.getKontakti()) {
					listaImenaIprezimena1.add(osoba);
				}
			}
		
		else if (kontakt.toString().equals("Prijatelji")){

			for (Osoba osoba : kontakt.getKontakti()) {
				
				listaImenaIprezimena2.add(osoba);
			}
		}
		else if(kontakt.toString().equals("Posao")){

			for (Osoba osoba : kontakt.getKontakti()) {
				listaImenaIprezimena3.add(osoba);
			}
		}
		
		}

		
		if(comboScena1.getSelectionModel().getSelectedItem().contains("Por")) {
			listaImenaIPrezimena.setItems(listaImenaIprezimena1);
		}
		if(comboScena1.getSelectionModel().getSelectedItem().contains("Pri")) {
			listaImenaIPrezimena.setItems(listaImenaIprezimena2);
		}
		if(comboScena1.getSelectionModel().getSelectedItem().contains("Pos")) {
			listaImenaIPrezimena.setItems(listaImenaIprezimena3);
		}

		
		

		
	}

}
