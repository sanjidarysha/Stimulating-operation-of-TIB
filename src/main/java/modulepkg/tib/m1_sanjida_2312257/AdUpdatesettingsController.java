package modulepkg.tib.m1_sanjida_2312257;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import modulepkg.tib.common.SceneSwitcher;

import java.io.FileWriter;
import java.io.IOException;

public class AdUpdatesettingsController
{
    @javafx.fxml.FXML
    private PasswordField newP;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private PasswordField confirmP;
    @javafx.fxml.FXML
    private PasswordField currentP;


    @javafx.fxml.FXML
    public void Save(ActionEvent actionEvent) throws IOException {
        FileWriter writer=new FileWriter("save password.txt");
        writer.write("current password:"+currentP.getText()+"\n");
        writer.write("new password:"+newP.getText()+"\n");
        writer.write("confirm password:"+confirmP.getText()+"\n");
        writer.write(".............");
        writer.close();
        label.setText("file saved");
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/io_dashboard");
    }

    @javafx.fxml.FXML
    public void add(ActionEvent actionEvent) throws IOException {
        if(currentP.getText().isEmpty()||newP.getText().isEmpty()||confirmP.getText().isEmpty()){
            label.setText("password empty");
            return;
        }
        if(newP.getLength()<6 ){
            label.setText(" New password must be at least 6 characters");
            return;
        }
        if(confirmP.getLength()!=newP.getLength()){
            label.setText("Invalid password");
            return;
        }
        String currentp=currentP.getText();
        String newp= newP.getText();
        String confirmp= confirmP.getText();
        AdUpdatesettings settings=new AdUpdatesettings(currentp,newp,confirmp);
        label.setText("password changed");

    }

}