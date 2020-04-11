package application;

import contoler.Controler;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
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

			primaryStage = Controler.getInstance().getPrimaryStage();

			/*
			 * Scena2 drugaScena = Controler.getInstance().getScena2();
			 * 
			 * Scena1 prvaScena = Controler.getInstance().getScena1();
			 */
			
		
			
			Scene scene1 = Controler.getInstance().getSceneOne();
			
			Scene scene2 = Controler.getInstance().getSceneTwo();
			
		
			scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene1);
			primaryStage.show();
			
			
			


			
			Controler.getInstance().getScena1().getPrikaziBtn().setOnAction(Controler.getInstance().getPrikaziBtnEvent());

			
			Controler.getInstance().getScena2().getDodajBtn().setOnAction(Controler.getInstance().getDodajBtnEvent());
		
			
			
			Controler.getInstance().getScena2().getSacuvajBtn().setOnAction( Controler.getInstance().getSacuvajBtnEvent());
		
			

			Controler.getInstance().getScena1().getDetaljnijeBtn().setOnAction(Controler.getInstance().getPrikaziDetaljnijeBtnEvent());
			
			Controler.getInstance().getScena1().getKreirajBtn().setOnAction(Controler.getInstance().getKreirajBtnEvent());
		
			
		//ovde nikad ne udje u IF , zbog cega 
			
			if(primaryStage.getScene().equals(scene2)) {
				System.out.println("Druga scena");
			
			scene2.getWindow().setOnCloseRequest(new EventHandler<WindowEvent>() {
				
				@Override
				public void handle(WindowEvent event) {
					
					Controler.getInstance().getPrimaryStage().setScene(scene1);
					Controler.getInstance().getPrimaryStage().show();
					
				}
			});
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}