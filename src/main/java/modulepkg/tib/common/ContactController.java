package modulepkg.tib.common;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContactController {

    @FXML
    private TableColumn<Contact_Model, LocalDate> dateColumn;

    @FXML
    private DatePicker filterDatePicker;

    @FXML
    private TableColumn<Contact_Model, String> fromColumn;

    @FXML
    private TableColumn<Contact_Model, String> messageColumn;

    @FXML
    private TableColumn<Contact_Model, String> subjectColumn;

    @FXML
    private TableView<Contact_Model> tableView;
    @FXML
    private Label labelName;

    public static String lastscene = null;

    @FXML
    void ComposeButton(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("common/contact_compose");

    }

    @FXML
    void backButton(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo(lastscene);    }

    @FXML
    void filterButton(ActionEvent event) {
        LocalDate selectedDate = filterDatePicker.getValue();

        if (selectedDate == null) {
            tableView.getItems().setAll(messageList);
            return;
        }
        List<Contact_Model> filteredList = new ArrayList<>();
        for (Contact_Model cm : messageList) {
            if (selectedDate.equals(cm.getDate())) {
                filteredList.add(cm);
            }
        }
        tableView.getItems().setAll(filteredList);
    }

    @FXML
    void logOutButton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("common/login");

    }

    @FXML
    void mailButton(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("common/contact");

    }

    @FXML
    void noificationButton(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("common/notification");

    }

    @FXML
    void profileButton(MouseEvent event) throws IOException {
        ProfileChangePassController.lastscene = "common/contact";
        SceneSwitcher.switchTo("common/profile_change_password");
    }
    @FXML
    public void initialize() {
        labelName.setText(Session.email);

        fromColumn.setCellValueFactory(new PropertyValueFactory<>("from"));
        subjectColumn.setCellValueFactory(new PropertyValueFactory<>("subject"));
        messageColumn.setCellValueFactory(new PropertyValueFactory<>("message"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        tableView.getItems().setAll(messageList);
    }

    public static List<Contact_Model> messageList = new ArrayList<>();
    static {
        messageList.add(new Contact_Model("Youshra", "Regarding leave from work.", "Feeling unwell from overtime.", LocalDate.of(2025,7,10)));
        messageList.add(new Contact_Model("Ramisa", "Regarding new investigation.", "Investigation will start tomorrow.", LocalDate.of(2025, 7, 11)));
        messageList.add(new Contact_Model("Support", "Regarding update system with new software.", "Please update your pc with the latest windows.", LocalDate.of(2025, 7, 12)));
        messageList.add(new Contact_Model("HR", "Regarding disciplinary routine.", "New routine issued.", LocalDate.of(2025, 7, 13)));
    }

}
