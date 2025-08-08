package modulepkg.tib.m1_sanjida_2312257;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import modulepkg.tib.common.SceneSwitcher;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AdReviewreportController
{
    @javafx.fxml.FXML
    private DatePicker dateTF;
    @javafx.fxml.FXML
    private TableColumn <AdReviewreport,String>titlecol;
    @javafx.fxml.FXML
    private TableColumn  <AdReviewreport,String>idcol;
    @javafx.fxml.FXML
    private TableColumn  <AdReviewreport,String>departmentcol;
    @javafx.fxml.FXML
    private TableColumn  <AdReviewreport,String>statuscol;
    @javafx.fxml.FXML
    private Label alertL;
    @javafx.fxml.FXML
    private ComboBox <String> statusCB;
    @javafx.fxml.FXML
    private TableView  <AdReviewreport>tableview;
    @javafx.fxml.FXML
    private TableColumn <AdReviewreport,String>dateDP;
    @javafx.fxml.FXML
    private TextField idTF;
    @javafx.fxml.FXML
    private TextField titleTF;
    @javafx.fxml.FXML
    private TextField departmentTF;
    ArrayList<AdReviewreport>reviewlist=new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        statusCB.getItems().addAll("Pending", "Reviewed", "Archived");
        idcol.setCellValueFactory(new PropertyValueFactory<>("id"));
        titlecol.setCellValueFactory(new PropertyValueFactory<>("title"));
        departmentcol.setCellValueFactory(new PropertyValueFactory<>("department"));
        statuscol.setCellValueFactory(new PropertyValueFactory<>("status"));
        dateDP.setCellValueFactory(new PropertyValueFactory<>("date"));
        reviewlist.add(new AdReviewreport("ORG-001","Annual Audit","Finance","Pending", LocalDate.of(2025, 12, 15)));
        reviewlist.add(new AdReviewreport("ORG-006","IT Infrastructure Review","IT","Reviewed", LocalDate.of(2025, 10, 5)));
        reviewlist.add(new AdReviewreport("ORG-009","Staff Performance Analysis","HR","Pending", LocalDate.of(2025, 2, 9)));
        tableview.getItems().setAll(reviewlist);
        tableview.refresh();
    }

    @javafx.fxml.FXML
    public void next(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/ad_monitorlog");
    }


    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/ad_dashboard");
    }

    @javafx.fxml.FXML
    public void update(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void export(ActionEvent actionEvent) {
    }
}