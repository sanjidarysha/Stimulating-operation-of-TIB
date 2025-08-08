package modulepkg.tib.m1_sanjida_2312257;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import modulepkg.tib.common.SceneSwitcher;

import java.io.IOException;
import java.util.ArrayList;

public class AdAssigncasesController
{
    @FXML
    private TableColumn <AdAssignCases,String>titleCol;
    @FXML
    private TableColumn <AdAssignCases,String>statusCol;
    @FXML
    private TableColumn <AdAssignCases,String>caseIdCol;
    @FXML
    private TextField officerTF;
    @FXML
    private TableView<AdAssignCases> assignTableView;
    @FXML
    private Label label;
    @FXML
    private TableColumn <AdAssignCases,String>officerCol;
    ArrayList<AdAssignCases>caselist=new ArrayList<>();

    @FXML
    public void initialize() {
        caseIdCol.setCellValueFactory(new PropertyValueFactory<>("caseid"));
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        officerCol.setCellValueFactory(new PropertyValueFactory<>("officer"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        caselist.add(new AdAssignCases("C1002", "Corruption in road tender","Rysha","pending"));
        caselist.add(new AdAssignCases("C3005", "Illegal Funding by NGO","Toslim","pending"));
        caselist.add(new AdAssignCases("C1005", "Bribery in Health Sector","pias","pending"));
        assignTableView.getItems().setAll(caselist);
        assignTableView.setOnMouseClicked(mouseEvent -> {
            AdAssignCases selected=assignTableView.getSelectionModel().getSelectedItem();
            if(selected!=null){
                officerTF.setText(selected.getOfficer());
                selected.setStatus("Assigned");
                assignTableView.refresh();
            }});
    }

    @FXML
    public void assign(ActionEvent actionEvent) {
        AdAssignCases selected=assignTableView.getSelectionModel().getSelectedItem();
        String officerName = officerTF.getText().trim();;
        if(selected!=null){
            officerTF.setText(selected.getOfficer());
            selected.setStatus("Assigned");
            assignTableView.refresh();
            label.setText(" Assigned to Officer: " + officerName);
        }
        else{
            label.setText("Please select a case and enter an officer name.");
            }

    }

    @FXML
    public void next(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/ad_reviewreport");
    }

    @FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/ad_dashboard");
    }


}