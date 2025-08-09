package modulepkg.tib.m1_sanjida_2312257;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import modulepkg.tib.common.SceneSwitcher;

import java.io.IOException;

public class ManagewitnesssavedController
{
    @javafx.fxml.FXML
    private TextArea messageTA;

    @javafx.fxml.FXML
    public void initialize() {messageTA.setText("Nasima Begum, a 29-year-old municipal clerk, witnessed a suspicious exchange between two government officials at the district office.\n While working late one evening, she saw them handing over confidential documents in an unauthorized meeting.\n Her statement includes the time, date, and detailed physical descriptions of the involved parties.\n Her observation supports the suspicion of internal document leaks in a recent corruption investigation.");
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent)  throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/managewitness");
    }

}