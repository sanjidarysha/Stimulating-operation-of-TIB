package modulepkg.tib.m1_sanjida_2312257;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import modulepkg.tib.common.SceneSwitcher;

import java.io.IOException;
import java.util.ArrayList;

public class TrackreportController
{
    @javafx.fxml.FXML
    private TableColumn <TrackReportModel,String>statusColumn;
    @javafx.fxml.FXML
    private TableView<TrackReportModel> reporttable;
    @javafx.fxml.FXML
    private TextArea noteTA;
    @javafx.fxml.FXML
    private TableColumn<TrackReportModel,String> reportidColumn;
    @javafx.fxml.FXML
    private Label alertlabel;
    @javafx.fxml.FXML
    private TableColumn <TrackReportModel,String>descriptionColumn;


    @javafx.fxml.FXML
    public void initialize() {
        ObservableList<TrackReportModel> trackReportModelList = FXCollections.observableArrayList();
        reportidColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        trackReportModelList.add(new TrackReportModel("RPT-101", "Bribery in Office", "Pending"));
        trackReportModelList.add(new TrackReportModel("RPT-102", "Public Tender Fraud", "In Progress"));
        trackReportModelList.add(new TrackReportModel("RPT-103", "Illegal Funds", "Resolved"));
        reporttable.setItems(trackReportModelList);


    }

    @javafx.fxml.FXML
    public void updatenote(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/trackreportupdate");
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/io_dashboard");}

}