package modulepkg.tib.m1_sanjida_2312257;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import modulepkg.tib.HelloApplication;
import modulepkg.tib.common.*;

import java.io.IOException;

public class IoDashboardController {

    @FXML
    private Label labelName;

    @FXML
    void assignedInvestigationButton(ActionEvent event)throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/assignedinvestigation");
    }



    @FXML
    void evidenceButton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/maintainevidence");
    }

    @FXML
    void externatinalButton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/collaborateexternal");

    }


    @FXML
    void investigationButton(ActionEvent actionEvent)  throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/investigation_reportview");

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
    void publiccomplaintButton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/reviewpubliccomplaint");

    }

    @FXML
    void trackreportButton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/trackreport");

    }


    @FXML
    void witnessButton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/managewitness");
    }


    @FXML
    public void initialize() {
        labelName.setText(Session.email);
    }


}
