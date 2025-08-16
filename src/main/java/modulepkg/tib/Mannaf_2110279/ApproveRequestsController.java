package modulepkg.tib.Mannaf_2110279;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class ApproveRequestsController {

    @FXML
    private TableView<StaffRequest> staffReqTV;
    @FXML
    private TableColumn<StaffRequest, String> employeenameColumn;
    @FXML
    private TableColumn<StaffRequest, String> itemColumn;
    @FXML
    private TableColumn<StaffRequest, Integer> quantityColumn;
    @FXML
    private TableColumn<StaffRequest, LocalDate> dateColumn;
    @FXML
    private TextArea commentsTA;

    private ObservableList<StaffRequest> requestList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        employeenameColumn.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
        itemColumn.setCellValueFactory(new PropertyValueFactory<>("item"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        requestList.add(new StaffRequest("John Doe", "Laptop", 1, LocalDate.now(), "", "Pending"));
        requestList.add(new StaffRequest("Jane Smith", "Chair", 2, LocalDate.now(), "", "Pending"));

        staffReqTV.setItems(requestList);
    }

    @FXML
    public void approveOA(ActionEvent actionEvent) {
        StaffRequest selected = staffReqTV.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatus("Approved");
            selected.setComments(commentsTA.getText());
            staffReqTV.refresh();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Approved");
            alert.setHeaderText(null);
            alert.setContentText("Request by " + selected.getEmployeeName() + " approved.");
            alert.showAndWait();
        } else {
            showSelectAlert();
        }
    }

    @FXML
    public void rejectOA(ActionEvent actionEvent) {
        StaffRequest selected = staffReqTV.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatus("Rejected");
            selected.setComments(commentsTA.getText());
            staffReqTV.refresh();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Rejected");
            alert.setHeaderText(null);
            alert.setContentText("Request by " + selected.getEmployeeName() + " rejected.");
            alert.showAndWait();
        } else {
            showSelectAlert();
        }
    }

    private void showSelectAlert() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("No Selection");
        alert.setHeaderText(null);
        alert.setContentText("Please select a request from the table first.");
        alert.showAndWait();
    }
}
//final commit//