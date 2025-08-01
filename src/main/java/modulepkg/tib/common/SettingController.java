package modulepkg.tib.common;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import java.io.IOException;

public class SettingController {

    @FXML
    private PasswordField ConfirmPasswordTextField;

    @FXML
    private PasswordField CurrentPasswordTextField;

    @FXML
    private PasswordField NewPasswordTextField;

    @FXML
    private Label labWarning;

    @FXML
    private Label labelName;

    @FXML
    private Label labelName2;

    @FXML
    private AnchorPane paneLog;

    @FXML
    private AnchorPane paneSide;

    @FXML
    public void backButton(MouseEvent event) throws IOException {
      SceneSwitcher.switchTo("common/profile_change_password");
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
     SceneSwitcher.switchTo("common/profile_change_password");
    }

    @FXML
    void saveClick(MouseEvent event) {
        String currentPassword = CurrentPasswordTextField.getText();
        String newPassword = NewPasswordTextField.getText();
        String confirmPassword = ConfirmPasswordTextField.getText();

        if (currentPassword.isEmpty() || newPassword.isEmpty() || confirmPassword.isEmpty()) {
            labWarning.setText(" Please fill all the fields.");
            labWarning.setTextFill(Color.RED);
            labWarning.setStyle("-fx-border-color: red");
            labWarning.setVisible(true);
            return;
        }

        if (!newPassword.equals(confirmPassword)) {
            labWarning.setText(" Passwords do not match.");
            labWarning.setTextFill(Color.RED);
            labWarning.setStyle("-fx-border-color: red");
            labWarning.setVisible(true);
            return;
        }

        System.out.println("Previous Password: " + currentPassword);
        System.out.println("New Password: " + newPassword);
        labWarning.setText(" Password updated successfully.");
        labWarning.setTextFill(Color.GREEN);
        labWarning.setStyle("-fx-border-color: green");
        labWarning.setVisible(true);

    }
    @FXML
    void initialize(){
        labelName.setText(Session.email);
        labelName2.setText(Session.email);
    }


}
