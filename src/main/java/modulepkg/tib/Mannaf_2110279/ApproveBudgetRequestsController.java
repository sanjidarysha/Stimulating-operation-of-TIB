package modulepkg.tib.Mannaf_2110279;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

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
        requestIDColumn.setCellValueFactory(new PropertyValueFactory<>("requestID"));
        departmentColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        requestedAmountColumn.setCellValueFactory(new PropertyValueFactory<>("requestedAmount"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        requestdateColumn.setCellValueFactory(new PropertyValueFactory<>("requestDate"));
        approvedAmountColumn.setCellValueFactory(new PropertyValueFactory<>("approvedAmount"));
        priorityLevelColumn.setCellValueFactory(new PropertyValueFactory<>("priorityLevel"));

        requestList.add(new BudgetRequest("REQ001", "HR", 1500, "Pending", LocalDate.now(), 0, "High"));
        requestList.add(new BudgetRequest("REQ002", "IT", 3000, "Pending", LocalDate.now(), 0, "Medium"));

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
            alert.setContentText("Budget request " + selected.getRequestID() + " approved.");
            alert.showAndWait();
        } else {
            showSelectAlert();
        }
    }

    @FXML
    public void rejectOA(ActionEvent actionEvent) {
        BudgetRequest selected = budgetreqTV.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatus("Rejected");
            selected.setApprovedAmount(0);
            budgetreqTV.refresh();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Rejected");
            alert.setHeaderText(null);
            alert.setContentText("Budget request " + selected.getRequestID() + " rejected.");
            alert.showAndWait();
        } else {
            showSelectAlert();
        }
    }

    private void showSelectAlert() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("No Selection");
        alert.setHeaderText(null);
        alert.setContentText("Please select a budget request from the table first.");
        alert.showAndWait();
    }
}
