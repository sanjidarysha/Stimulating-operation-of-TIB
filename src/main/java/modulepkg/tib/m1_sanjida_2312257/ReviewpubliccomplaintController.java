package modulepkg.tib.m1_sanjida_2312257;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import modulepkg.tib.common.SceneSwitcher;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReviewpubliccomplaintController
{
    @javafx.fxml.FXML
    private TableColumn detailsColumn;
    @javafx.fxml.FXML
    private TableColumn nameColumn;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private TableView complainTableView;
    @javafx.fxml.FXML
    private TableColumn regionColumn;
    @javafx.fxml.FXML
    private TextField regionTF;
    @javafx.fxml.FXML
    private TextField keywordTF;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private TableColumn keywordColumn;
    @javafx.fxml.FXML
    private TableColumn dateColumn;
    ObservableList<ReviewPublicComplaint>reviewPublicComplaintArrayList = FXCollections.observableArrayList();
    public void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        detailsColumn.setCellValueFactory(new PropertyValueFactory<>("details"));
        regionColumn.setCellValueFactory(new PropertyValueFactory<>("region"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        keywordColumn.setCellValueFactory(new PropertyValueFactory<>("keyword"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("dateDP"));

        reviewPublicComplaintArrayList.addAll(
                new ReviewPublicComplaint("C101", "Road corruption issue", "Dhaka", "Pending", "corruption", LocalDate.of(2024, 10, 1)),
                new ReviewPublicComplaint("C102", "Local bribery case", "Chattogram", "In Progress", "bribery", LocalDate.of(2024, 11, 10)),
                new ReviewPublicComplaint("C103", "False bidding report", "Sylhet", "Pending", "bidding", LocalDate.of(2024, 12, 5)));
        complainTableView.setItems(reviewPublicComplaintArrayList);

    }
// public void filter(ActionEvent actionEvent) {
//        ArrayList<Datapackage>filterlist=new ArrayList<>();
//        for(Datapackage dp:datapackagelist){
//            if(validityCB1.getValue().equals(dp.getValidity())) {
//                filterlist.add(dp);}
//            datapackageTableView.getItems().clear();
//            datapackageTableView.getItems().addAll(filterlist);
    @FXML
    public void search(ActionEvent actionEvent) {
        ArrayList<ReviewPublicComplaint> filteredList = new ArrayList<>();

        String regionInput = regionTF.getText().trim();
        String keywordInput = keywordTF.getText().trim().toLowerCase();
        LocalDate dateInput = dateDP.getValue();

        for (ReviewPublicComplaint complaint : reviewPublicComplaintArrayList) {
            if (complaint.getRegion().equalsIgnoreCase(regionInput)
                    && complaint.getKeyword().toLowerCase().equals(keywordInput)
                    && complaint.getDateDP().equals(dateInput)) {
                filteredList.add(complaint);}
        }
        complainTableView.getItems().clear();
        complainTableView.getItems().addAll(filteredList);
    }



    @FXML
    public void update(ActionEvent actionEvent) {
        TableView.TableViewSelectionModel selected = complainTableView.getSelectionModel();
        if (selected != null) {
            selected.equals("In Progress");
        }
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent)  throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/io_dashboard");
    }
}

