package modulepkg.tib.common;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField emailtextfield;

    @FXML
    private PasswordField passwordtextfield;

    @FXML
    private ComboBox<String> roleComboBox;

    @FXML
    void loginbutton(ActionEvent event) throws IOException {
        String email = emailtextfield.getText();
        String password = passwordtextfield.getText();
        String selectedRole = roleComboBox.getValue();

        if (email.isEmpty() || password.isEmpty() || selectedRole == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill in all fields and select a role.");
            alert.show();
            return;
        }

        Session.email = email;
        Session.role = selectedRole;

        switch (selectedRole) {
        case "Investigation Officer":
            SceneSwitcher.switchTo("m1_sanjida_2312257/io_dashboard");
            break;
        case "Admin":
            SceneSwitcher.switchTo("m1_sanjida_2312257/ad_dashboard");
            break;


        case "Community Officer":
            SceneSwitcher.switchTo("m1_mohima_2110887/CommunityOfficerDashboard");
            break;
        case "General Public":
            SceneSwitcher.switchTo("m1_mohima_2110887/GeneralPublicdashboard");
            break;
    }

}
    @FXML
    void signupbutton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("common/signup");
    }

    @FXML
    void initialize(){
        roleComboBox.getItems().addAll("Investigation Officer","Admin",
                                            "CCC","General Public",
                                            "Monitoring Officer","Policy Analyst",
                                            "Office Inventory Manager","Finance Officer");
    }
}
