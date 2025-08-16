package modulepkg.tib.Mannaf_2110279;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RespondAuditQuestionsController {

    @FXML
    private ListView<String> audirQuesLV;
    @FXML
    private TextArea answerTA;
    @FXML
    private DatePicker responsedateDP;
    @FXML
    private TextField answeredbyTF;

    private List<AuditResponse> responsesList = new ArrayList<>();

    @FXML
    public void initialize() {
        audirQuesLV.getItems().addAll(
                "Are all financial records updated?",
                "Has inventory been audited?",
                "Are staff trainings recorded?",
                "Is the compliance report submitted?"
        );

        answerTA.setText("Yes, everything is up-to-date.");
        responsedateDP.setValue(LocalDate.now());
        answeredbyTF.setText("Rafiq Hossain");
    }

    @FXML
    public void fileuploadOA(ActionEvent actionEvent) {
        System.out.println("File upload button clicked (simulate file selection).");
    }

    @FXML
    public void submitOA(ActionEvent actionEvent) {
        String question = audirQuesLV.getSelectionModel().getSelectedItem();
        if (question == null) question = audirQuesLV.getItems().get(0); // default first question

        String answer = answerTA.getText();
        LocalDate date = responsedateDP.getValue();
        String answeredBy = answeredbyTF.getText();

        AuditResponse response = new AuditResponse(question, answer, date, answeredBy);
        responsesList.add(response);

        System.out.println("Submitted: " + response);
    }
}
