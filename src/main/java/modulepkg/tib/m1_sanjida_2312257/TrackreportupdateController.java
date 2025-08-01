package modulepkg.tib.m1_sanjida_2312257;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class TrackreportupdateController
{
    @javafx.fxml.FXML
    private TextField reportidTF;
    @javafx.fxml.FXML
    private ComboBox<String> statusCB;
    @javafx.fxml.FXML
    private Label alertlabel;
    @javafx.fxml.FXML
    private TextField descriptionTF;

    @javafx.fxml.FXML
    ArrayList<Trackreportupdate> trackreportupdatelist=new ArrayList<>();
    public void initialize() {
        statusCB.getItems().addAll("In Progress","Reviewed");
    }

    @javafx.fxml.FXML
    public void addupdateddata(ActionEvent actionEvent) {
        String reportid=reportidTF.getText();
        String description=descriptionTF.getText();
        String status=statusCB.getValue();
        Trackreportupdate update =new Trackreportupdate(reportid,description,status);
        trackreportupdatelist.add(update);
        alertlabel.setText("successfully updated data");
    }

    @javafx.fxml.FXML
    public void savedata(ActionEvent actionEvent) {
        String reportid=reportidTF.getText();
        String description=descriptionTF.getText();
        String status=statusCB.getValue();
        Trackreportupdate update =new Trackreportupdate(reportid,description,status);
        trackreportupdatelist.add(update);
        alertlabel.setText("successfully saved data");

    }
}