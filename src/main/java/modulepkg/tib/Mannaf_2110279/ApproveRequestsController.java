package modulepkg.tib.Mannaf_2110279;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

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

    private ObservableList<StaffRequest> staffRequestList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        staffRequestList.addAll(
                new StaffRequest("Rahim", "Notebook", 5, LocalDate.now().minusDays(2)),
                new StaffRequest("Karima", "Pen", 10, LocalDate.now().minusDays(1)),
                new StaffRequest("Sumi", "Marker", 3, LocalDate.now())
        );

        staffReqTV.setItems(staffRequestList);
    }

    @FXML
    public void approveOA(ActionEvent actionEvent) {
        StaffRequest selected = staffReqTV.getSelectionModel().getSelectedItem();
        if (selected != null) {
            staffRequestList.remove(selected);
            commentsTA.clear();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Approved");
            alert.setHeaderText(null);
            alert.setContentText("Request of " + selected.getEmployeeName() + " approved.");
            alert.showAndWait();
        }
    }

    @FXML
    public void rejectOA(ActionEvent actionEvent) {
        StaffRequest selected = staffReqTV.getSelectionModel().getSelectedItem();
        if (selected != null) {
            staffRequestList.remove(selected);
            commentsTA.clear();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Rejected");
            alert.setHeaderText(null);
            alert.setContentText("Request of " + selected.getEmployeeName() + " rejected.");
            alert.showAndWait();
        }
    }
}
