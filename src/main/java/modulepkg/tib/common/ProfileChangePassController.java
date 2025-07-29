package modulepkg.tib.common;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class ProfileChangePassController {

    @FXML
    private Label labName;

    @FXML
    private Label roleName;

    public static String lastscene = null;

    @FXML
    void backButton(ActionEvent event) throws IOException {
     SceneSwitcher.switchTo(lastscene);
    }

    @FXML
    void changeCurrentPasswordButton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("common/setting");

    }
    @FXML
    void initialize(){
        labName.setText(Session.email);
        roleName.setText(Session.role);
    }

}

