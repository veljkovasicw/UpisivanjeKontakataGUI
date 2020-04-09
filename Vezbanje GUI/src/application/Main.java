package application;

import contoler.Controler;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.DodajBrojBtnEvent;
import model.PrikaziBtnEvent;
import model.PrikaziDetaljeBtnEvent;
import model.SacuvajBtnEvent;
import view.Scena1;
import view.Scena2;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {

		try {

		

			Scena2 drugaScena = Controler.getInstance().getScena2();
			
			Scena1 prvaScena = Controler.getInstance().getScena1();

			
		
			
			Scene scene1 = Controler.getInstance().getSceneOne();
			
			Scene scene2 = Controler.getInstance().getSceneTwo();

			scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene1);
			primaryStage.show();

			
			Controler.getInstance().getScena1().getPrikaziBtn().setOnAction(new PrikaziBtnEvent(drugaScena.getCombo(), prvaScena.getCombo(), prvaScena.getListaImenaIPrezimena()));
		

			Controler.getInstance().getScena2().getDodajBtn().setOnAction(new DodajBrojBtnEvent(drugaScena.getDodajBtn(), drugaScena.getBrojeviTextField(), drugaScena.getListaBrojeva()));

		
			
			Controler.getInstance().getScena2().getSacuvajBtn().setOnAction(new SacuvajBtnEvent(drugaScena.getImeTextField(), drugaScena.getPrezimeTextField(), drugaScena.getAdresaTextField(), drugaScena.getEmailTextField(), drugaScena.getBrojeviTextField(), drugaScena.getListaBrojeva(), drugaScena.getCombo(), prvaScena.getListaImenaIPrezimena(), prvaScena.getCombo(), primaryStage, scene1));
			Controler.getInstance().getScena1().getDetaljnijeBtn().setOnAction(new PrikaziDetaljeBtnEvent(prvaScena.getListaImenaIPrezimena(), prvaScena.getImePrezimeTextField(), prvaScena.getAdresaTextField(), prvaScena.getEmailTextField(), prvaScena.getBrojeviTextArea()));

			
			
			
			prvaScena.getKreirajBtn().setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {

					prvaScena.getImePrezimeTextField().clear();
					prvaScena.getAdresaTextField().clear();
					prvaScena.getEmailTextField().clear();
					prvaScena.getBrojeviTextArea().clear();
					primaryStage.setScene(scene2);
					primaryStage.show();
					

				}
			});
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}