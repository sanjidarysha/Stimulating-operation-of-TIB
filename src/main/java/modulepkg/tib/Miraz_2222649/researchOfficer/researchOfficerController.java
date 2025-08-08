package modulepkg.tib.Miraz_2222649.researchOfficer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import modulepkg.tib.common.SceneSwitcher;

import java.io.IOException;

public class researchOfficerController {

    @FXML
    private Button logoutButton, newSurveyButton, analyzeDataButton, categorizeReportsButton,
            submitReportsButton, collectInputDataButton, generateReportsButton,
            collaborateFieldStaffButton, storeManageRecordButton;

    @FXML
    private void handleLogout() {
        try {
            SceneSwitcher.switchTo("common/login");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleNewSurvey() {
        try {
            SceneSwitcher.switchTo("Miraz_2222649/researchOfficer/researchSurvey");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleAnalyzeData() {
        try {
            SceneSwitcher.switchTo("Miraz_2222649/researchOfficer/analyzeCollectedData");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleCategorizeReports() {
        try {
            SceneSwitcher.switchTo("Miraz_2222649/researchOfficer/categorizeReports");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleSubmitReports() {
        try {
            SceneSwitcher.switchTo("Miraz_2222649/researchOfficer/submitReports");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleCollectInputData() {
        try {
            SceneSwitcher.switchTo("Miraz_2222649/researchOfficer/inputData");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleGenerateReports() {
        try {
            SceneSwitcher.switchTo("Miraz_2222649/researchOfficer/researchReports");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleCollaborateFieldStaff() {
        try {
            SceneSwitcher.switchTo("Miraz_2222649/researchOfficer/collaborateFieldStaff");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleStoreManageRecord() {
        try {
            SceneSwitcher.switchTo("Miraz_2222649/researchOfficer/storeManageRecord");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
