package modulepkg.tib.m1_sanjida_2312257;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import modulepkg.tib.common.*;

import java.io.IOException;

public class IoDashboardController {

    @FXML
    private Label labelName;

    @FXML
    void assignedInvestigationButton(ActionEvent event)throws IOException {

        SceneSwitcher.switchTo("m1_sanjida_2312257/submit");
    }



    @FXML
    void evidenceButton(ActionEvent event) {

    }

    @FXML
    void externatinalButton(ActionEvent event) {

    }

    @FXML
    void investigationButton(ActionEvent event) {

    }

    @FXML
    void logoutButton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("common/login");
    }

    @FXML
    void mailButton(MouseEvent event) throws IOException {
        ContactController.lastscene = "m1_sanjida_2312257/io_dashboard";
        SceneSwitcher.switchTo("common/contact");

    }

    @FXML
    void notificationButton(MouseEvent event) throws IOException {
        NotificationController.lastscene = "m1_sanjida_2312257/io_dashboard";
        SceneSwitcher.switchTo("common/notification");
    }

    @FXML
    void previousInvestigationButton(ActionEvent event) {

    }

    @FXML
    void profileButton(MouseEvent event) throws IOException {
        ProfileChangePassController.lastscene = "m1_sanjida_2312257/ad_dashboard";
        SceneSwitcher.switchTo("common/profile_change_password");
    }

    @FXML
    void publiccomplaintButton(ActionEvent event) {

    }

    @FXML
    void trackreportButton(ActionEvent event) {

    }

    @FXML
    void witnessButton(ActionEvent event) {

    }

    @FXML
    public void initialize() {
        labelName.setText(Session.email);
    }


}
