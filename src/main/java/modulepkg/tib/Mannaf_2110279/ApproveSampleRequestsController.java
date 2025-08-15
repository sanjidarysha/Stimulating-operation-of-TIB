package modulepkg.tib.Mannaf_2110279;

import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

public class ApproveSampleRequestsController
{
    @javafx.fxml.FXML
    private TableColumn reasonColumn;
    @javafx.fxml.FXML
    private TableColumn quantityColumn;
    @javafx.fxml.FXML
    private TableColumn nameColumn;
    @javafx.fxml.FXML
    private ImageView approveSampleReqIV;
    @javafx.fxml.FXML
    private TableView detailTV;
    @javafx.fxml.FXML
    private TextArea noteTA;
    @javafx.fxml.FXML
    private TableColumn itemColumn;
    @javafx.fxml.FXML
    private TableColumn requestDateColumn;
    @javafx.fxml.FXML
    private ListView pendingSamplereqLV;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void approveOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void rejectOA(ActionEvent actionEvent) {
    }
}