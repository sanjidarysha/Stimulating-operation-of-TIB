package modulepkg.tib.Mannaf_2110279;

import com.sun.javafx.charts.Legend;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class ReceiveSuppliesController
{
    @javafx.fxml.FXML
    private TextField itemNameTf;
    @javafx.fxml.FXML
    private TextField supplierContactTF;
    @javafx.fxml.FXML
    private TextField unitPriceTF;
    @javafx.fxml.FXML
    private TextField sourceTF;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private TextField quantityTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveOA(ActionEvent actionEvent) {
        try {
            ReceiveSupplies supply = new ReceiveSupplies(
                    itemNameTf.getText(),
                    Integer.parseInt(quantityTF.getText()),
                    sourceTF.getText(),
                    supplierContactTF.getText(),
                    Double.parseDouble(unitPriceTF.getText()),
                    dateDP.getValue()
            );
            System.out.println("Saved Data: " + supply.toString());

            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("Supply data saved successfully!");
            alert.showAndWait();

        } catch (NumberFormatException e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Quantity and Unit Price must be numeric!");
            alert.showAndWait();
        }
    }

    @javafx.fxml.FXML
    public void resetOA(ActionEvent actionEvent) {
        itemNameTf.clear();
        quantityTF.clear();
        sourceTF.clear();
        supplierContactTF.clear();
        unitPriceTF.clear();
        dateDP.setValue(null);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Reset");
        alert.setHeaderText(null);
        alert.setContentText("Form has been reset.");
        alert.showAndWait();
    }
}
