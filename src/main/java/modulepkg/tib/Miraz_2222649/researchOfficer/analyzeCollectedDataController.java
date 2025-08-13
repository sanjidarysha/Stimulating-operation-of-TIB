package modulepkg.tib.Miraz_2222649.researchOfficer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import modulepkg.tib.common.SceneSwitcher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class analyzeCollectedDataController {

    @FXML private TableView<InputSurvey> dataTable;
    @FXML private TableColumn<InputSurvey, String> question1Col;
    @FXML private TableColumn<InputSurvey, String> answer1Col;
    @FXML private TableColumn<InputSurvey, String> question2Col;
    @FXML private TableColumn<InputSurvey, String> answer2Col;
    @FXML private TableColumn<InputSurvey, String> nameCol;
    @FXML private TableColumn<InputSurvey, Integer> ageCol;
    @FXML private Button backButton;

    private final ObservableList<InputSurvey> dataList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Link columns to InputSurvey fields
        question1Col.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getQuestion1()));
        answer1Col.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getAnswer1()));
        question2Col.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getQuestion2()));
        answer2Col.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getAnswer2()));
        nameCol.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getName()));
        ageCol.setCellValueFactory(cellData -> new javafx.beans.property.SimpleIntegerProperty(cellData.getValue().getAge()).asObject());

        loadInputSurveys();
    }

    private void loadInputSurveys() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("inputSurvey.bin"))) {
            while (true) {
                try {
                    InputSurvey survey = (InputSurvey) ois.readObject();
                    dataList.add(survey);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        dataTable.setItems(dataList);
    }

    @FXML
    private void handleBack() {
        try {
            SceneSwitcher.switchTo("Miraz_2222649/researchOfficer/researchOfficer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
