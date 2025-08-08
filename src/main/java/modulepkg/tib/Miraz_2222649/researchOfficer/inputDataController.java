package modulepkg.tib.Miraz_2222649.researchOfficer;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import modulepkg.tib.common.SceneSwitcher;

import java.io.*;
import java.util.List;

public class inputDataController {

    @FXML private Label titleLabel;
    @FXML private Label sectorLabel;
    @FXML private Label regionLabel;
    @FXML private Label question1Label;
    @FXML private Label question2Label;

    @FXML private ComboBox<String> question1ComboBox;
    @FXML private ComboBox<String> question2ComboBox;

    @FXML private TextField nameField;
    @FXML private TextField ageField;

    @FXML private Button saveButton;
    @FXML private Button backButton;

    private ResearchSurvey loadedSurvey;

    @FXML
    public void initialize() {
        // Load the latest survey object from researchSurvey.bin
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("researchSurvey.bin"))) {
            ResearchSurvey survey = null;
            while (true) {
                try {
                    survey = (ResearchSurvey) ois.readObject();
                } catch (EOFException eof) {
                    break; // reached end, last survey loaded
                }
            }

            if (survey != null) {
                loadedSurvey = survey;

                titleLabel.setText("Title: " + survey.getTitle());
                sectorLabel.setText("Sector: " + survey.getSector());
                regionLabel.setText("Region: " + survey.getRegion());
                question1Label.setText("Question 1: " + survey.getQuestion1());
                question2Label.setText("Question 2: " + survey.getQuestion2());

                List<String> q1Choices = survey.getChoicesQ1();
                List<String> q2Choices = survey.getChoicesQ2();

                question1ComboBox.getItems().addAll(q1Choices);
                question2ComboBox.getItems().addAll(q2Choices);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleSave() {
        if (loadedSurvey == null) return;

        try {
            InputSurvey input = new InputSurvey();
            input.setTitle(loadedSurvey.getTitle());
            input.setSector(loadedSurvey.getSector());
            input.setRegion(loadedSurvey.getRegion());
            input.setQuestion1(loadedSurvey.getQuestion1());
            input.setQuestion2(loadedSurvey.getQuestion2());

            input.setAnswer1(question1ComboBox.getValue());
            input.setAnswer2(question2ComboBox.getValue());
            input.setName(nameField.getText());
            input.setAge(Integer.parseInt(ageField.getText()));

            // Append input to inputSurvey.bin
            File file = new File("inputSurvey.bin");
            boolean append = file.exists();

            try (ObjectOutputStream oos = append ?
                    new AppendableObjectOutputStream(new FileOutputStream(file, true)) :
                    new ObjectOutputStream(new FileOutputStream(file))) {
                oos.writeObject(input);
                System.out.println("Input saved successfully.");
            }

            // Optionally clear fields
            question1ComboBox.getSelectionModel().clearSelection();
            question2ComboBox.getSelectionModel().clearSelection();
            nameField.clear();
            ageField.clear();

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
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
