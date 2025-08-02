package modulepkg.tib.m1_sanjida_2312257;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import modulepkg.tib.common.SceneSwitcher;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class AssignedinvestigationController
{
    @javafx.fxml.FXML
    private TableColumn<AssignedInvestigationModel,String>timeColumn;
    @javafx.fxml.FXML
    private TextField locationTF;
    @javafx.fxml.FXML
    private TableColumn <AssignedInvestigationModel,String>locationColumn;
    @javafx.fxml.FXML
    private TextField timeTF;
    @javafx.fxml.FXML
    private TableColumn<AssignedInvestigationModel,String> dateColumn;
    @javafx.fxml.FXML
    private TextArea descriptionTA;
    @javafx.fxml.FXML
    private TableView <AssignedInvestigationModel>caseTableView;
    @javafx.fxml.FXML
    private TableColumn <AssignedInvestigationModel,String>descriptionColumn;
    @javafx.fxml.FXML
    private Label alertlabel;
    @javafx.fxml.FXML
    private TextField caseidTF;
    @javafx.fxml.FXML
    private TableColumn<AssignedInvestigationModel,String> caseidColumn;
    @javafx.fxml.FXML
    private DatePicker dateDatepicker;
    ArrayList<AssignedInvestigationModel>messagelist=new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        caseidColumn.setCellValueFactory(new PropertyValueFactory<>("caseid"));
        locationColumn.setCellValueFactory(new PropertyValueFactory<>("location"));
        timeColumn.setCellValueFactory(new PropertyValueFactory<>("time"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("dateDP"));
        messagelist.add(new AssignedInvestigationModel("CASE-001", "Dhaka", "10:00 AM", "Bribery case in office", LocalDate.of(2025, 8, 1)));
        messagelist.add(new AssignedInvestigationModel("CASE-002", "Sylhet", "3:15 PM", "Tender manipulation incident", LocalDate.of(2025, 8, 2)));
        caseTableView.getItems().setAll(messagelist);

    }

    @javafx.fxml.FXML
    public void Add(ActionEvent actionEvent) {
        if(caseidTF.getText().isEmpty()||
                locationTF.getText().isEmpty()||
                timeTF.getText().isEmpty()||
                descriptionTA.getText().isEmpty()||
                dateDatepicker.getValue()==null)
        {alertlabel.setText("please fill up all the fields");
            return;
        }
        String caseid=caseidTF.getText();
        String location=locationTF.getText();
        String time=timeTF.getText();
        String description=descriptionTA.getText();
        LocalDate dateDP=dateDatepicker.getValue();
        AssignedInvestigationModel add=new AssignedInvestigationModel(caseid, location, time, description,dateDP);
        alertlabel.setText("Successfully added data");
        caseTableView.getItems().addAll(add);
        caseTableView.refresh();

    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent)  throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/io_dashboard");
    }

    @javafx.fxml.FXML
    public void Save(ActionEvent actionEvent) {
        Object selected = caseTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.equals("CASE-001,CASE-002");
            caseTableView.refresh();
            alertlabel.setText("updated data saved successfully");
        }
        else {alertlabel.setText("please select a complaint to update and save");}

    }
}