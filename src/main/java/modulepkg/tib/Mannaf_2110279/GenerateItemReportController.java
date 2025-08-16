package modulepkg.tib.Mannaf_2110279;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;

import java.time.LocalDate;

public class GenerateItemReportController {

    @FXML
    private RadioButton byRoomRB;
    @FXML
    private DatePicker toDP;
    @FXML
    private RadioButton byDepartmentRB;
    @FXML
    private ImageView generateItemReportIV;
    @FXML
    private RadioButton byEmployeeRB;
    @FXML
    private AreaChart<String, Number> barChartAC;
    @FXML
    private DatePicker fromDP;
    @FXML
    private RadioButton byConditionRB;

    private ObservableList<ItemReport> reportList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        reportList.addAll(
                new ItemReport("Laptop", 15, LocalDate.of(2025, 8, 1)),
                new ItemReport("Projector", 5, LocalDate.of(2025, 8, 2)),
                new ItemReport("Chair", 50, LocalDate.of(2025, 8, 3)),
                new ItemReport("Table", 20, LocalDate.of(2025, 8, 4)),
                new ItemReport("Whiteboard", 7, LocalDate.of(2025, 8, 5))
        );
        loadChartData();
    }

    private void loadChartData() {
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Item Quantity");

        for (ItemReport report : reportList) {
            series.getData().add(new XYChart.Data<>(report.getCategory(), report.getQuantity()));
        }

        barChartAC.getData().clear();
        barChartAC.getData().add(series);
    }

    @FXML
    public void generateReportOA(ActionEvent actionEvent) {
        loadChartData();
    }

    @FXML
    public void downloadpdfOA(ActionEvent actionEvent) {
        System.out.println("PDF downloaded (simulation).");
    }

    @FXML
    public void sendToAdminOA(ActionEvent actionEvent) {
        System.out.println("Report sent to admin (simulation).");
    }

    @FXML
    public void exportExcekOA(ActionEvent actionEvent) {
        System.out.println("Excel exported (simulation).");
    }
}
