package modulepkg.tib.Miraz_2222649.researchOfficer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import modulepkg.tib.Miraz_2222649.policyAnalyst.ResearchTopic;
import modulepkg.tib.common.SceneSwitcher;

import java.io.*;
import java.util.*;

public class researchReportsController {

    @FXML private ComboBox<String> topicNumberComboBox;
    @FXML private TableView<ResearchTopic> topicTable;
    @FXML private TableColumn<ResearchTopic, String> numberCol;
    @FXML private TableColumn<ResearchTopic, String> titleCol;
    @FXML private TableColumn<ResearchTopic, String> detailsCol;
    @FXML private Button backButton;

    private final Map<String, List<ResearchTopic>> topicMap = new HashMap<>();
    private final ObservableList<ResearchTopic> displayList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        numberCol.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getTopicNumber()));
        titleCol.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getTopicTitle()));
        detailsCol.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getDetails()));
        topicTable.setItems(displayList);

        loadTopicsFromFile();
    }

    private void loadTopicsFromFile() {
        File file = new File("researchTopic.bin");
        if (!file.exists()) return;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    ResearchTopic topic = (ResearchTopic) ois.readObject();
                    topicMap.computeIfAbsent(topic.getTopicNumber(), k -> new ArrayList<>()).add(topic);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        topicNumberComboBox.setItems(FXCollections.observableArrayList(topicMap.keySet()));
    }

    @FXML
    private void handleTopicSelection() {
        String selectedNumber = topicNumberComboBox.getValue();
        displayList.clear();

        if (selectedNumber != null && topicMap.containsKey(selectedNumber)) {
            displayList.addAll(topicMap.get(selectedNumber));
        }
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
