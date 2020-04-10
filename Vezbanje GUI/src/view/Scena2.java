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
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.Brojevi;
import model.Kontakti;
import model.Porodica;
import model.Posao;
import model.Prijatelji;

public class Scena2 extends GridPane {

	private Label imeLabela;
	private TextField imeTextField;

	private Label prezimeLabela;
	private TextField prezimeTextField;

	private Label adresaLabela;
	private TextField adresaTextField;

	private Label emailLabela;
	private TextField emailTextField;

	private Label brojeviLabela;
	private TextField brojeviTextField;
	private Button dodajBtn;
	
	private ListaBrojeva listaBrojeva;

	private Label grupeLabel;
<<<<<<< HEAD
	private GrupeKontaktaCombo combo2 = GrupeKontaktaCombo.getInstance();
=======
	private GrupeKontaktaCombo combo2= GrupeKontaktaCombo.getInstance();;

	private HBox grupeHbox;

>>>>>>> refs/heads/Veljko-branch
	private Button sacuvajBtn;

	public Scena2() {
		setPadding(new Insets(15, 40, 15, 30));
        setVgap(8);
        setHgap(10);
                //prvi red
		imeLabela = new Label("Ime: ");
		imeTextField = new TextField();
<<<<<<< HEAD
		setConstraints(imeLabela, 0, 0);
		setConstraints(imeTextField ,1, 0);
		
		
                //drugi red
=======
		imeHbox = new HBox();
		imeHbox.setPadding(new Insets(10,25,10,25));
		imeHbox.getChildren().addAll(imeLabela, imeTextField);

>>>>>>> refs/heads/Veljko-branch
		prezimeLabela = new Label("Prezime: ");
		prezimeTextField = new TextField();
<<<<<<< HEAD
        setConstraints(prezimeLabela, 0, 1);
        setConstraints(prezimeTextField, 1, 1);
        
                //treci red
=======
		prezimeHbox = new HBox();
		prezimeHbox.setPadding(new Insets(10,25,10,25));
		prezimeHbox.getChildren().addAll(prezimeLabela, prezimeTextField);
		
>>>>>>> refs/heads/Veljko-branch
		adresaLabela = new Label("Adresa: ");
		adresaTextField = new TextField();
<<<<<<< HEAD
        setConstraints(adresaLabela, 0 , 2);
        setConstraints(adresaTextField, 1, 2);
        
                //cetvrti red
=======
		adresaHbox = new HBox();
		adresaHbox.setPadding(new Insets(10,25,10,25));
		adresaHbox.getChildren().addAll(adresaLabela, adresaTextField);

>>>>>>> refs/heads/Veljko-branch
		emailLabela = new Label("Email: ");
		emailTextField = new TextField();
<<<<<<< HEAD
        setConstraints(emailLabela, 0, 3);
        setConstraints(emailTextField, 1, 3);
        
                //peti red
=======
		emailHbox = new HBox();
		emailHbox.setPadding(new Insets(10,25,10,25));
		emailHbox.getChildren().addAll(emailLabela, emailTextField);

>>>>>>> refs/heads/Veljko-branch
		brojeviLabela = new Label("Brojevi telefona: ");
		brojeviTextField = new TextField();
		dodajBtn = new Button("Dodaj");
<<<<<<< HEAD
        setConstraints(brojeviLabela, 0, 4);
        setConstraints(brojeviTextField, 1, 4);
        setConstraints(dodajBtn, 2, 4);
        
                //sesti red
=======
		brojeviHbox = new HBox();
		brojeviHbox.setPadding(new Insets(10,25,10,25));
		brojeviHbox.getChildren().addAll(brojeviLabela, brojeviTextField, dodajBtn);

>>>>>>> refs/heads/Veljko-branch
		listaBrojeva = new ListaBrojeva();
        setConstraints(listaBrojeva, 1, 5);
                //sedmi red 
		grupeLabel = new Label("Grupe: ");
                    //obrati paznju ovde 
		
<<<<<<< HEAD
                    // do ovde 
		setConstraints(grupeLabel, 0, 6);
        setConstraints(combo2, 1, 6);
                //osmi Red
=======
		//obrati paznju ovde 
		
		
		// do ovde 
		
		grupeHbox = new HBox();
		grupeHbox.setPadding(new Insets(10,25,10,25));
		grupeHbox.getChildren().addAll(grupeLabel, combo2);

>>>>>>> refs/heads/Veljko-branch
		sacuvajBtn = new Button("Sacuvaj");
<<<<<<< HEAD
        setConstraints(sacuvajBtn, 1, 7);
       
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(25);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(60);
        ColumnConstraints col3 = new ColumnConstraints();
        col3.setPercentWidth(15);
            
        getColumnConstraints().addAll(col1,col2,col3);
        
            	//na kraju Povezao sve elemente getChildAll
        getChildren().addAll(imeLabela,imeTextField,prezimeLabela,prezimeTextField,
        		adresaLabela,adresaTextField,emailLabela,emailTextField,brojeviLabela,
                brojeviTextField,dodajBtn,listaBrojeva,grupeLabel,combo2,sacuvajBtn); 
                
                
=======

		mainVBox = new VBox();
		mainVBox.setPadding(new Insets(10,25,10,25));

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

>>>>>>> refs/heads/Veljko-branch
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

	public Button getSacuvajBtn() {
		return sacuvajBtn;
	}

	public void setSacuvajBtn(Button sacuvajBtn) {
		this.sacuvajBtn = sacuvajBtn;
	}
	
}

