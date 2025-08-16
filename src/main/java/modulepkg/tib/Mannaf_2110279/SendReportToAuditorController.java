package modulepkg.tib.Mannaf_2110279;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SendReportToAuditorController {

    @FXML
    private ListView<String> selectreportLV;
    @FXML
    private TextArea addmessegeTA;
    @FXML
    private ComboBox<String> reporttypeCB;
    @FXML
    private DatePicker sendDateDP;

    private List<AuditReport> sentReports = new ArrayList<>();

    @FXML
    public void initialize() {
        selectreportLV.getItems().addAll(
                "Monthly Financial Report",
                "Inventory Report",
                "Staff Attendance Report",
                "Compliance Summary"
        );

        reporttypeCB.getItems().addAll(
                "Financial",
                "Operational",
                "HR",
                "Compliance"
        );

        // Pre-fill sample values
        selectreportLV.getSelectionModel().selectFirst();
        reporttypeCB.getSelectionModel().selectFirst();
        addmessegeTA.setText("Please review the attached report carefully.");
        sendDateDP.setValue(LocalDate.now());
    }

    @FXML
    public void sendOA(ActionEvent actionEvent) {
        String selectedReport = selectreportLV.getSelectionModel().getSelectedItem();
        String message = addmessegeTA.getText();
        String reportType = reporttypeCB.getSelectionModel().getSelectedItem();
        LocalDate sendDate = sendDateDP.getValue();

        AuditReport report = new AuditReport(selectedReport, message, reportType, sendDate);
        sentReports.add(report);

        System.out.println("Report Sent: " + report);
    }
}
