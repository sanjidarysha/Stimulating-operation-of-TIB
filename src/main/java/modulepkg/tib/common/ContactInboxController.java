package modulepkg.tib.common;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class ContactInboxController {

    @FXML
    private TextArea inboxmessagetextarea;

    @FXML
    private Label labelName;

    @FXML
    private TextField subjectinboxtextfield;

    @FXML
    void backarrow(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("common/contact_compose");

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
        ProfileChangePassController.lastscene = "common/contact_inbox";
        SceneSwitcher.switchTo("common/profile_change_password");
    }

    @FXML
    void replybutton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("common/contact_compose");

    }

    @FXML
    void initialize(){
        labelName.setText(Session.email);
    }

}
