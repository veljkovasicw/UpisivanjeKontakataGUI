package model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class KreirajBtnEvent implements EventHandler<javafx.event.ActionEvent> {

private TextField imePrezimeTextField;
private TextField AdresaTextField;
private TextField emailTextField;
private TextArea brojeviTextArea;
private Stage primaryStage;
private Scene drugaScena;

public  KreirajBtnEvent(TextField imePrezimeTextField , TextField AdresaTextField, TextField emailTextField,TextArea brojeviTextArea,Stage primaryStage, Scene drugaScena) {
	this.imePrezimeTextField=imePrezimeTextField;
	this.AdresaTextField=AdresaTextField;
	this.emailTextField=emailTextField;
	this.brojeviTextArea=brojeviTextArea;
	this.primaryStage=primaryStage;
	this.drugaScena= drugaScena;
	
}
	
	
	
	@Override
	public void handle(ActionEvent event) {
		imePrezimeTextField.clear();
		AdresaTextField.clear();
		emailTextField.clear();
		brojeviTextArea.clear();
		primaryStage.setScene(drugaScena);
		primaryStage.show();
		
	}

}
