package modulepkg.tib.Mannaf_2110279;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

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

    private ObservableList<SampleRequest> sampleRequestList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        itemColumn.setCellValueFactory(new PropertyValueFactory<>("item"));
        reasonColumn.setCellValueFactory(new PropertyValueFactory<>("reason"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        requestDateColumn.setCellValueFactory(new PropertyValueFactory<>("requestDate"));

        sampleRequestList.add(new SampleRequest("Alice", "Notebook", "Research", 5, LocalDate.now(), "", "Pending"));
        sampleRequestList.add(new SampleRequest("Bob", "Pen", "Project", 10, LocalDate.now(), "", "Pending"));

        detailTV.setItems(sampleRequestList);

        pendingSamplereqLV.getItems().addAll("Alice", "Bob");
    }

    @FXML
    public void approveOA(ActionEvent actionEvent) {
        SampleRequest selected = detailTV.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatus("Approved");
            selected.setNote(noteTA.getText());
            detailTV.refresh();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Approved");
            alert.setHeaderText(null);
            alert.setContentText("Sample request by " + selected.getName() + " approved.");
            alert.showAndWait();
        } else {
            showSelectAlert();
        }
    }

    @FXML
    public void rejectOA(ActionEvent actionEvent) {
        SampleRequest selected = detailTV.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatus("Rejected");
            selected.setNote(noteTA.getText());
            detailTV.refresh();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Rejected");
            alert.setHeaderText(null);
            alert.setContentText("Sample request by " + selected.getName() + " rejected.");
            alert.showAndWait();
        } else {
            showSelectAlert();
        }
    }

    private void showSelectAlert() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("No Selection");
        alert.setHeaderText(null);
        alert.setContentText("Please select a sample request from the table first.");
        alert.showAndWait();
    }
}
