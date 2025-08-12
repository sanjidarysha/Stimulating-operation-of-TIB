package modulepkg.tib.m1_sanjida_2312257;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import modulepkg.tib.common.SceneSwitcher;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class AdReviewreportController {
    @javafx.fxml.FXML
    private TableColumn<AdReviewreport, String> titlecol;
    @javafx.fxml.FXML
    private TableColumn<AdReviewreport, String> idcol;
    @javafx.fxml.FXML
    private TableColumn<AdReviewreport, String> departmentcol;
    @javafx.fxml.FXML
    private TableColumn<AdReviewreport, String> statuscol;
    @javafx.fxml.FXML
    private Label alertL;
    @javafx.fxml.FXML
    private ComboBox<String> statusCB;
    @javafx.fxml.FXML
    private TableView<AdReviewreport> tableview;
    @javafx.fxml.FXML
    private TableColumn<AdReviewreport, String> dateDP;
    @javafx.fxml.FXML
    private TextField idTF;
    @javafx.fxml.FXML
    private TextField titleTF;
    @javafx.fxml.FXML
    private TextField departmentTF;
    ArrayList<AdReviewreport> reviewlist = new ArrayList<>();
    @javafx.fxml.FXML
    private DatePicker dateTF;

    public AdReviewreportController() throws IOException {
    }

    @javafx.fxml.FXML
    public void initialize() {
        statusCB.getItems().addAll("Pending", "Reviewed", "Archived");
        idcol.setCellValueFactory(new PropertyValueFactory<>("id"));
        titlecol.setCellValueFactory(new PropertyValueFactory<>("title"));
        departmentcol.setCellValueFactory(new PropertyValueFactory<>("department"));
        statuscol.setCellValueFactory(new PropertyValueFactory<>("status"));
        dateDP.setCellValueFactory(new PropertyValueFactory<>("date"));
        reviewlist.add(new AdReviewreport("ORG-001", "Annual Audit", "Finance", "Pending", LocalDate.of(2025, 12, 15)));
        reviewlist.add(new AdReviewreport("ORG-006", "IT Infrastructure Review", "IT", "Reviewed", LocalDate.of(2025, 10, 5)));
        reviewlist.add(new AdReviewreport("ORG-009", "Staff Performance Analysis", "HR", "Pending", LocalDate.of(2025, 2, 9)));
        tableview.getItems().setAll(reviewlist);
        tableview.setOnMouseClicked(mouseEvent -> {
            AdReviewreport selected = tableview.getSelectionModel().getSelectedItem();
            if (selected != null) {
                idTF.setText(selected.getId());
                titleTF.setText(selected.getTitle());
                departmentTF.setText(selected.getDepartment());
                statusCB.setValue(selected.getStatus());
                dateTF.setValue(selected.getDate());
                alertL.setText("");
            }
        });
    }

    @javafx.fxml.FXML
    public void update(ActionEvent actionEvent) throws IOException {

        AdReviewreport selected = tableview.getSelectionModel().getSelectedItem();
        if (selected != null) {
            idTF.setText(selected.getId());
            titleTF.setText(selected.getTitle());
            departmentTF.setText(selected.getDepartment());
            statusCB.setValue(selected.getStatus());
            dateTF.setValue(selected.getDate());
            alertL.setText("updated information successfully");
            return;
        }


        if (idTF.getText().isEmpty() || titleTF.getText().isEmpty() || departmentTF.getText().isEmpty() ||
                statusCB.getValue() == null | dateTF.getValue() == null) {
            alertL.setText("please fill up all required fields");
            return;
        }


        String id = idTF.getText();
        String title = titleTF.getText();
        String department = departmentTF.getText();
        String status = statusCB.getValue();
        LocalDate date = dateTF.getValue();
        AdReviewreport report = new AdReviewreport(id, title, department, status, date);
        reviewlist.add(report);
        tableview.getItems().clear();
        tableview.refresh();
        tableview.getItems().addAll(reviewlist);
        alertL.setText("updated data  succcessfully");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ad_reviewreport.bin"));
        oos.writeObject(reviewlist);
        oos.close();
        alertL.setText("unable to save data");

    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/ad_dashboard");
    }


    @javafx.fxml.FXML
    public void export(ActionEvent actionEvent) throws IOException {
        AdReviewreport selected = tableview.getSelectionModel().getSelectedItem();
        if (selected != null) {

            FileWriter writer = new FileWriter("exported archiving data.txt");
            writer.write("org id:" + idTF.getText());
            writer.write("title:"+titleTF.getText());
            writer.write("department:"+departmentTF.getText());
            writer.write("status:"+statusCB.getValue());
            writer.write("date:"+dateTF.getValue());
            writer.close();
            alertL.setText("export report for archiving");
        }


    }
}