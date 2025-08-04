package modulepkg.tib.m1_sanjida_2312257;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TrackreportupdateController {
    @FXML
    private TextField reportidTF;
    @FXML
    private ComboBox<String> statusCB;
    @FXML
    private Label alertlabel;
    @FXML
    private TextField descriptionTF;

    @FXML
    ArrayList<Trackreportupdate> trackreportupdatelist = new ArrayList<>();

    public void initialize() {
        statusCB.getItems().addAll("In Progress", "Reviewed");
    }

    @FXML
    public void addupdateddata(ActionEvent actionEvent) {
        if (reportidTF.getText().isEmpty() ||
                descriptionTF.getText().isEmpty() ||
                statusCB.getValue().isEmpty()) {
            alertlabel.setText("please fill up all the fields");
            return;
        }
        String reportid = reportidTF.getText();
        String description = descriptionTF.getText();
        String status = statusCB.getValue();
        Trackreportupdate update = new Trackreportupdate(reportid, description, status);
        alertlabel.setText("successfully updated data");

    }

    @FXML
    public void savedata(ActionEvent actionEvent){

            String reportid = reportidTF.getText();
            String description = descriptionTF.getText();
            String status = statusCB.getValue();

            if (reportid.isEmpty() || description.isEmpty() || status == null || status.isEmpty()) {
                alertlabel.setText("Please fill up all the fields.");
                return;
            }

            try (FileWriter writer = new FileWriter("Save updated data.txt", true)) {
                writer.write("Report ID: " + reportid + "\n");
                writer.write("Description: " + description + "\n");
                writer.write("Status: " + status + "\n");
                writer.write("--------------------------------------------------\n");
                writer.close();

                alertlabel.setText("Data saved and updated successfully.");
            } catch (IOException e) {
                alertlabel.setText("Failed to save data.");
            }
        }
}


