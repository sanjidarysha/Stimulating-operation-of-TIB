package modulepkg.tib.Mannaf_2110279;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RemoveReplaceItemsController {

    @FXML
    private ListView<String> itemListLV;
    @FXML
    private RadioButton removeRB;
    @FXML
    private RadioButton replaceRB;
    @FXML
    private TextArea reasonTA;
    @FXML
    private DatePicker selectDateDP;

    private List<ItemAction> actionsList = new ArrayList<>();

    @FXML
    public void initialize() {
        itemListLV.getItems().addAll("Chair 101", "Desk 203", "Projector X1", "Whiteboard W2");
        removeRB.setSelected(true);
        reasonTA.setText("Damaged during use");
        selectDateDP.setValue(LocalDate.now());
    }

    @FXML
    public void submitOA(ActionEvent actionEvent) {
        String selectedItem = itemListLV.getSelectionModel().getSelectedItem();
        if (selectedItem == null) {
            selectedItem = itemListLV.getItems().get(0); // default first item
        }

        String action = removeRB.isSelected() ? "Remove" : "Replace";
        String reason = reasonTA.getText();
        LocalDate date = selectDateDP.getValue();

        ItemAction itemAction = new ItemAction(selectedItem, action, reason, date);
        actionsList.add(itemAction);

        System.out.println("Submitted: " + itemAction);
    }
}
