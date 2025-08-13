package modulepkg.tib.Miraz_2222649.policyAnalyst;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import modulepkg.tib.common.SceneSwitcher;

import java.io.*;

public class publicFriendlyPolicyController {

    @FXML private TextField titleField;
    @FXML private TextField descriptionField;
    @FXML private Button saveButton;
    @FXML private Button backButton;

    @FXML private TableView<PublicPolicyBrief> policyTable;
    @FXML private TableColumn<PublicPolicyBrief, String> titleCol;
    @FXML private TableColumn<PublicPolicyBrief, String> descCol;

    private final ObservableList<PublicPolicyBrief> policyList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        titleCol.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getTitle()));
        descCol.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getDescription()));

        loadFromFile();
        policyTable.setItems(policyList);
    }

    @FXML
    private void handleSave() {
        String title = titleField.getText().trim();
        String description = descriptionField.getText().trim();

        if (title.isEmpty() || description.isEmpty()) {
            System.out.println("Please fill in both fields.");
            return;
        }

        PublicPolicyBrief brief = new PublicPolicyBrief(title, description);
        policyList.add(brief);

        File file = new File("publicFriendly.bin");
        boolean append = file.exists();

        try (ObjectOutputStream oos = append ?
                new AppendableObjectOutputStream(new FileOutputStream(file, true)) :
                new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(brief);
        } catch (IOException e) {
            e.printStackTrace();
        }

        titleField.clear();
        descriptionField.clear();
    }

    private void loadFromFile() {
        File file = new File("publicFriendly.bin");
        if (!file.exists()) return;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    PublicPolicyBrief brief = (PublicPolicyBrief) ois.readObject();
                    policyList.add(brief);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleBack() {
        try {
            SceneSwitcher.switchTo("Miraz_2222649/policyAnalyst/policyAnalyst");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
