package modulepkg.tib.Mannaf_2110279;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class CheckStockLevelsController {

    @FXML
    private TableView<Stock> stocksTV;
    @FXML
    private TableColumn<Stock, String> itemNameColumn;
    @FXML
    private TableColumn<Stock, String> catagoryColumn;
    @FXML
    private TableColumn<Stock, Integer> QuantityColumn;

    private ObservableList<Stock> stockList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        itemNameColumn.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        catagoryColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        QuantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        stockList.addAll(
                new Stock("Notebook", "Stationery", 50),
                new Stock("Pen", "Stationery", 120),
                new Stock("Marker", "Stationery", 40),
                new Stock("Printer Paper", "Office Supplies", 200),
                new Stock("Stapler", "Office Supplies", 30),
                new Stock("Envelope", "Stationery", 75)
        );

        stocksTV.setItems(stockList);
    }

    @FXML
    public void downloadlistOA(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Download");
        alert.setHeaderText(null);
        alert.setContentText("Stock list downloaded successfully!");
        alert.showAndWait();
    }

    @FXML
    public void markfororderOA(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Mark for Order");
        alert.setHeaderText(null);
        alert.setContentText("Selected items marked for order.");
        alert.showAndWait();
    }
}
