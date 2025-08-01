package modulepkg.tib.m1_sanjida_2312257;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import modulepkg.tib.common.*;

import java.io.IOException;

public class AdDashboardController {

    @FXML
    private Label labelName;

    @FXML
    void assignCaseButton(ActionEvent event) {

    }

    @FXML
    void budgetButton(ActionEvent event) {

    }

    @FXML
    void communicateOfficerButton(ActionEvent event) {

    }

    @FXML
    void investigationReportButton(ActionEvent event) {

    }

    @FXML
    void logoutButton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("common/login");
    }

    @FXML
    void mailButton(MouseEvent event) throws IOException {
        ContactController.lastscene = "m1_sanjida_2312257/ad_dashboard";
        SceneSwitcher.switchTo("common/contact");
    }

    @FXML
    void manageAccountButton(ActionEvent event) {

    }

    @FXML
    void notificationButton(MouseEvent event) throws IOException {
        NotificationController.lastscene = "m1_sanjida_2312257/ad_dashboard";
        SceneSwitcher.switchTo("common/notification");    }

    @FXML
    void orgaizationReportButton(ActionEvent event) {

    }

    @FXML
    void profileButton(MouseEvent event) throws IOException {
        ProfileChangePassController.lastscene = "m1_sanjida_2312257/ad_dashboard";
        SceneSwitcher.switchTo("common/profile_change_password");
    }

    @FXML
    void securityButton(ActionEvent event) {

    }

    @FXML
    void systemLogsButton(ActionEvent event) {

    }

    @FXML
    public void initialize() {
        labelName.setText(Session.email);
    }


}
