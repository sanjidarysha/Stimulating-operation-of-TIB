package modulepkg.tib.m1_sanjida_2312257;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import modulepkg.tib.common.SceneSwitcher;

import java.io.IOException;

public class CollaborateexternalController
{
    @javafx.fxml.FXML
    private TextField subjectTF;
    @javafx.fxml.FXML
    private ComboBox choosepartnerCB;
    @javafx.fxml.FXML
    private TextArea messageTA;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent)  throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/io_dashboard");

    }


    @javafx.fxml.FXML
    public void send(ActionEvent actionEvent) {
    }
}