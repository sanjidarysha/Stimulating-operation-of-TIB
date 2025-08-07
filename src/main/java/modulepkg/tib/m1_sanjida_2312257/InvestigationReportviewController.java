package modulepkg.tib.m1_sanjida_2312257;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.util.ArrayList;

public class InvestigationReportviewController
{
    @javafx.fxml.FXML
    private TextArea descriptionArea;
    @javafx.fxml.FXML
    private Label alertLabel;
    @javafx.fxml.FXML
    private TextField usernameTF;
    @javafx.fxml.FXML
    private TextField idTF;
    @javafx.fxml.FXML
    private ComboBox<String> locationCB;
    @javafx.fxml.FXML
    private TextField involvedTF;
    ArrayList<InvestigationReportModel>investigationReportModelArrayList=new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        locationCB.getItems().addAll("Dhaka","chittagong","Khulna","Rangpur","Noakhali");

    }

    @javafx.fxml.FXML
    public void submit(ActionEvent actionEvent) {
        if(usernameTF.getText().isEmpty()||
                idTF.getText().isEmpty()||
                locationCB.getValue()==null||
                involvedTF.getText().isEmpty()||
                descriptionArea.getText().isEmpty())
        {alertLabel.setText("please fill up properly");
            return;}

        String username=usernameTF.getText();
        String id=usernameTF.getText();
        String location=locationCB.getValue();
        String involved=involvedTF.getText();
        String description=descriptionArea.getText();


        InvestigationReportModel report= new InvestigationReportModel(username,id,location,involved,description);
        investigationReportModelArrayList.add(report);
        alertLabel.setText("successfully submitted");

    }

    }