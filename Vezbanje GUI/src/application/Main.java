package application;

import java.sql.Savepoint;

import contoler.Controler;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import model.Porodica;
import model.Posao;
import model.Prijatelji;
import model.DodajBrojBtnEvent;
import view.Scena1;
import view.Scena2;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {

		try {

			// ovo kad obrises stani

			

			Scena2 drugaScena = Controler.getInstance().getScena2();
			
			Scena1 prvaScena = Controler.getInstance().getScena1();

			
			Scene scene2 = new Scene(drugaScena, 400, 400);
			
			Scene scene1 = new Scene(prvaScena, 1000, 600);

			scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene1);
			primaryStage.show();

			
			prvaScena.getPrikaziBtn().setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					Controler.getInstance().prikaziBtn();
					
				}
			});
			
			prvaScena.getKreirajBtn().setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {

					primaryStage.setScene(scene2);
					primaryStage.show();

				}
			});

			drugaScena.getDodajBtn().setOnAction(new DodajBrojBtnEvent(drugaScena.getDodajBtn(), drugaScena.getBrojeviTextField(), drugaScena.getListaBrojeva()));

			drugaScena.getSacuvajBtn().setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					
					ObservableList<String> grupeLista = Controler.getInstance().saveKontakt();
			
					 
					 prvaScena.getCombo().setItems(grupeLista);
						
					 
					 prvaScena.getCombo().setValue(grupeLista.get(0));
					
				
					
					
					
					primaryStage.setScene(scene1);
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