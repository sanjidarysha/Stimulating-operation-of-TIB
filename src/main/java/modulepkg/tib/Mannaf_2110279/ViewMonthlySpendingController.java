package modulepkg.tib.Mannaf_2110279;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ViewMonthlySpendingController {

    @FXML
    private ComboBox<String> monthCB;
    @FXML
    private ComboBox<String> yearCB;
    @FXML
    private TableView<MonthlySpending> reportTV;
    @FXML
    private TableColumn<MonthlySpending, String> catagoryColumn;
    @FXML
    private TableColumn<MonthlySpending, Double> amountSpentColumn;
    @FXML
    private TableColumn<MonthlySpending, Double> givenBudgetColumn;
    @FXML
    private TableColumn<MonthlySpending, Double> differenceColumn;
    @FXML
    private TableColumn<MonthlySpending, String> noteColumn;

    private ObservableList<MonthlySpending> sampleData = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Populate month and year ComboBoxes
        monthCB.getItems().addAll(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        );
        monthCB.getSelectionModel().selectFirst();

        yearCB.getItems().addAll("2023", "2024", "2025");
        yearCB.getSelectionModel().selectFirst();

        // Initialize table columns
        catagoryColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        amountSpentColumn.setCellValueFactory(new PropertyValueFactory<>("amountSpent"));
        givenBudgetColumn.setCellValueFactory(new PropertyValueFactory<>("givenBudget"));
        differenceColumn.setCellValueFactory(new PropertyValueFactory<>("difference"));
        noteColumn.setCellValueFactory(new PropertyValueFactory<>("note"));

        // Add sample data
        sampleData.addAll(
                new MonthlySpending("Office Supplies", 1200.0, 1500.0, "On track"),
                new MonthlySpending("Maintenance", 800.0, 1000.0, "Within budget"),
                new MonthlySpending("Travel", 1500.0, 1800.0, "Slightly under"),
                new MonthlySpending("Software", 2000.0, 2200.0, "Good"),
                new MonthlySpending("Utilities", 600.0, 700.0, "Stable")
        );

        reportTV.setItems(sampleData);
    }

    @FXML
    public void viewOA(ActionEvent actionEvent) {
        System.out.println("Viewing report for " + monthCB.getValue() + ", " + yearCB.getValue());
        // In real app, filter data according to month/year selection
    }

    @FXML
    public void exportPDFOA(ActionEvent actionEvent) {
        System.out.println("Exporting report to PDF");
    }

    @FXML
    public void exportExcelOA(ActionEvent actionEvent) {
        System.out.println("Exporting report to Excel");
    }

    @FXML
    public void shareReportOA(ActionEvent actionEvent) {
        System.out.println("Sharing report via email");
    }
}
