package modulepkg.tib.Mannaf_2110279;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReceiveSuppliesController {

    @FXML
    private TextField itemNameTf;
    @FXML
    private TextField quantityTF;
    @FXML
    private TextField sourceTF;
    @FXML
    private TextField supplierContactTF;
    @FXML
    private TextField unitPriceTF;
    @FXML
    private DatePicker dateDP;

    private List<Supply> supplyList = new ArrayList<>();

    @FXML
    public void initialize() {
        itemNameTf.setText("Notebook");
        quantityTF.setText("100");
        sourceTF.setText("Local Supplier");
        supplierContactTF.setText("017xxxxxxxx");
        unitPriceTF.setText("50");
        dateDP.setValue(LocalDate.now());
    }

    @FXML
    public void saveOA(ActionEvent actionEvent) {
        String itemName = itemNameTf.getText();
        int quantity = Integer.parseInt(quantityTF.getText());
        String source = sourceTF.getText();
        String supplierContact = supplierContactTF.getText();
        double unitPrice = Double.parseDouble(unitPriceTF.getText());
        LocalDate date = dateDP.getValue();

        Supply supply = new Supply(itemName, quantity, source, supplierContact, unitPrice, date);
        supplyList.add(supply);

        System.out.println("Saved: " + supply);
    }

    @FXML
    public void resetOA(ActionEvent actionEvent) {
        itemNameTf.clear();
        quantityTF.clear();
        sourceTF.clear();
        supplierContactTF.clear();
        unitPriceTF.clear();
        dateDP.setValue(null);
    }
}
