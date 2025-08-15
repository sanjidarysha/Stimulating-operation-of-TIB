package modulepkg.tib.Mannaf_2110279;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TrackFundTransfersController
{
    @javafx.fxml.FXML
    private ComboBox ReceiverDepartmentCB;
    @javafx.fxml.FXML
    private DatePicker transferDateNewDP;
    @javafx.fxml.FXML
    private TextArea noteTA;
    @javafx.fxml.FXML
    private ComboBox senderDepartmentCB;
    @javafx.fxml.FXML
    private TextField referenceIDnewTF;
    @javafx.fxml.FXML
    private TextField amountTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void confirmTransferOA(ActionEvent actionEvent) {
    }
}