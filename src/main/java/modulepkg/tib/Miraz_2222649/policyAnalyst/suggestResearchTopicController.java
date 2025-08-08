package modulepkg.tib.Miraz_2222649.policyAnalyst;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import modulepkg.tib.common.SceneSwitcher;

import java.io.*;

public class suggestResearchTopicController {

    @FXML private TextField topicNumberField;
    @FXML private TextField topicField;
    @FXML private TextField detailsField;
    @FXML private Button submitButton;
    @FXML private Button backButton;

    @FXML private TableView<ResearchTopic> topicTable;
    @FXML private TableColumn<ResearchTopic, String> numberCol;
    @FXML private TableColumn<ResearchTopic, String> topicCol;
    @FXML private TableColumn<ResearchTopic, String> detailsCol;

    private final ObservableList<ResearchTopic> topicList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        numberCol.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getTopicNumber()));
        topicCol.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getTopicTitle()));
        detailsCol.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getDetails()));
        loadTopicsFromFile();
    }

    @FXML
    private void handleSubmit() {
        String number = topicNumberField.getText();
        String title = topicField.getText();
        String details = detailsField.getText();

        if (number.isEmpty() || title.isEmpty() || details.isEmpty()) {
            System.out.println("All fields are required.");
            return;
        }

        ResearchTopic topic = new ResearchTopic(number, title, details);
        topicList.add(topic); // update UI

        // Save to file
        File file = new File("researchTopic.bin");
        boolean append = file.exists();

        try (ObjectOutputStream oos = append ?
                new AppendableObjectOutputStream(new FileOutputStream(file, true)) :
                new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(topic);
        } catch (IOException e) {
            e.printStackTrace();
        }

        topicTable.setItems(topicList); // refresh table
        topicNumberField.clear();
        topicField.clear();
        detailsField.clear();
    }

    private void loadTopicsFromFile() {
        File file = new File("researchTopic.bin");
        if (!file.exists()) return;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    ResearchTopic topic = (ResearchTopic) ois.readObject();
                    topicList.add(topic);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        topicTable.setItems(topicList);
    }

    @FXML
    private void handleBack() {
        try {
            SceneSwitcher.switchTo("Miraz_2222649/policyAnalyst/policyAnalyst");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
