package contoler;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import model.Brojevi;
import model.Kontakti;
import model.Osoba;
import model.Porodica;
import model.Posao;
import model.Prijatelji;
import view.GrupeKontaktaCombo;
import view.ListaBrojeva;
import view.Scena1;
import view.Scena2;

public class Controler {

	// da ima sve instance svih klasa
	// da moze da se napravi samo jedan objekat (staticni konstruktor)
	// da ima staticki brojac = 0
	// da ima public metodu init() - kojom pravimo objekat i povecavamo brojac za 1
	// kada je staticki brojac >=1 ne moze da se napravi objekat
	// pristupas mu preko getClass

	/*
	 * private static Controller instance = null;
	 * 
	 * public static Controller getInstance() { if (instance == null) { instance =
	 * new Controller(); } return instance; }
	 * 
	 * // ovde navodis atribute koji su deljeni // npr. Stage primaryStage;
	 * 
	 * 
	 * // privatni konstruktor private Controller() { // ... }
	 * 
	 * 
	 * // geteri i seteri za sve atribute
	 */
	private static Controler instance = null;
	private Scena1 scena1;
	private Scena2 scena2;
	private GrupeKontaktaCombo grupeKontaktaCombo;
	private Porodica porodica;
	private Posao posao;
	private Prijatelji prijatelji;

	private Controler() {

		scena1 = new Scena1();
		scena2 = new Scena2();
		porodica = Porodica.getInstance();
		posao = Posao.getInstance();
		prijatelji = Prijatelji.getInstance();
		grupeKontaktaCombo = GrupeKontaktaCombo.getInstance();
	}

	public GrupeKontaktaCombo getGrupeKontaktaCombo() {
		return grupeKontaktaCombo;
	}

	public void setGrupeKontaktaCombo(GrupeKontaktaCombo grupeKontaktaCombo) {
		this.grupeKontaktaCombo = grupeKontaktaCombo;
	}

	public static Controler getInstance() {

		if (instance == null) {

			instance = new Controler();
		}
		return instance;
	}

	public Scena1 getScena1() {
		return scena1;
	}

	public void setScena1(Scena1 scena1) {
		this.scena1 = scena1;
	}

	public Scena2 getScena2() {
		return scena2;
	}

	public void setScena2(Scena2 scena2) {
		this.scena2 = scena2;
	}

	public Porodica getPorodica() {
		return porodica;
	}

	public void setPorodica(Porodica porodica) {
		this.porodica = porodica;
	}

	public Posao getPosao() {
		return posao;
	}

	public void setPosao(Posao posao) {
		this.posao = posao;
	}

	public Prijatelji getPrijatelji() {
		return prijatelji;
	}

	public void setPrijatelji(Prijatelji prijatelji) {
		this.prijatelji = prijatelji;
	}

	public ObservableList<String> saveKontakt() {

		String ime = getScena2().getImeTextField().getText();
		String prezime = getScena2().getPrezimeTextField().getText();
		String adresa = getScena2().getAdresaTextField().getText();
		String email = getScena2().getEmailTextField().getText();
		String broj = getScena2().getBrojeviTextField().getText();

		ArrayList<Brojevi> brojevi = new ArrayList<Brojevi>();

		ArrayList<String> lista = getScena2().getListaBrojeva().getTableViewValues(scena2.getListaBrojeva());

		if (!lista.isEmpty()) {

			for (String brojIzTabele : lista) {

				brojevi.add(new Brojevi(brojIzTabele));

			}

		}

		if (broj != null) {

			brojevi.add(new Brojevi(broj));

		}

		Osoba osoba = new Osoba(ime, prezime, adresa, email, brojevi);

		String kojiTrazim = getScena2().getCombo().getValue().toString();

		ObservableList<String> grupeLista = FXCollections.observableArrayList();

		for (Kontakti kontakt : getScena2().getCombo().getKontakti()) {

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

		getScena2().getImeTextField().clear();
		getScena2().getPrezimeTextField().clear();
		getScena2().getAdresaTextField().clear();
		getScena2().getEmailTextField().clear();
		getScena2().getBrojeviTextField().clear();
		getScena2().getListaBrojeva().getItems().clear();

		/*
		 * 
		 * scena1.getCombo().setItems(grupeLista);
		 * scena1.getCombo().setValue(grupeLista.get(0));
		 */

		return grupeLista;

	}

	public void dodajBroj() {

		if (!getScena2().getBrojeviTextField().getText().isEmpty()) {
			Brojevi brojevi = new Brojevi(getScena2().getBrojeviTextField().getText());
			getScena2().getListaBrojeva().data.add(brojevi);
			getScena2().getBrojeviTextField().clear();
		} else {
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setContentText("Polje ne sme biti prazno!");
			alert.show();
		}

	}

	
	//ova metoda ne radi jer nam ne radi GrupeKontakata 
	
	public void prikaziBtn() {

		// ova metoda nije dobra, mora da uzima vrednost iz comboboxa i da prolista sve
		// vrednosti iz njega i doda u tabelu

		// ArrayList<String> listaOsoba =
		// getScena1().getListaImenaIPrezimena().getTableViewValues(scena1.getListaImenaIPrezimena());

		
		for (Kontakti kontakt :getScena2().getCombo().getKontakti() ) {
			
			System.out.println(kontakt.getKontakti().size());
			
		}
		
		/*
		String kojiTrazim = getScena2().getCombo().getValue().toString();

		ObservableList<Osoba> listaImenaIprezimena = FXCollections.observableArrayList();

		for (int i = 0; i < getScena2().getCombo().getKontakti().size(); i++) {

			Kontakti kontakt = getScena2().getCombo().getKontakti().get(i);

			if (kontakt.toString().equals(kojiTrazim)) {

				listaImenaIprezimena.add(kontakt.getKontakti().get(i));

				System.out.println(kontakt.getKontakti().size());

			}

		}

		scena1.getListaImenaIPrezimena().setItems(listaImenaIprezimena);

	}*/
	}

}
