package modulepkg.tib.Mannaf_2110279;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class ApproveSampleRequestsController {

    @FXML
    private TableView<SampleRequest> detailTV;
    @FXML
    private TableColumn<SampleRequest, String> nameColumn;
    @FXML
    private TableColumn<SampleRequest, String> itemColumn;
    @FXML
    private TableColumn<SampleRequest, String> reasonColumn;
    @FXML
    private TableColumn<SampleRequest, Integer> quantityColumn;
    @FXML
    private TableColumn<SampleRequest, LocalDate> requestDateColumn;
    @FXML
    private ListView<String> pendingSamplereqLV;
    @FXML
    private TextArea noteTA;

    private ObservableList<SampleRequest> sampleList = FXCollections.observableArrayList();
    private ObservableList<String> pendingList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        sampleList.addAll(
                new SampleRequest("Rahim", "Notebook", "Testing paper quality", 5, LocalDate.now().minusDays(2)),
                new SampleRequest("Karima", "Pen", "Check ink flow", 10, LocalDate.now().minusDays(1)),
                new SampleRequest("Sumi", "Marker", "Check color accuracy", 3, LocalDate.now())
        );

        pendingList.addAll(
                "Sample Request by Rahim",
                "Sample Request by Karima",
                "Sample Request by Sumi"
        );

        pendingSamplereqLV.setItems(pendingList);
        detailTV.setItems(sampleList);
    }

    @FXML
    public void approveOA(ActionEvent actionEvent) {
        SampleRequest selected = detailTV.getSelectionModel().getSelectedItem();
        if (selected != null) {
            sampleList.remove(selected);
            pendingList.remove("Sample Request by " + selected.getName());
            noteTA.clear();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Approved");
            alert.setHeaderText(null);
            alert.setContentText("Sample request of " + selected.getName() + " approved.");
            alert.showAndWait();
        }
    }

    @FXML
    public void rejectOA(ActionEvent actionEvent) {
        SampleRequest selected = detailTV.getSelectionModel().getSelectedItem();
        if (selected != null) {
            sampleList.remove(selected);
            pendingList.remove("Sample Request by " + selected.getName());
            noteTA.clear();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Rejected");
            alert.setHeaderText(null);
            alert.setContentText("Sample request of " + selected.getName() + " rejected.");
            alert.showAndWait();
        }
    }
}
