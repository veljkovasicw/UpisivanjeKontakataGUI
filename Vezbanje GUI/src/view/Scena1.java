package view;

import java.util.ArrayList;

import com.sun.xml.internal.ws.dump.LoggingDumpTube.Position;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.Kontakti;
import model.Osoba;
import model.Porodica;
import model.Posao;
import model.Prijatelji;

public class Scena1 extends BorderPane {
	//top
	//sa ovim comboboxom radi ali nam je potreban JEDINSTVENI COMBO BOX 
	private ComboBox<String> combo;
	
	// ovde mora da proradi GrupeKontaktaCombo
	private GrupeKontaktaCombo comboBox;
	private Button prikaziBtn;
	private HBox topHBox;
	//left
	private ListaImenaIPrezimena listaImenaIPrezimena;
	//center
	private Button detaljnijeBtn;
	//bottom
	private Button kreirajBtn;
	
	//right
	private GridPane gridSaElementima;
	private Label imePrezimeLabela;
	private TextField imePrezimeTextField;
	private HBox imePrezimeHbox;
	private Label adresaLabela;
	private TextField adresaTextField;
	private HBox adresaHbox;
	private Label emailLabela;
	private TextField emailTextField;
	private HBox emailHbox;
	private Label brojeviLabela;
	private TextArea brojeviTextArea;
	private HBox brojeviHbox;
	private VBox rightVBox;
	public Scena1() {
		
		
		setTop(getHboxTop());
		listaImenaIPrezimena= new ListaImenaIPrezimena();
		listaImenaIPrezimena.setPrefSize(300, 200);
		listaImenaIPrezimena.setMaxHeight(400);
		setMargin(listaImenaIPrezimena, new Insets(0, 20, 20, 20));
		setLeft(listaImenaIPrezimena);
		
		detaljnijeBtn = new Button("Prikazi detaljnije");
		setMargin(detaljnijeBtn, new Insets(30, 30, 30, 30));
		setCenter(detaljnijeBtn);
		
		setMargin(getGridPaneRight(), new Insets(10, 10, 10, 20));
		setAlignment(getGridPaneRight(), Pos.CENTER);
		setRight(getGridPaneRight());
		
		kreirajBtn= new Button("Kreiraj novi");
		
		setMargin(kreirajBtn, new Insets(10, 10, 10, 10));
		setAlignment(kreirajBtn, Pos.BOTTOM_CENTER);
		setBottom(kreirajBtn);
//		imePrezimeHbox= new HBox();
//		imePrezimeHbox.getChildren().add(imePrezimeLabela);
//		imePrezimeHbox.getChildren().add(imePrezimeTextField);
		
		
//		adresaHbox= new HBox();
//		adresaHbox.getChildren().addAll(adresaLabela, adresaTextField);
		
		
//		emailHbox= new HBox();
//		emailHbox.getChildren().addAll(emailLabela, emailTextField);
		
		
		
//		brojeviHbox= new HBox();
//		brojeviHbox.getChildren().addAll(brojeviLabela,brojeviTextArea);
		
		
//		rightVBox= new VBox();
//		
//		rightVBox.getChildren().addAll(imePrezimeHbox,adresaHbox,emailHbox,brojeviHbox);
//		setRight(rightVBox);
	}
	public HBox getHboxTop() {
		prikaziBtn = new Button("Prikazi");
		
		  ArrayList<Kontakti> kontakti= new ArrayList<Kontakti>();
		
		  ObservableList<String> grupeLista ;
			
			kontakti.add(Porodica.getInstance());
			kontakti.add(Prijatelji.getInstance());
			kontakti.add(Posao.getInstance());
			
			grupeLista = FXCollections.observableArrayList(kontakti.get(0).toString() + " - " +kontakti.get(0).getKontakti().size(),kontakti.get(1).toString()+ " - " +kontakti.get(1).getKontakti().size(),kontakti.get(2).toString()+ " - " +kontakti.get(2).getKontakti().size() );
			
		//ovaj combobox je tu samo da bi imali combobox na sceni1 , nece cak ni da se uveca broj kontakata 
		combo =new ComboBox<String>(grupeLista);
		combo.setValue(grupeLista.get(0));
		
		topHBox = new HBox();
		topHBox.setMargin(prikaziBtn, new Insets(20, 20, 10, 5));
		topHBox.setMargin(combo, new Insets(20, 5, 10, 20));
		
	//	comboBox = GrupeKontaktaCombo.getInstance();
	
		topHBox.getChildren().addAll(combo, prikaziBtn);
	
		return topHBox;
	}
	public GridPane getGridPaneRight() {
		gridSaElementima = new GridPane();
		gridSaElementima.setPadding(new Insets(15, 15, 15, 15));
		gridSaElementima.setVgap(8);
		gridSaElementima.setHgap(10);
	
		//1 red
		imePrezimeLabela = new Label("Ime i prezime: ");
		imePrezimeTextField = new TextField();
		imePrezimeTextField.setPrefWidth(200);
		imePrezimeTextField.setMaxWidth(200);
		gridSaElementima.setConstraints(imePrezimeLabela, 0, 0);
		gridSaElementima.setConstraints(imePrezimeTextField, 1, 0);
		
		//2red
		adresaLabela = new Label("Adresa: ");
		adresaTextField= new TextField();
		adresaTextField.setPrefWidth(200);
		adresaTextField.setMaxWidth(200);
		gridSaElementima.setConstraints(adresaLabela, 0, 1);
		gridSaElementima.setConstraints(adresaTextField, 1, 1);
		//3red
		emailLabela = new Label("Email: ");
		emailTextField = new TextField();
		emailTextField.setPrefWidth(200);
		emailTextField.setMaxWidth(200);
		gridSaElementima.setConstraints(emailLabela, 0, 2);
		gridSaElementima.setConstraints(emailTextField, 1, 2);
		//4red
		brojeviLabela = new Label("Brojevi telefona: ");
		
		brojeviTextArea = new TextArea();
		brojeviTextArea.setPrefRowCount(5);
		brojeviTextArea.setPrefWidth(200);
		gridSaElementima.setConstraints(brojeviLabela, 0, 3);
		gridSaElementima.setConstraints(brojeviTextArea, 1, 3);
		
		gridSaElementima.getChildren().addAll(imePrezimeLabela,imePrezimeTextField,adresaLabela,adresaTextField,
				emailLabela,emailTextField,brojeviLabela,brojeviTextArea);
		
		return gridSaElementima;
	} 
	public GrupeKontaktaCombo getComboBox() {
		return comboBox;
	}
	public void setComboBox(GrupeKontaktaCombo comboBox) {
		this.comboBox = comboBox;
	}
	public ComboBox<String> getCombo() {
		return combo;
	}
	public void setCombo(GrupeKontaktaCombo combo) {
		this.combo = combo;
	}
	public Button getPrikaziBtn() {
		return prikaziBtn;
	}
	public void setPrikaziBtn(Button prikaziBtn) {
		this.prikaziBtn = prikaziBtn;
	}
	public HBox getTopHBox() {
		return topHBox;
	}
	public void setTopHBox(HBox topHBox) {
		this.topHBox = topHBox;
	}
	
