package modulepkg.tib.m1_sanjida_2312257;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class InvestigationReportviewController
{
    @javafx.fxml.FXML
    private TextField locationTF;
    @javafx.fxml.FXML
    private TextArea descriptionArea;
    @javafx.fxml.FXML
    private TextField reportidTF;
    @javafx.fxml.FXML
    private Label alertLabel;
    @javafx.fxml.FXML
    private TextField involvedpeopleTF;

    @javafx.fxml.FXML
    public void initialize() {
        assert alertLabel != null ;
        assert descriptionArea != null ;
        assert involvedpeopleTF != null ;
        assert locationTF != null ;
        assert reportidTF != null ;

    }

    @javafx.fxml.FXML
    public void submit(ActionEvent actionEvent) {
        String id = reportidTF.getText().trim();
        String description = descriptionArea.getText().trim();
        String peopleCSV = involvedpeopleTF.getText().trim();
        String location = locationTF.getText().trim();

        InvestigationReportModel report = new InvestigationReportModel(id, description, peopleCSV, location);

        if (report.submitReport()) {
            report.confirmSubmission();

            // Show popup
            alertLabel.setText("Your investigation report has been submitted successfully.");}
        else {
            alertLabel.setText("⚠ Please fill in all fields correctly.");

    }
}}