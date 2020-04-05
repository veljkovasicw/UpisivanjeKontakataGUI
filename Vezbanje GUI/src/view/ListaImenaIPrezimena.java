package view;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Brojevi;
import model.Osoba;

public class ListaImenaIPrezimena extends TableView<Osoba> {
	
	
	public ObservableList<Osoba> data = FXCollections.observableArrayList();
	
	TableColumn kolona = new TableColumn("Osobe");
	
	
	public ListaImenaIPrezimena() {
		
	getColumns().add(kolona);
		
		kolona.prefWidthProperty().bind(this.widthProperty().multiply(1));
		kolona.setCellValueFactory(new PropertyValueFactory<Osoba, String>("imeIPrezime"));
		
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
