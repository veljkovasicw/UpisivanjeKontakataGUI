package view;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import model.Kontakti;
import model.ListaKontakta;
import model.Porodica;
import model.Posao;
import model.Prijatelji;

public class GrupeKontaktaCombo extends ComboBox<String> {

	private static GrupeKontaktaCombo instance = null;

	public static ListaKontakta lista = new ListaKontakta();
	public static ObservableList<String> grupeLista = ListaKontakta.grupeLista;

	private GrupeKontaktaCombo(ObservableList<String> grupelista) {

		super(grupelista);

	}

	public static ArrayList<Kontakti> getKontakti() {
		return ListaKontakta.kontakti;
	}

	public static ObservableList<String> getGrupeLista() {
		return grupeLista;
	}

	public static void setGrupeLista(ObservableList<String> grupeLista) {
		GrupeKontaktaCombo.grupeLista = grupeLista;
	}

	public static GrupeKontaktaCombo getInstance() {

		if (instance == null) {

			instance = new GrupeKontaktaCombo(grupeLista);
			instance.setValue(getGrupeLista().get(0));
			
		
		}
		
		
		return instance;
	}

}
