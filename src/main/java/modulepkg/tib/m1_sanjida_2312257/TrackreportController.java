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

import java.io.FileWriter;
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
    private TableColumn <TrackReportModel,String>descriptionColumn;
    @javafx.fxml.FXML
    private Label label;


    @javafx.fxml.FXML
    public void initialize() {
        ArrayList<TrackReportModel> trackReportList = new ArrayList<>();
        reportidColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        trackReportList.add(new TrackReportModel("RPT-101", "Bribery in Office", "Pending"));
        trackReportList.add(new TrackReportModel("RPT-102", "Public Tender Fraud", "In Progress"));
        trackReportList.add(new TrackReportModel("RPT-103", "Illegal Funds", "Resolved"));
        reporttable.getItems().setAll(trackReportList);
        reporttable.setOnMouseClicked(e -> {
            TrackReportModel selected = reporttable.getSelectionModel().getSelectedItem();
            if (selected != null) {
                noteTA.setText(selected.getDescription());
            }
        });
    }

    @javafx.fxml.FXML
    public void Next(ActionEvent actionEvent)  throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/trackreportupdate");
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/io_dashboard");}

    @javafx.fxml.FXML
    public void update(ActionEvent actionEvent) {
        TrackReportModel selected = reporttable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            noteTA.setText(selected.getDescription());
            label.setText("updated report details secccessfully");
        }

    }
}
//  reportTable.setOnMouseClicked(e -> {
//            ReviewpreviousReportModel selected = reportTable.getSelectionModel().getSelectedItem();
//            if (selected != null) {
//                descriptionTA.setText(selected.getFullDescription());
//                label.setText("Showing details for: " + selected.getTitle());
//            }
//        });