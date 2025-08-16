package modulepkg.tib.Mannaf_2110279;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.List;

public class UpdateInventoryController {

    @FXML
    private ComboBox<String> selectItemCB;
    @FXML
    private Spinner<Integer> quantityGivenSpinner;
    @FXML
    private TextArea updateReasonTA;

    private List<InventoryUpdate> updates = new ArrayList<>();

    @FXML
    public void initialize() {
        selectItemCB.getItems().addAll(
                "Laptop",
                "Projector",
                "Office Chair",
                "Desk",
                "Printer"
        );
        selectItemCB.getSelectionModel().selectFirst();

        quantityGivenSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 10));
        updateReasonTA.setText("Restocking inventory for upcoming project.");
    }

    @FXML
    public void saveUpdateOA(ActionEvent actionEvent) {
        String item = selectItemCB.getSelectionModel().getSelectedItem();
        int quantity = quantityGivenSpinner.getValue();
        String reason = updateReasonTA.getText();

        InventoryUpdate update = new InventoryUpdate(item, quantity, reason);
        updates.add(update);

        System.out.println("Inventory Updated: " + update);
    }

    @FXML
    public void cancelOA(ActionEvent actionEvent) {
        selectItemCB.getSelectionModel().selectFirst();
        quantityGivenSpinner.getValueFactory().setValue(1);
        updateReasonTA.clear();
    }
}
