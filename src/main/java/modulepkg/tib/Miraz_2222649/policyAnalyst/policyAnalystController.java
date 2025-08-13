package modulepkg.tib.Miraz_2222649.policyAnalyst;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;
import modulepkg.tib.common.SceneSwitcher;

public class policyAnalystController {

    @FXML private Button logoutButton;
    @FXML private Button reviewResearchReportsButton;
    @FXML private Button publicFriendlyPolicyButton;
    @FXML private Button trackStatusButton;
    @FXML private Button publishFindingsButton;
    @FXML private Button suggestResearchTopicButton;
    @FXML private Button planManageAdvocacyButton;
    @FXML private Button communicateWithButton;
    @FXML private Button evaluateImpactButton;

    @FXML
    private void handleLogout() {
        try {
            SceneSwitcher.switchTo("common/login");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleReviewResearchReports() {
        try {
            SceneSwitcher.switchTo("Miraz_2222649/policyAnalyst/reviewResearchReports");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handlePublicFriendlyPolicy() {
        try {
            SceneSwitcher.switchTo("Miraz_2222649/policyAnalyst/publicFriendlyPolicy");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleTrackStatus() {
        System.out.println("Track Status of Policy Clicked");
    }

    @FXML
    private void handlePublishFindings() {
        System.out.println("Publish Findings Clicked");
    }

    @FXML
    private void handleSuggestResearchTopic() {
        try {
            SceneSwitcher.switchTo("Miraz_2222649/policyAnalyst/suggestResearchTopic");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handlePlanAndManageAdvocacy() {
        System.out.println("Plan and Manage Advocacy Clicked");
    }

    @FXML
    private void handleCommunicateWith() {
        System.out.println("Communicate With Clicked");
    }

    @FXML
    private void handleEvaluateImpact() {
        System.out.println("Evaluate Impact Clicked");
    }
}
