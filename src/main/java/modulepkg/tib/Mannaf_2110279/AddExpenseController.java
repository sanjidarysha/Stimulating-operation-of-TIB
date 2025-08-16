package modulepkg.tib.Mannaf_2110279;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

import java.time.LocalDate;

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

    private ObservableList<Expense> expenseList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        expensetypeCB.setItems(FXCollections.observableArrayList(
                "Stationery", "Travel", "Food", "Utilities", "Maintenance"
        ));
        paymentmethodCB.setItems(FXCollections.observableArrayList(
                "Cash", "Card", "Bank Transfer"
        ));
        amountSpinner.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0, 1000, 100, 10));

        // Pre-fill with example data
        expensetypeCB.setValue("Stationery");
        paymentmethodCB.setValue("Cash");
        amountSpinner.getValueFactory().setValue(150.0);
        reasonTA.setText("Office notebooks and pens");
        dateDP.setValue(LocalDate.now());

        expenseList.addAll(
                new Expense("Stationery", 150.0, "Office notebooks and pens", "Cash", LocalDate.now().minusDays(2)),
                new Expense("Travel", 300.0, "Taxi fare for meeting", "Card", LocalDate.now().minusDays(1)),
                new Expense("Food", 120.0, "Team lunch", "Cash", LocalDate.now())
        );
    }

    @FXML
    public void submitOA(ActionEvent actionEvent) {
        Expense exp = new Expense(
                expensetypeCB.getValue(),
                amountSpinner.getValue(),
                reasonTA.getText(),
                paymentmethodCB.getValue(),
                dateDP.getValue()
        );
        expenseList.add(exp);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Expense Submitted");
        alert.setHeaderText(null);
        alert.setContentText("Expense added: " + exp.toString());
        alert.showAndWait();
    }

    @FXML
    public void cancelOA(ActionEvent actionEvent) {
        expensetypeCB.setValue(null);
        paymentmethodCB.setValue(null);
        amountSpinner.getValueFactory().setValue(0.0);
        reasonTA.clear();
        dateDP.setValue(null);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Cancelled");
        alert.setHeaderText(null);
        alert.setContentText("Form has been cleared.");
        alert.showAndWait();
    }

    @FXML
    public void uploadReceiptOA(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Upload Receipt");
        alert.setHeaderText(null);
        alert.setContentText("Receipt upload functionality placeholder.");
        alert.showAndWait();
    }
}
