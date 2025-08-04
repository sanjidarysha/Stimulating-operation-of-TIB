package modulepkg.tib.m1_sanjida_2312257;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import modulepkg.tib.common.SceneSwitcher;
import modulepkg.tib.common.Session;

import java.io.FileWriter;
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
    private TextField toTF;

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
    public void send(ActionEvent actionEvent) throws IOException {
        String to=toTF.getText();
        String subject= subjectTF.getText();
        String message=messageTA.getText();

        if(choosepartnerCB.getValue()==null||
                toTF.getText().isEmpty()||
                subjectTF.getText().isEmpty()||
                messageTA.getText().isEmpty()
        )
        {alertlabel.setText("please fill up all the fields");
            return;
        }
        FileWriter writer=new FileWriter("ExternalCoordinationRequest.txt",true);
        writer.write("To:"+to+"\n");
        writer.write("Subject:"+subject+"\n");
        writer.write("message:"+message+"\n");
        writer.write("...................\n");
        writer.close();
        alertlabel.setText("Successfully sent message");
        toTF.clear();
        subjectTF.clear();
        messageTA.clear();
    }
}
