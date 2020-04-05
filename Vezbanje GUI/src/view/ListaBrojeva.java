package view;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Brojevi;

public class ListaBrojeva  extends TableView<Brojevi>{
	
	public ObservableList<Brojevi> data = FXCollections.observableArrayList();
	
	TableColumn kolona = new TableColumn("Brojevi");
	
	
	
	
	public ListaBrojeva() {
		
		
		getColumns().add(kolona);
		
		kolona.prefWidthProperty().bind(this.widthProperty().multiply(1));
		kolona.setCellValueFactory(new PropertyValueFactory<Brojevi, String>("brojevi"));
		
		setItems(data);
		
		
	}
	
	
	//obrati ovde paznju jer je ovo za vise kolona u jednom rowu
	
	  public static ArrayList<String> getTableViewValues(TableView tableView) {
		    ArrayList<String> values = new ArrayList<>();
		    ObservableList<TableColumn> columns = tableView.getColumns();

		    for (Object row : tableView.getItems()) {
		      for (TableColumn column : columns) {
		        values.add(
		          (String) column.
		          getCellObservableValue(row).
		          getValue());
		      }
		    }

		    return values;
		  }

}
