package modulepkg.tib.m1_sanjida_2312257;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import modulepkg.tib.common.SceneSwitcher;

import java.io.IOException;
import java.time.LocalDate;

public class ReviewpreviousReportController
{
    @javafx.fxml.FXML
    private TableView <ReviewpreviousReportModel>reportTable;
    @javafx.fxml.FXML
    private TableColumn <ReviewpreviousReportModel,String>officerColumn;
    @javafx.fxml.FXML
    private TableColumn <ReviewpreviousReportModel,String>titleColumn;
    @javafx.fxml.FXML
    private TableColumn <ReviewpreviousReportModel,String>statusColumn;
    @javafx.fxml.FXML
    private TableColumn <ReviewpreviousReportModel,String>dateColumn;
    @javafx.fxml.FXML
    private TextArea descriptionTA;
    @javafx.fxml.FXML
    private TableColumn <ReviewpreviousReportModel,String>idColumn;
    @javafx.fxml.FXML
    private TableColumn <ReviewpreviousReportModel,String>descriptionColumn;
    ObservableList<ReviewpreviousReportModel>reportList  = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("reportId"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        officerColumn.setCellValueFactory(new PropertyValueFactory<>("officer"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("fullDescription"));

        reportList.addAll(
                new ReviewpreviousReportModel("RPT-001", "School Bribery", "Sadia Akter", "Resolved", LocalDate.of(2024, 11, 10),
                        "Bribery case involving misuse of school renovation funds by local officials."),
                new ReviewpreviousReportModel("RPT-002", "Tender Scam", "Rahim Uddin", "Closed", LocalDate.of(2024, 12, 5),
                        "Scam related to manipulated public tender bidding by contractors."),
                new ReviewpreviousReportModel("RPT-003", "Hospital Equipment Fraud", "Nasima Begum", "In Progress", LocalDate.of(2025, 1, 18),
                "False invoices submitted for medical equipment purchases under the national health fund."),
                new ReviewpreviousReportModel("RPT-004", "Road Construction Delay", "Jamal Hossain", "Pending", LocalDate.of(2025, 2, 12),
                        "Investigating delay in major highway project due to suspected bribery."));
        reportTable.setItems(reportList);
        reportTable.setOnMouseClicked(e -> {
            ReviewpreviousReportModel selected = reportTable.getSelectionModel().getSelectedItem();
            if (selected != null) {
                descriptionTA.setText(selected.getFullDescription());
            }
        });

    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/io_dashboard");
    }

}