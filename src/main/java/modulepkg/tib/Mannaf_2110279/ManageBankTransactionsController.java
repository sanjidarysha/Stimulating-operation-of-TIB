package modulepkg.tib.Mannaf_2110279;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.time.LocalDate;

public class ManageBankTransactionsController {

    @FXML
    private ImageView bankTransactionIV;
    @FXML
    private TextField accountNumberTF;
    @FXML
    private ComboBox<String> transactiontypeCB;
    @FXML
    private DatePicker transactiondateDP;
    @FXML
    private TextField amountTF;

    private ObservableList<BankTransaction> transactionList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        transactiontypeCB.setItems(FXCollections.observableArrayList("Deposit", "Withdraw", "Transfer", "Payment"));
        transactiontypeCB.getSelectionModel().selectFirst();

        amountTF.setText("1000");
        accountNumberTF.setText("0123456789");
        transactiondateDP.setValue(LocalDate.now());

        transactionList.addAll(
                new BankTransaction("Deposit", 5000, "01711223344", LocalDate.of(2025, 8, 10), "Slip001"),
                new BankTransaction("Withdraw", 2000, "01999887766", LocalDate.of(2025, 8, 11), "Slip002"),
                new BankTransaction("Transfer", 1500, "01888776655", LocalDate.of(2025, 8, 12), "Slip003")
        );
    }

    @FXML
    public void cancelOA(ActionEvent actionEvent) {
        transactiontypeCB.getSelectionModel().selectFirst();
        amountTF.clear();
        accountNumberTF.clear();
        transactiondateDP.setValue(LocalDate.now());
    }

    @FXML
    public void submitOA(ActionEvent actionEvent) {
        BankTransaction transaction = new BankTransaction(
                transactiontypeCB.getValue(),
                Double.parseDouble(amountTF.getText()),
                accountNumberTF.getText(),
                transactiondateDP.getValue(),
                "SlipUploaded"
        );
        transactionList.add(transaction);
        System.out.println("Transaction added: " + transaction);
    }

    @FXML
    public void viewReceiptOA(ActionEvent actionEvent) {
        System.out.println("Viewing bank slip for last transaction: " +
                (transactionList.isEmpty() ? "No transactions" : transactionList.get(transactionList.size() - 1)));
    }
}
