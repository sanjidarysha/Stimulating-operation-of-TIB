package modulepkg.tib.Mannaf_2110279;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class ViewRequestHistoryController {

    @FXML
    private TextField employeeNameTF;
    @FXML
    private DatePicker selectDateDP;
    @FXML
    private TableView<RequestHistory> historyTV;
    @FXML
    private TableColumn<RequestHistory, Integer> idColumn;
    @FXML
    private TableColumn<RequestHistory, String> employeeColumn;
    @FXML
    private TableColumn<RequestHistory, String> itemNameColumn;
    @FXML
    private TableColumn<RequestHistory, Integer> QuantityColumn;
    @FXML
    private TableColumn<RequestHistory, String> statusColumn;
    @FXML
    private TableColumn<RequestHistory, LocalDate> requestDateColumn;
    @FXML
    private TableColumn<RequestHistory, LocalDate> approvalColumn;
    @FXML
    private TableColumn<RequestHistory, String> processedByColumn;
    @FXML
    private TableColumn<RequestHistory, String> departmentColumn;
    @FXML
    private TableColumn<RequestHistory, String> remarksColumn;
    @FXML
    private TextArea noteTA;

    private ObservableList<RequestHistory> sampleData = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Initialize TableView columns
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        employeeColumn.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
        itemNameColumn.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        QuantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        requestDateColumn.setCellValueFactory(new PropertyValueFactory<>("requestDate"));
        approvalColumn.setCellValueFactory(new PropertyValueFactory<>("approvalDate"));
        processedByColumn.setCellValueFactory(new PropertyValueFactory<>("processedBy"));
        departmentColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        remarksColumn.setCellValueFactory(new PropertyValueFactory<>("remarks"));

        // Sample data
        sampleData.addAll(
                new RequestHistory(1, "Rafiq Hossain", "Laptop", 2, "Approved",
                        LocalDate.of(2025,8,1), LocalDate.of(2025,8,2), "Admin1", "IT", "Urgent"),
                new RequestHistory(2, "Shakib Khan", "Chair", 5, "Pending",
                        LocalDate.of(2025,8,5), null, "Admin2", "HR", ""),
                new RequestHistory(3, "Tanvir Islam", "Desk", 3, "Rejected",
                        LocalDate.of(2025,8,3), LocalDate.of(2025,8,4), "Admin3", "Finance", "Out of budget")
        );

        historyTV.setItems(sampleData);
    }

    @FXML
    public void applyFilterOA(ActionEvent actionEvent) {
        String empName = employeeNameTF.getText().trim();
        LocalDate date = selectDateDP.getValue();

        ObservableList<RequestHistory> filtered = FXCollections.observableArrayList();
        for (RequestHistory r : sampleData) {
            boolean match = true;
            if (!empName.isEmpty() && !r.getEmployeeName().toLowerCase().contains(empName.toLowerCase()))
                match = false;
            if (date != null && !r.getRequestDate().equals(date))
                match = false;
            if (match)
                filtered.add(r);
        }
        historyTV.setItems(filtered);
    }

    @FXML
    public void viewDetailsOA(ActionEvent actionEvent) {
        RequestHistory selected = historyTV.getSelectionModel().getSelectedItem();
        if (selected != null) {
            noteTA.setText("Request by " + selected.getEmployeeName() + " for " +
                    selected.getItemName() + " (" + selected.getQuantity() + ") - Status: " + selected.getStatus());
        }
    }

    @FXML
    public void exportpdfOA(ActionEvent actionEvent) {
        System.out.println("Exporting PDF of request history");
    }

    @FXML
    public void closeOA(ActionEvent actionEvent) {
        System.out.println("Closing the window");
    }
}
