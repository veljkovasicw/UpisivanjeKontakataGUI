package contoler;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;
import model.DodajBrojBtnEvent;
import model.KreirajBtnEvent;
import model.Porodica;
import model.Posao;
import model.Prijatelji;
import model.PrikaziBtnEvent;
import model.PrikaziDetaljeBtnEvent;
import model.SacuvajBtnEvent;
import view.GrupeKontaktaCombo;
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
	
	private DodajBrojBtnEvent dodajBtnEvent;
	private PrikaziBtnEvent prikaziBtnEvent;
	private PrikaziDetaljeBtnEvent prikaziDetaljnijeBtnEvent;
	private SacuvajBtnEvent sacuvajBtnEvent;
	private KreirajBtnEvent kreirajBtnEvent;
	
	private Stage primaryStage = new Stage();
	private Scene sceneOne;
	private Scene sceneTwo;

	

	private Controler() {

		scena1 = new Scena1();
		scena2 = new Scena2();
		sceneOne = new Scene(scena1, 1000, 600);
		sceneTwo =  new Scene(scena2, 400, 400);
		
		porodica = Porodica.getInstance();
		posao = Posao.getInstance();
		prijatelji = Prijatelji.getInstance();
		grupeKontaktaCombo = GrupeKontaktaCombo.getInstance();
		dodajBtnEvent = new DodajBrojBtnEvent(scena2.getDodajBtn(), scena2.getBrojeviTextField(), scena2.getListaBrojeva());
		prikaziBtnEvent = new PrikaziBtnEvent(scena2.getCombo(), scena1.getCombo(), scena1.getListaImenaIPrezimena());
		prikaziDetaljnijeBtnEvent= new PrikaziDetaljeBtnEvent(scena1.getListaImenaIPrezimena(), scena1.getImePrezimeTextField(),scena1.getAdresaTextField(), scena1.getEmailTextField(), scena1.getBrojeviTextArea());
		sacuvajBtnEvent = new SacuvajBtnEvent(scena2.getImeTextField(), scena2.getPrezimeTextField(), scena2.getAdresaTextField(), scena2.getEmailTextField(), scena2.getBrojeviTextField(), scena2.getListaBrojeva(), scena2.getCombo(), scena1.getListaImenaIPrezimena(), scena1.getCombo(), primaryStage, sceneOne);
		kreirajBtnEvent = new KreirajBtnEvent(scena1.getImePrezimeTextField(), scena1.getAdresaTextField(), scena1.getEmailTextField(), scena1.getBrojeviTextArea(), primaryStage, sceneTwo);
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

	public DodajBrojBtnEvent getDodajBtnEvent() {
		return dodajBtnEvent;
	}

	public void setDodajBtnEvent(DodajBrojBtnEvent dodajBtnEvent) {
		this.dodajBtnEvent = dodajBtnEvent;
	}

	public PrikaziBtnEvent getPrikaziBtnEvent() {
		return prikaziBtnEvent;
	}

	public void setPrikaziBtnEvent(PrikaziBtnEvent prikaziBtnEvent) {
		this.prikaziBtnEvent = prikaziBtnEvent;
	}

	public PrikaziDetaljeBtnEvent getPrikaziDetaljnijeBtnEvent() {
		return prikaziDetaljnijeBtnEvent;
	}

	public void setPrikaziDetaljnijeBtnEvent(PrikaziDetaljeBtnEvent prikaziDetaljnijeBtnEvent) {
		this.prikaziDetaljnijeBtnEvent = prikaziDetaljnijeBtnEvent;
	}

	public SacuvajBtnEvent getSacuvajBtnEvent() {
		return sacuvajBtnEvent;
	}

	public void setSacuvajBtnEvent(SacuvajBtnEvent sacuvajBtnEvent) {
		this.sacuvajBtnEvent = sacuvajBtnEvent;
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	public Scene getSceneOne() {
		return sceneOne;
	}

	public void setSceneOne(Scene sceneOne) {
		this.sceneOne = sceneOne;
	}

	public Scene getSceneTwo() {
		return sceneTwo;
	}

	public void setSceneTwo(Scene sceneTwo) {
		this.sceneTwo = sceneTwo;
	}

	public KreirajBtnEvent getKreirajBtnEvent() {
		return kreirajBtnEvent;
	}

	public void setKreirajBtnEvent(KreirajBtnEvent kreirajBtnEvent) {
		this.kreirajBtnEvent = kreirajBtnEvent;
	}


}
