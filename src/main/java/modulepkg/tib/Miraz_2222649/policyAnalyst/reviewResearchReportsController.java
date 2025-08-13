package modulepkg.tib.Miraz_2222649.policyAnalyst;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import modulepkg.tib.Miraz_2222649.researchOfficer.InputSurvey;
import modulepkg.tib.common.SceneSwitcher;

import java.io.*;
import java.util.*;

public class reviewResearchReportsController {

    @FXML private ComboBox<String> titleComboBox;
    @FXML private Label reportContentLabel;
    @FXML private TextField commentField;
    @FXML private Button submitButton;
    @FXML private Button backButton;

    private Map<String, List<InputSurvey>> surveyMap = new HashMap<>();

    @FXML
    public void initialize() {
        loadSurveyTitles();
    }

    private void loadSurveyTitles() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("inputSurvey.bin"))) {
            while (true) {
                try {
                    InputSurvey survey = (InputSurvey) ois.readObject();
                    surveyMap.computeIfAbsent(survey.getTitle(), k -> new ArrayList<>()).add(survey);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        ObservableList<String> titles = FXCollections.observableArrayList(surveyMap.keySet());
        titleComboBox.setItems(titles);
    }

    @FXML
    private void handleTitleSelection() {
        String selectedTitle = titleComboBox.getValue();
        if (selectedTitle != null && surveyMap.containsKey(selectedTitle)) {
            StringBuilder content = new StringBuilder();
            for (InputSurvey s : surveyMap.get(selectedTitle)) {
                content.append("Q1: ").append(s.getQuestion1()).append("\n")
                        .append("A1: ").append(s.getAnswer1()).append("\n")
                        .append("Q2: ").append(s.getQuestion2()).append("\n")
                        .append("A2: ").append(s.getAnswer2()).append("\n")
                        .append("Name: ").append(s.getName()).append("\n")
                        .append("Age: ").append(s.getAge()).append("\n\n");
            }
            reportContentLabel.setText(content.toString());
        }
    }

    @FXML
    private void handleSubmit() {
        String selectedTitle = titleComboBox.getValue();
        String comment = commentField.getText();

        if (selectedTitle != null && comment != null && !comment.isEmpty()) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("reviewReport.bin", true))) {
                ReviewReport report = new ReviewReport(selectedTitle, comment);
                oos.writeObject(report);
                System.out.println("Review submitted.");
                commentField.clear();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Please select a title and enter a comment.");
        }
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
