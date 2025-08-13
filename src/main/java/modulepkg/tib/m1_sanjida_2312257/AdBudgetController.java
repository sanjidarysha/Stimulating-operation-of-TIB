package modulepkg.tib.m1_sanjida_2312257;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import modulepkg.tib.common.SceneSwitcher;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class AdBudgetController
{
    @javafx.fxml.FXML
    private TableColumn<AdBudget,String> amountCol;
    @javafx.fxml.FXML
    private TableColumn<AdBudget,String> dateCol;
    @javafx.fxml.FXML
    private TableColumn <AdBudget,String>statusCol;
    @javafx.fxml.FXML
    private TableView <AdBudget>tableview;
    @javafx.fxml.FXML
    private TableColumn <AdBudget,String>budgetidCol;
    @javafx.fxml.FXML
    private TableColumn<AdBudget,String> purposeCol;
    ArrayList<AdBudget>addlist=new ArrayList<>();
    @javafx.fxml.FXML
    private Label label;

    @javafx.fxml.FXML
    public void initialize() {
        budgetidCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        amountCol.setCellValueFactory(new PropertyValueFactory<>("amount"));
        purposeCol.setCellValueFactory(new PropertyValueFactory<>("purpose"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        addlist.add(new AdBudget("B001","50000","upgrading rural health clinics", LocalDate.of(2024, 12, 15),"pending"));
        addlist.add(new AdBudget("B002","120000","road safety awareness programs", LocalDate.of(2024, 8, 4),"pending"));
        addlist.add(new AdBudget("B003","60000","improving school facilities", LocalDate.of(2024, 3, 7),"pending"));
        tableview.getItems().setAll(addlist);

    }

    @javafx.fxml.FXML
    public void reject(ActionEvent actionEvent) {
        AdBudget selectedBudget = tableview.getSelectionModel().getSelectedItem();

        if (selectedBudget != null) {
            if (selectedBudget.getStatus().equals("Pending")){
                selectedBudget.setStatus("Rejected");
                tableview.refresh();
                label.setText(" The budget has been rejected.");
            }
            else {
                label.setText("This budget has already been " + selectedBudget.getStatus());
            }
        }
        else {
            label.setText(" Please select a budget.");
        }
    }

    @javafx.fxml.FXML
    public void approve(ActionEvent actionEvent) {
        AdBudget selectedBudget = tableview.getSelectionModel().getSelectedItem();

       if (selectedBudget != null) {
            if (selectedBudget.getStatus().equals("Pending")) {
                selectedBudget.setStatus("Approved");
                tableview.refresh();

                label.setText(" The budget has been approved.");
            }
            else {
                label.setText("This budget has already been " + selectedBudget.getStatus());
            }
        }
        else {
            label.setText(" Please select a budget first.");
        }

    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/ad_dashboard");
    }
}