	public ListaImenaIPrezimena getListaImenaIPrezimena() {
		return listaImenaIPrezimena;
	}
	public void setListaImenaIPrezimena(ListaImenaIPrezimena listaImenaIPrezimena) {
		this.listaImenaIPrezimena = listaImenaIPrezimena;
	}
	public Button getDetaljnijeBtn() {
		return detaljnijeBtn;
	}
	public void setDetaljnijeBtn(Button detaljnijeBtn) {
		this.detaljnijeBtn = detaljnijeBtn;
	}
	public Button getKreirajBtn() {
		return kreirajBtn;
	}
	public void setKreirajBtn(Button kreirajBtn) {
		this.kreirajBtn = kreirajBtn;
	}
	public Label getImePrezimeLabela() {
		return imePrezimeLabela;
	}
	public void setImePrezimeLabela(Label imePrezimeLabela) {
		this.imePrezimeLabela = imePrezimeLabela;
	}
	public TextField getImePrezimeTextField() {
		return imePrezimeTextField;
	}
	public void setImePrezimeTextField(TextField imePrezimeTextField) {
		this.imePrezimeTextField = imePrezimeTextField;
	}
	public HBox getImePrezimeHbox() {
		return imePrezimeHbox;
	}
	public void setImePrezimeHbox(HBox imePrezimeHbox) {
		this.imePrezimeHbox = imePrezimeHbox;
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
	public TextArea getBrojeviTextArea() {
		return brojeviTextArea;
	}
	public void setBrojeviTextArea(TextArea brojeviTextArea) {
		this.brojeviTextArea = brojeviTextArea;
	}
	public HBox getBrojeviHbox() {
		return brojeviHbox;
	}
	public void setBrojeviHbox(HBox brojeviHbox) {
		this.brojeviHbox = brojeviHbox;
	}
	public VBox getRightVBox() {
		return rightVBox;
	}
	public void setRightVBox(VBox rightVBox) {
		this.rightVBox = rightVBox;
	}
}