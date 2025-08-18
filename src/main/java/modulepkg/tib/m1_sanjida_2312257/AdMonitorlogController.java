package modulepkg.tib.m1_sanjida_2312257;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import modulepkg.tib.common.SceneSwitcher;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class AdMonitorlogController
{
    @javafx.fxml.FXML
    private TextField dateTF;
    @javafx.fxml.FXML
    private TableColumn<AdMonitor,String> activitycol;
    @javafx.fxml.FXML
    private TableColumn<AdMonitor,String> idcol;
    @javafx.fxml.FXML
    private TableView <AdMonitor>monitorTV;
    @javafx.fxml.FXML
    private TextField idTF;
    @javafx.fxml.FXML
    private TableColumn<AdMonitor,String> dateCol;
    ArrayList<AdMonitor>monitorList=new ArrayList<>();
    @FXML
    private Label label;

    @javafx.fxml.FXML
    public void initialize() {
        idcol.setCellValueFactory(new PropertyValueFactory<>("userid"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        activitycol.setCellValueFactory(new PropertyValueFactory<>("activity"));
        monitorList.add(new AdMonitor("U1001", LocalDateTime.of(2025, 8, 9, 9, 15), "Logged in"));
        monitorList.add(new AdMonitor("U1002", LocalDateTime.of(2025, 4, 7, 5, 8), "Logged in"));
        monitorList.add(new AdMonitor("U1003", LocalDateTime.of(2025, 9, 6, 7, 23), "Logged in"));
        monitorTV.getItems().setAll(monitorList);
    }


    @javafx.fxml.FXML
    public void filter(ActionEvent actionEvent) {
        ArrayList<AdMonitor>filtered=new ArrayList<>();
        String userid = idTF.getText().trim().toLowerCase();
        LocalDateTime date = LocalDateTime.parse(dateTF.getText());

        for (AdMonitor log : monitorList) {
            boolean matchesUser = userid.isEmpty() || log.getUserid().toLowerCase().contains(userid);
            boolean matchesDate = dateTF == null || log.getDate().toLocalDate().equals(date);

            if (matchesUser && matchesDate) {
                filtered.add(log);
            }
        }
        monitorTV.getItems().setAll(filtered);
        label.setText("Filtered " + filtered.size() + " records");
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/ad_dashboard");
    }

    @javafx.fxml.FXML
    public void reset(ActionEvent actionEvent) {
        monitorTV.getItems().setAll(monitorList);
        idTF.clear();
        dateTF.setText(null);
        label.setText("Showing all logs");
    }
}

