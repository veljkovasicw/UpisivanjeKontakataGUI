package model;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import view.GrupeKontaktaCombo;
import view.ListaBrojeva;
import view.ListaImenaIPrezimena;

public class SacuvajBtnEvent implements EventHandler<javafx.event.ActionEvent> {

	private TextField imeTextField;

	private TextField prezimeTextField;

	private TextField adresaTextField;

	private TextField emailTextField;

	private TextField brojeviTextField;

	private ListaBrojeva listaBrojeva;
	private GrupeKontaktaCombo comboScena2;
	private ListaImenaIPrezimena listaImenaIPrezimena;
	private ComboBox<String> comboScena1;
	private Stage primaryStage;
	private Scene prvaScene;

	public SacuvajBtnEvent(TextField imeTextField, TextField prezimeTextField, TextField adresaTextField,
			TextField emailTextField, TextField brojeviTextField, ListaBrojeva listaBrojeva, GrupeKontaktaCombo comboScena2,
			ListaImenaIPrezimena listaImenaIPrezimena , ComboBox<String> comboScena1 , Stage primaryStage, Scene prvaScene) {

		this.imeTextField = imeTextField;
		this.prezimeTextField = prezimeTextField;
		this.adresaTextField = adresaTextField;
		this.emailTextField = emailTextField;
		this.brojeviTextField = brojeviTextField;
		this.listaBrojeva = listaBrojeva;
		this.comboScena2 = comboScena2;
		this.listaImenaIPrezimena = listaImenaIPrezimena;
		this.comboScena1=comboScena1;
		this.primaryStage=primaryStage;
		this.prvaScene=prvaScene;

	}

	@Override
	public void handle(ActionEvent event) {
		String ime = imeTextField.getText();
		String prezime = prezimeTextField.getText();
		String adresa = adresaTextField.getText();
		String email = emailTextField.getText();
		String broj = brojeviTextField.getText();

		ArrayList<Brojevi> brojevi = new ArrayList<Brojevi>();

		ArrayList<String> lista = listaBrojeva.getTableViewValues(listaBrojeva);

		if (!lista.isEmpty()) {

			for (String brojIzTabele : lista) {

				brojevi.add(new Brojevi(brojIzTabele));

			}

		}

		if (broj != null) {

			brojevi.add(new Brojevi(broj));

		}

		Osoba osoba = new Osoba(ime, prezime, adresa, email, brojevi);

		String kojiTrazim = comboScena2.getValue().toString();

		ObservableList<String> grupeLista = FXCollections.observableArrayList();

		for (Kontakti kontakt : comboScena2.getKontakti()) {

			grupeLista.add(kontakt.toString() + " - " + (kontakt.getKontakti().size()));

			if (kontakt.toString().equals(kojiTrazim)) {

				kontakt.getKontakti().add(osoba);

				System.out.println(kontakt.toString());
				System.out.println("Uspesno nasao kontakt");

				System.out.println(osoba);

				System.out.println(kontakt.getKontakti().size());

			}

		}

		System.out.println("YEEESSS");

		imeTextField.clear();
		prezimeTextField.clear();
		adresaTextField.clear();
		emailTextField.clear();
		brojeviTextField.clear();
		listaBrojeva.getItems().clear();
		listaImenaIPrezimena.getItems().clear();
		/*
		 * 
		 * scena1.getCombo().setItems(grupeLista);
		 * scena1.getCombo().setValue(grupeLista.get(0));
		 */

		/* return grupeLista; */

		comboScena1.setItems(grupeLista);

		comboScena1.setValue(grupeLista.get(0));

		primaryStage.setScene(prvaScene);
		primaryStage.show();

	}

}
