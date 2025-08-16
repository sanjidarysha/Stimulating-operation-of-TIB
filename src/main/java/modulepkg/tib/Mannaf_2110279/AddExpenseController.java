package modulepkg.tib.Mannaf_2110279;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

public class AddExpenseController {

    @FXML
    private ComboBox<String> expensetypeCB;
    @FXML
    private Spinner<Double> amountSpinner;
    @FXML
    private TextArea reasonTA;
    @FXML
    private DatePicker dateDP;
    @FXML
    private ImageView addnewexpenseIV;
    @FXML
    private ComboBox<String> paymentmethodCB;

    private String receiptPath = ""; // optional path of uploaded receipt

    @FXML
    public void initialize() {
        // Example: populate ComboBoxes
        expensetypeCB.getItems().addAll("Office Supplies", "Travel", "Utilities", "Other");
        paymentmethodCB.getItems().addAll("Cash", "Bank Transfer", "Card", "Other");
    }

    @FXML
    public void uploadReceiptOA(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Upload Receipt");
        alert.setHeaderText(null);
        alert.setContentText("Receipt uploaded successfully (placeholder).");
        alert.showAndWait();

        receiptPath = "path/to/receipt.pdf";
    }

    @FXML
    public void submitOA(ActionEvent actionEvent) {
        try {
            Expense expense = new Expense(
                    expensetypeCB.getValue(),
                    amountSpinner.getValue(),
                    reasonTA.getText(),
                    paymentmethodCB.getValue(),
                    dateDP.getValue(),
                    receiptPath
            );

            System.out.println("Submitted Expense: " + expense.toString());

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("Expense submitted successfully!");
            alert.showAndWait();

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all fields correctly.");
            alert.showAndWait();
        }
    }

    @FXML
    public void cancelOA(ActionEvent actionEvent) {
        expensetypeCB.setValue(null);
        amountSpinner.getValueFactory().setValue(0.0);
        reasonTA.clear();
        paymentmethodCB.setValue(null);
        dateDP.setValue(null);
        receiptPath = "";

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Cancelled");
        alert.setHeaderText(null);
        alert.setContentText("Form has been cleared.");
        alert.showAndWait();
    }
}
