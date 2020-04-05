package model;



import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import view.ListaBrojeva;

public class DodajBrojBtnEvent implements EventHandler<javafx.event.ActionEvent> {

	
	private Button sacuvajBtn;
	private TextField  text;
	private ListaBrojeva  lista;
	
	public DodajBrojBtnEvent(Button dugme ,TextField scena, ListaBrojeva lista) {
		
		sacuvajBtn=dugme;
		text = scena;
		this.lista = lista;
	}
	





	@Override
	public void handle(javafx.event.ActionEvent event) {
		if (!text.getText().isEmpty()) {
			Brojevi brojevi = new Brojevi(text.getText());
			lista.data.add(brojevi);
			text.clear();
		} else {
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setContentText("Polje ne sme biti prazno!");
			alert.show();
		}
		
	}

}
