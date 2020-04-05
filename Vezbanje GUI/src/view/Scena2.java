package view;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.Brojevi;
import model.Kontakti;
import model.Porodica;
import model.Posao;
import model.Prijatelji;

public class Scena2 extends BorderPane {

	private Label imeLabela;
	private TextField imeTextField;
	private HBox imeHbox;

	private Label prezimeLabela;
	private TextField prezimeTextField;
	private HBox prezimeHbox;

	private Label adresaLabela;
	private TextField adresaTextField;
	private HBox adresaHbox;

	private Label emailLabela;
	private TextField emailTextField;
	private HBox emailHbox;

	private Label brojeviLabela;
	private TextField brojeviTextField;
	private Button dodajBtn;
	private HBox brojeviHbox;

	private ListaBrojeva listaBrojeva;

	private Label grupeLabel;
	private GrupeKontaktaCombo combo2;

	private HBox grupeHbox;

	private Button sacuvajBtn;

	private VBox mainVBox;

	public Scena2() {

		imeLabela = new Label("Ime: ");
		imeTextField = new TextField();
		imeHbox = new HBox();
		imeHbox.getChildren().addAll(imeLabela, imeTextField);

		prezimeLabela = new Label("Prezime: ");
		prezimeTextField = new TextField();
		prezimeHbox = new HBox();
		prezimeHbox.getChildren().addAll(prezimeLabela, prezimeTextField);

		adresaLabela = new Label("Adresa: ");
		adresaTextField = new TextField();
		adresaHbox = new HBox();
		adresaHbox.getChildren().addAll(adresaLabela, adresaTextField);

		emailLabela = new Label("Email: ");
		emailTextField = new TextField();
		emailHbox = new HBox();
		emailHbox.getChildren().addAll(emailLabela, emailTextField);

		brojeviLabela = new Label("Brojevi telefona: ");
		brojeviTextField = new TextField();
		dodajBtn = new Button("Dodaj");
		brojeviHbox = new HBox();
		brojeviHbox.getChildren().addAll(brojeviLabela, brojeviTextField, dodajBtn);

		listaBrojeva = new ListaBrojeva();

		grupeLabel = new Label("Grupe: ");
		
		//obrati paznju ovde 
	
		
		combo2 = GrupeKontaktaCombo.getInstance();
		
		
		
		// do ovde 
		
		grupeHbox = new HBox();
		grupeHbox.getChildren().addAll(grupeLabel, combo2);

		sacuvajBtn = new Button("Sacuvaj");

		mainVBox = new VBox();

		imeHbox.setAlignment(Pos.CENTER);

		prezimeHbox.setAlignment(Pos.CENTER);

		adresaHbox.setAlignment(Pos.CENTER);

		emailHbox.setAlignment(Pos.CENTER);

		brojeviHbox.setAlignment(Pos.CENTER);

		grupeHbox.setAlignment(Pos.CENTER);

		sacuvajBtn.setAlignment(Pos.CENTER);

		mainVBox.getChildren().addAll(imeHbox, prezimeHbox, adresaHbox, emailHbox, brojeviHbox, listaBrojeva, grupeHbox,
				sacuvajBtn);

		setAlignment(mainVBox, Pos.CENTER);
		setMargin(mainVBox, new Insets(12, 12, 12, 12));
		setCenter(mainVBox);

	}

	public Label getImeLabela() {
		return imeLabela;
	}

	public void setImeLabela(Label imeLabela) {
		this.imeLabela = imeLabela;
	}

	public TextField getImeTextField() {
		return imeTextField;
	}

	public void setImeTextField(TextField imeTextField) {
		this.imeTextField = imeTextField;
	}

	public HBox getImeHbox() {
		return imeHbox;
	}

	public void setImeHbox(HBox imeHbox) {
		this.imeHbox = imeHbox;
	}

	public Label getPrezimeLabela() {
		return prezimeLabela;
	}

	public void setPrezimeLabela(Label prezimeLabela) {
		this.prezimeLabela = prezimeLabela;
	}

	public TextField getPrezimeTextField() {
		return prezimeTextField;
	}

	public void setPrezimeTextField(TextField prezimeTextField) {
		this.prezimeTextField = prezimeTextField;
	}

	public HBox getPrezimeHbox() {
		return prezimeHbox;
	}

	public void setPrezimeHbox(HBox prezimeHbox) {
		this.prezimeHbox = prezimeHbox;
	}

	public Label getAdresaLabela() {
		return adresaLabela;
	}

	public void setAdresaLabela(Label adresaLabela) {
		this.adresaLabela = adresaLabela;
	}

	public TextField getAdresaTextField() {
		return adresaTextField;
	}

	public void setAdresaTextField(TextField adresaTextField) {
		this.adresaTextField = adresaTextField;
	}

	public HBox getAdresaHbox() {
		return adresaHbox;
	}

	public void setAdresaHbox(HBox adresaHbox) {
		this.adresaHbox = adresaHbox;
	}



	public Label getEmailLabela() {
		return emailLabela;
	}

	public void setEmailLabela(Label emailLabela) {
		this.emailLabela = emailLabela;
	}

	public TextField getEmailTextField() {
		return emailTextField;
	}

	public void setEmailTextField(TextField emailTextField) {
		this.emailTextField = emailTextField;
	}

	public HBox getEmailHbox() {
		return emailHbox;
	}

	public void setEmailHbox(HBox emailHbox) {
		this.emailHbox = emailHbox;
	}

	public Label getBrojeviLabela() {
		return brojeviLabela;
	}

	public void setBrojeviLabela(Label brojeviLabela) {
		this.brojeviLabela = brojeviLabela;
	}

	public TextField getBrojeviTextField() {
		return brojeviTextField;
	}

	public void setBrojeviTextField(TextField brojeviTextField) {
		this.brojeviTextField = brojeviTextField;
	}

	public Button getDodajBtn() {
		return dodajBtn;
	}

	public void setDodajBtn(Button dodajBtn) {
		this.dodajBtn = dodajBtn;
	}

	public HBox getBrojeviHbox() {
		return brojeviHbox;
	}

	public void setBrojeviHbox(HBox brojeviHbox) {
		this.brojeviHbox = brojeviHbox;
	}
	
	public ListaBrojeva getListaBrojeva() {
		return listaBrojeva;
	}

	//mozda puca
	public void setListaBrojeva(ListaBrojeva listaBrojeva) {
		this.listaBrojeva =  listaBrojeva;
	}

	public Label getGrupeLabel() {
		return grupeLabel;
	}

	public void setGrupeLabel(Label grupeLabel) {
		this.grupeLabel = grupeLabel;
	}

	public GrupeKontaktaCombo getCombo() {
		return combo2;
	}

	public void setCombo(GrupeKontaktaCombo combo) {
		this.combo2 = combo;
	}

	public HBox getGrupeHbox() {
		return grupeHbox;
	}

	public void setGrupeHbox(HBox grupeHbox) {
		this.grupeHbox = grupeHbox;
	}

	public Button getSacuvajBtn() {
		return sacuvajBtn;
	}

	public void setSacuvajBtn(Button sacuvajBtn) {
		this.sacuvajBtn = sacuvajBtn;
	}

	public VBox getMainVBox() {
		return mainVBox;
	}

	public void setMainVBox(VBox mainVBox) {
		this.mainVBox = mainVBox;
	}
	
	
}
