package modulepkg.tib.m1_sanjida_2312257;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import modulepkg.tib.common.SceneSwitcher;
import modulepkg.tib.common.Session;

import java.io.IOException;

public class CollaborateexternalController
{
    @javafx.fxml.FXML
    private TextField subjectTF;
    @javafx.fxml.FXML
    private ComboBox<String> choosepartnerCB;
    @javafx.fxml.FXML
    private TextArea messageTA;
    @javafx.fxml.FXML
    private TextField Labname;
    @javafx.fxml.FXML
    private Label alertlabel;

    @javafx.fxml.FXML
    public void initialize() {
        choosepartnerCB.getItems().addAll("NGO","media","legal");
        Labname.setText(Session.email);
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent)  throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/io_dashboard");

    }

    @javafx.fxml.FXML
    public void send(ActionEvent actionEvent) {
        if(choosepartnerCB.getValue()==null||
                subjectTF.getText().isEmpty()||
                messageTA.getText().isEmpty()
        )
        {alertlabel.setText("please fill up choosepartner,subject and message text box");
            return;
        }
        String choosepartner=choosepartnerCB.getValue();
        String subject=subjectTF.getText();
        String message=messageTA.getText();
        CollaborateExternalModel add=new CollaborateExternalModel(choosepartner,subject,message);
        alertlabel.setText("Successfully sent message");
    }
}