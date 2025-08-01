package modulepkg.tib.common;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class NotificationController {

    @FXML
    private TableColumn<Notification_Model, LocalDate> datecolumn;

    @FXML
    private Label labelName;

    @FXML
    private TableColumn<Notification_Model, String> notificationcolumn;

    @FXML
    private AnchorPane paneLog;

    @FXML
    private TableView<Notification_Model> tableview;

    @FXML
    private TableColumn<Notification_Model, LocalTime> timecolumn;

    @FXML
    private TableColumn<Notification_Model, String> typecolumn;

    public static String lastscene = null;

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
        ProfileChangePassController.lastscene = "common/notification";
        SceneSwitcher.switchTo("common/profile_change_password");
    }

    @FXML
    void initialize(){
        labelName.setText(Session.email);

        notificationcolumn.setCellValueFactory(new PropertyValueFactory<>("notification"));
        typecolumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        timecolumn.setCellValueFactory(new PropertyValueFactory<>("time"));
        datecolumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        tableview.getItems().setAll(messageList);
    }

    public static List<Notification_Model> messageList = new ArrayList<>();
    static {
        messageList.add(new Notification_Model("Meeting with Youshra", "Meeting", LocalTime.of(10,0), LocalDate.of(2025,7,10)));
        messageList.add(new Notification_Model("Submit your papers", "Notice", LocalTime.of(9,0), LocalDate.of(2025, 7, 11)));
        messageList.add(new Notification_Model("System update scheduled", "System Update", LocalTime.of(8, 30), LocalDate.of(2025, 7, 12)));
        messageList.add(new Notification_Model("Admin issue resolved", "Issue Solved", LocalTime.of(12, 45), LocalDate.of(2025, 7, 13)));
    }

    @FXML
    public void backButton(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo(lastscene);


    }
}