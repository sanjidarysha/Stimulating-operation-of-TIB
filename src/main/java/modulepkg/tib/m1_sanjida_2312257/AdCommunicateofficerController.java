package modulepkg.tib.m1_sanjida_2312257;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import modulepkg.tib.common.SceneSwitcher;

import java.io.FileWriter;
import java.io.IOException;

public class AdCommunicateofficerController
{
    @javafx.fxml.FXML
    private TextField subjectTF;
    @javafx.fxml.FXML
    private TextField toTF;
    @javafx.fxml.FXML
    private TextArea messegeTA;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private ComboBox<String> chooseCB;

    @javafx.fxml.FXML
    public void initialize() { chooseCB.getItems().addAll("NGO","Investigator","Legal","Invigilator");

    }

    @javafx.fxml.FXML
    public void send(ActionEvent actionEvent) throws IOException {
        if(chooseCB.getValue()==null||toTF.getText().isEmpty()||subjectTF.getText().isEmpty()||messegeTA.getText().isEmpty()){
            label.setText("please fill all the required field first");
            return;
        }
        String choose=chooseCB.getValue();
        String toname=toTF.getText();
        String subject=subjectTF.getText();
        String message=messegeTA.getText();
        AdCommunicateofficer communicate=new AdCommunicateofficer(choose,toname,subject,message);
        label.setText("message send successfully");
        FileWriter writer=new FileWriter("communicate Officer saved message.txt");
        writer.write("choose partner:"+chooseCB.getValue()+"\n");
        writer.write("To:"+toTF.getText()+"\n");
        writer.write("subject:"+subjectTF.getText()+"\n");
        writer.write("message:"+messegeTA.getText()+"\n");
        writer.write("...............\n");
        writer.close();
        label.setText("message saved to txt file");

        chooseCB.setValue(null);
        toTF.clear();
        subjectTF.clear();
        messegeTA.clear();
    }



    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/ad_dashboard");
    }

}