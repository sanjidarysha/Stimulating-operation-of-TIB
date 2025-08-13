package modulepkg.tib.m1_sanjida_2312257;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import modulepkg.tib.common.SceneSwitcher;

import java.io.IOException;
import java.util.ArrayList;

public class MaintainevidenceController
{
    @javafx.fxml.FXML
    private TableColumn<MaintainEvidenceModel,String> handlingOfficernameColumn;
    @javafx.fxml.FXML
    private TableColumn<MaintainEvidenceModel,String> statusColumn;
    @javafx.fxml.FXML
    private TableColumn <MaintainEvidenceModel,String>evidenceIdColumn;
    @javafx.fxml.FXML
    private TableColumn <MaintainEvidenceModel,String>handlingIdColumn;
    @javafx.fxml.FXML
    private TableColumn <MaintainEvidenceModel,String>itemColumn;
    @javafx.fxml.FXML
    private TableView <MaintainEvidenceModel>evidenceTableView;

    @javafx.fxml.FXML
    private Label alertlabel;
    ArrayList<MaintainEvidenceModel>maintainEvidenceModelArrayList=new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        itemColumn.setCellValueFactory(new PropertyValueFactory<>("item"));
        evidenceIdColumn.setCellValueFactory(new PropertyValueFactory<>("evidenceid"));
        handlingOfficernameColumn.setCellValueFactory(new PropertyValueFactory<>("officername"));
        handlingIdColumn.setCellValueFactory(new PropertyValueFactory<>("officerid"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        maintainEvidenceModelArrayList.add(new MaintainEvidenceModel("EV-001", "Bribe Money", "Officer Reza", "Sealed in locker #12", "Secured"));
        maintainEvidenceModelArrayList.add(new MaintainEvidenceModel("EV-002", "Laptop with documents", "Officer Tania", "Encrypted and sealed", "Under Review"));
        maintainEvidenceModelArrayList.add(new MaintainEvidenceModel("EV-003", "Audio Recording", "Officer Hossain", "Submitted to forensic lab", "Processing"));
        evidenceTableView.getItems().setAll(maintainEvidenceModelArrayList);


    }

    @javafx.fxml.FXML
    public void updatestatus(ActionEvent actionEvent) {
        alertlabel.setText("updated all data in tableview");
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent)  throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/io_dashboard");
    }
}