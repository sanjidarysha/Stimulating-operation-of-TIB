package modulepkg.tib.Mannaf_2110279;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.time.LocalDate;

public class ApproveBudgetRequestsController {

    @FXML
    private TableView<BudgetRequest> budgetreqTV;
    @FXML
    private TableColumn<BudgetRequest, String> requestIDColumn;
    @FXML
    private TableColumn<BudgetRequest, String> departmentColumn;
    @FXML
    private TableColumn<BudgetRequest, Double> requestedAmountColumn;
    @FXML
    private TableColumn<BudgetRequest, String> statusColumn;
    @FXML
    private TableColumn<BudgetRequest, LocalDate> requestdateColumn;
    @FXML
    private TableColumn<BudgetRequest, Double> approvedAmountColumn;
    @FXML
    private TableColumn<BudgetRequest, String> priorityLevelColumn;

    private ObservableList<BudgetRequest> requestList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        requestList.addAll(
                new BudgetRequest("BR001", "HR", 5000.0, "Pending", LocalDate.now().minusDays(3), 0.0, "High"),
                new BudgetRequest("BR002", "Finance", 3000.0, "Pending", LocalDate.now().minusDays(2), 0.0, "Medium"),
                new BudgetRequest("BR003", "IT", 8000.0, "Pending", LocalDate.now().minusDays(1), 0.0, "High")
        );
        budgetreqTV.setItems(requestList);
    }

    @FXML
    public void approveOA(ActionEvent actionEvent) {
        BudgetRequest selected = budgetreqTV.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatus("Approved");
            selected.setApprovedAmount(selected.getRequestedAmount());
            budgetreqTV.refresh();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Approved");
            alert.setHeaderText(null);
            alert.setContentText("Request " + selected.getRequestID() + " approved.");
            alert.showAndWait();
        }
    }

    @FXML
    public void rejectOA(ActionEvent actionEvent) {
        BudgetRequest selected = budgetreqTV.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatus("Rejected");
            budgetreqTV.refresh();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Rejected");
            alert.setHeaderText(null);
            alert.setContentText("Request " + selected.getRequestID() + " rejected.");
            alert.showAndWait();
        }
    }
}
