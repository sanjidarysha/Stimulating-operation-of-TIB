package modulepkg.tib.Mannaf_2110279;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TrackFundTransfersController {

    @FXML
    private ComboBox<String> senderDepartmentCB;
    @FXML
    private ComboBox<String> ReceiverDepartmentCB;
    @FXML
    private TextField amountTF;
    @FXML
    private TextArea noteTA;
    @FXML
    private TextField referenceIDnewTF;
    @FXML
    private DatePicker transferDateNewDP;

    private List<FundTransfer> transfers = new ArrayList<>();

    @FXML
    public void initialize() {
        senderDepartmentCB.getItems().addAll(
                "Accounting",
                "Sales",
                "Marketing",
                "IT Support",
                "Human Resources"
        );

        ReceiverDepartmentCB.getItems().addAll(
                "Accounting",
                "Sales",
                "Marketing",
                "IT Support",
                "Human Resources"
        );

        senderDepartmentCB.getSelectionModel().selectFirst();
        ReceiverDepartmentCB.getSelectionModel().select(1);
        amountTF.setText("10000");
        noteTA.setText("Urgent fund transfer for project X");
        referenceIDnewTF.setText("REF20250816");
        transferDateNewDP.setValue(LocalDate.now());
    }

    @FXML
    public void confirmTransferOA(ActionEvent actionEvent) {
        String sender = senderDepartmentCB.getSelectionModel().getSelectedItem();
        String receiver = ReceiverDepartmentCB.getSelectionModel().getSelectedItem();
        double amount = Double.parseDouble(amountTF.getText());
        String note = noteTA.getText();
        LocalDate date = transferDateNewDP.getValue();
        String referenceID = referenceIDnewTF.getText();

        FundTransfer transfer = new FundTransfer(sender, receiver, amount, note, date, referenceID);
        transfers.add(transfer);

        System.out.println("Transfer Confirmed: " + transfer);
    }
}
