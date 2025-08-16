package modulepkg.tib.Mannaf_2110279;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.time.LocalDate;

public class MonitorPaymentDeadlinesController {

    @FXML
    private TableView<Payment> paymentTV;
    @FXML
    private TableColumn<Payment, String> paymentIDcolumn;
    @FXML
    private TableColumn<Payment, String> vendorColumn;
    @FXML
    private TableColumn<Payment, Double> amountColumn;
    @FXML
    private TableColumn<Payment, LocalDate> dueDateColumn;
    @FXML
    private TableColumn<Payment, String> statusColumn;
    @FXML
    private TableColumn<Payment, Boolean> reminderSetNewColumn;
    @FXML
    private TableColumn<Payment, String> paymentTypeNewColumn;
    @FXML
    private CheckBox addReminderCB;

    private ObservableList<Payment> paymentList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        paymentList.addAll(
                new Payment("P001", "Rafiq Traders", 5000, LocalDate.of(2025, 8, 20), "Pending", true, "Cash"),
                new Payment("P002", "Hasan & Sons", 12000, LocalDate.of(2025, 8, 22), "Pending", false, "Cheque"),
                new Payment("P003", "Rahman Supplies", 7500, LocalDate.of(2025, 8, 25), "Completed", true, "Bank Transfer"),
                new Payment("P004", "Biplob Electronics", 15000, LocalDate.of(2025, 8, 28), "Pending", false, "Cash")
        );

        paymentTV.setItems(paymentList);
    }

    @FXML
    public void doneOA(ActionEvent actionEvent) {
        for (Payment p : paymentList) {
            if (addReminderCB.isSelected() && !p.isReminderSet()) {
                p.setReminderSet(true);
            }
            if (p.getStatus().equals("Pending")) {
                p.setStatus("Completed");
            }
        }
        paymentTV.refresh();
    }

    @FXML
    public void exportOA(ActionEvent actionEvent) {
        System.out.println("Exporting payment data...");
        paymentList.forEach(System.out::println);
    }
}
