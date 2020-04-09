package model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import view.ListaImenaIPrezimena;

public class PrikaziDetaljeBtnEvent implements EventHandler<javafx.event.ActionEvent> {

	private ListaImenaIPrezimena listaImenaIPrezimena;
	private TextField imePrezimeTextField;
	private TextField adresaTextField;
	private TextField emailTextField;
	private TextArea brojeviTextArea;
	
	public  PrikaziDetaljeBtnEvent(ListaImenaIPrezimena listaImenaIPrezimena , TextField imePrezimeTextField , TextField adresaTextField , TextField emailTextField , TextArea brojeviTextArea) {
		
		this.listaImenaIPrezimena=listaImenaIPrezimena;
		this.imePrezimeTextField=imePrezimeTextField;
		this.adresaTextField=adresaTextField;
		this.emailTextField=emailTextField;
		this.brojeviTextArea=brojeviTextArea;
	}
	
	
	
	
	@Override
	public void handle(ActionEvent event) {
		Osoba izabranaOsoba = 	listaImenaIPrezimena.getSelectionModel().getSelectedItem();
		
		imePrezimeTextField.setText(izabranaOsoba.getImeIPrezime());;
		adresaTextField.setText(izabranaOsoba.getAdresa());
		emailTextField.setText(izabranaOsoba.getEmail());
		
		String listaBrojeva="";
		for (Brojevi broj : izabranaOsoba.getBrojevi()) {
			listaBrojeva+=broj+"\n";
		}
		brojeviTextArea.setText(listaBrojeva);
		
	}

}
