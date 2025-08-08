package modulepkg.tib.m1_sanjida_2312257;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import modulepkg.tib.common.SceneSwitcher;

import java.io.IOException;
import java.util.ArrayList;

public class AdmanageaccountController {
    @javafx.fxml.FXML
    private TableColumn<AdManageAccount, String> usernameCol;
    @javafx.fxml.FXML
    private TextField usernameTF;
    @javafx.fxml.FXML
    private ComboBox<String> roleCB;
    @javafx.fxml.FXML
    private TableView<AdManageAccount> manageTableView;
    @javafx.fxml.FXML
    private TableColumn<AdManageAccount, String> statusCol;
    @javafx.fxml.FXML
    private ComboBox<String> statusCB;
    @javafx.fxml.FXML
    private TableColumn<AdManageAccount, String> roleCol;
    @javafx.fxml.FXML
    private Label label;
    ArrayList<AdManageAccount> manageList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        roleCB.getItems().addAll(" Investigation officer ", "Admin");
        statusCB.getItems().addAll("Inactive", "Active");
        usernameCol.setCellValueFactory(new PropertyValueFactory<>("username"));
        roleCol.setCellValueFactory(new PropertyValueFactory<>("role"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        manageList.add(new AdManageAccount("Rysha", "Investigation officer", "Active"));
        manageList.add(new AdManageAccount("Sumaiya", "Admin", "Active"));
        manageList.add(new AdManageAccount("Toslim", "Investigation officer", "InActive"));
        manageTableView.getItems().setAll(manageList);

        manageTableView.setOnMouseClicked(mouseEvent -> {
            AdManageAccount selected = manageTableView.getSelectionModel().getSelectedItem();
            if (selected != null) {
                usernameTF.setText(selected.getUsername());
                roleCB.setValue(selected.getRole());
                statusCB.setValue(selected.getStatus());
                manageTableView.refresh();
                label.setText("");
            }
        });
    }

    @javafx.fxml.FXML
    public void update(ActionEvent actionEvent) {
        AdManageAccount selected = manageTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            usernameTF.setText(selected.getUsername());
            roleCB.setValue(selected.getRole());
            statusCB.setValue(selected.getStatus());
            manageTableView.refresh();
            label.setText("Edit user:" + selected.getUsername());
        } else {
            label.setText("please select a user to update");
        }
    }

    @javafx.fxml.FXML
    public void next(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/ad_investigationreport");
    }


    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/ad_dashboard");
    }

}