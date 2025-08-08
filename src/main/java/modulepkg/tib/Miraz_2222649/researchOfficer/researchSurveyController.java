package modulepkg.tib.Miraz_2222649.researchOfficer;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import modulepkg.tib.common.SceneSwitcher;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class researchSurveyController {

    @FXML private TextField surveyTitleField;
    @FXML private TextField sectorField;
    @FXML private TextField regionField;
    @FXML private TextField question1Field;
    @FXML private TextField question2Field;
    @FXML private TextField q1Choice1Field;
    @FXML private TextField q1Choice2Field;
    @FXML private TextField q1Choice3Field;
    @FXML private TextField q1Choice4Field;
    @FXML private TextField q2Choice1Field;
    @FXML private TextField q2Choice2Field;
    @FXML private TextField q2Choice3Field;
    @FXML private TextField q2Choice4Field;
    @FXML private Button publishButton;
    @FXML private Button backButton;

    @FXML
    private void handlePublish() {
        try {
            // Create a ResearchSurvey object
            ResearchSurvey survey = new ResearchSurvey();

            survey.setTitle(surveyTitleField.getText());
            survey.setSector(sectorField.getText());
            survey.setRegion(regionField.getText());
            survey.setQuestion1(question1Field.getText());
            survey.setQuestion2(question2Field.getText());

            List<String> q1Choices = new ArrayList<>();
            q1Choices.add(q1Choice1Field.getText());
            q1Choices.add(q1Choice2Field.getText());
            q1Choices.add(q1Choice3Field.getText());
            q1Choices.add(q1Choice4Field.getText());

            List<String> q2Choices = new ArrayList<>();
            q2Choices.add(q2Choice1Field.getText());
            q2Choices.add(q2Choice2Field.getText());
            q2Choices.add(q2Choice3Field.getText());
            q2Choices.add(q2Choice4Field.getText());

            survey.setChoicesQ1(q1Choices);
            survey.setChoicesQ2(q2Choices);

            // Save to binary file
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("researchSurvey.bin", true))) {
                oos.writeObject(survey);
                System.out.println("Survey published successfully!");
            }

        } catch (IOException e) {
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
