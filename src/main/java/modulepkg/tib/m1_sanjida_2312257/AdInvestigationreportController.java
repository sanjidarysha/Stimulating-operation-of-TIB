package modulepkg.tib.m1_sanjida_2312257;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import modulepkg.tib.common.SceneSwitcher;

import java.io.IOException;
import java.util.ArrayList;

public class AdInvestigationreportController
{
    @javafx.fxml.FXML
    private Label warningL;
    @javafx.fxml.FXML
    private TableColumn<AdInvestigationReport,String> descCol;
    @javafx.fxml.FXML
    private TableColumn <AdInvestigationReport,String>statusCol;
    @javafx.fxml.FXML
    private TableView <AdInvestigationReport>reportTableView;
    @javafx.fxml.FXML
    private TableColumn<AdInvestigationReport,String>IdCol;
    @javafx.fxml.FXML
    private TextArea descTA;
    @javafx.fxml.FXML
    private TableColumn <AdInvestigationReport,String>officerCol;
    ArrayList<AdInvestigationReport>reportList=new ArrayList<>();
    @javafx.fxml.FXML
    public void initialize() {
        IdCol.setCellValueFactory(new PropertyValueFactory<>("reportid"));
        officerCol.setCellValueFactory(new PropertyValueFactory<>("officer"));
        descCol.setCellValueFactory(new PropertyValueFactory<>("desc"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        reportList.add(new AdInvestigationReport("REP-001", "Rohima", "Hospital Equipment Fraud", "Pending"));
        reportList.add(new AdInvestigationReport("REP-002", "Mohima", " School Bribary ", "Progress"));
        reportTableView.getItems().setAll(reportList);
        reportTableView.refresh();
        reportTableView.setOnMouseClicked(mouseEvent -> {
            AdInvestigationReport Selected=reportTableView.getSelectionModel().getSelectedItem();
            if(Selected!=null){
                descTA.setText(Selected.getDesc());
                warningL.setText("");
            }
        });
    }
    @javafx.fxml.FXML
    public void Approve(ActionEvent actionEvent) {
        AdInvestigationReport Selected=reportTableView.getSelectionModel().getSelectedItem();
        if(Selected!=null){
            reportTableView.refresh();
            descTA.setText(Selected.getDesc());
            warningL.setText("Report Approved");
        }
        else {}
    }

    @javafx.fxml.FXML
    public void Reject(ActionEvent actionEvent) {
        AdInvestigationReport Selected=reportTableView.getSelectionModel().getSelectedItem();
        if(Selected!=null){
            reportTableView.refresh();
            descTA.setText(Selected.getDesc());
            warningL.setText("Report Rejected");
        }
        else {warningL.setText("please select a report");}
    }

    @javafx.fxml.FXML
    public void ViewPreviousReport(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/reviewpreviousReport");
    }

    @javafx.fxml.FXML
    public void Next(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/ad_assigncases");
    }


    @javafx.fxml.FXML
    public void Back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/ad_dashboard");
    }

}