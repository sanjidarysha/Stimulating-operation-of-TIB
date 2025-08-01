package modulepkg.tib.common;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class ContactComposeController {

    @FXML
    private TextField fieldTo;

    @FXML
    private TextField fieldsubject;

    @FXML
    private Label labFile;

    @FXML
    private Label labelName;

    @FXML
    private TextArea textarea;


    @FXML
    public void backButton(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("common/contact");
    }

    @FXML
    void logoutButton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("common/login");

    }

    @FXML
    void mailButton(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("common/contact");

    }

    @FXML
    void notificationButton(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("common/notification");

    }

    @FXML
    void profileButton(MouseEvent event) throws IOException {
        ProfileChangePassController.lastscene = "common/contact_compose";
        SceneSwitcher.switchTo("common/profile_change_password");
    }

    @FXML
    void sendButton(ActionEvent event) {

    }

    @FXML
    void viewinboxButton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("common/contact_inbox");

    }

    @FXML
    void initialize(){
        labelName.setText(Session.email);
    }

}
