package modulepkg.tib.m1_sanjida_2312257;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import modulepkg.tib.common.SceneSwitcher;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ManagewitnessController
{
    @javafx.fxml.FXML
    private TableColumn<ManagewitnessModel,String>contactColumn;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TableColumn<ManagewitnessModel,String>nameColumn;
    @javafx.fxml.FXML
    private TableColumn <ManagewitnessModel,String>noteColumn;
    @javafx.fxml.FXML
    private TableColumn<ManagewitnessModel,Integer>ageColumn;
    @javafx.fxml.FXML
    private Label alertLabel;
    @javafx.fxml.FXML
    private TextField ageTF;
    @javafx.fxml.FXML
    private TextArea noteTA;
    @javafx.fxml.FXML
    private TableView<ManagewitnessModel> witnesstableView;
    @javafx.fxml.FXML
    private TextField idTF;
    @javafx.fxml.FXML
    private TextField contactTF;
    @javafx.fxml.FXML
    private TableColumn<ManagewitnessModel,String> idColumn;
    ArrayList<ManagewitnessModel>witnessList=new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        contactColumn.setCellValueFactory(new PropertyValueFactory<>("contactinfo"));
        noteColumn.setCellValueFactory(new PropertyValueFactory<>("note"));

        witnessList.add(new ManagewitnessModel("W-001", "Toslim", 23, "017xxxxxxx", "Eyewitness of a bribery case"));
        witnessList.add(new ManagewitnessModel("W-001", "Rysha", 32, "017xxxxxxx", "Eyewitness of a bribery case"));
        witnesstableView.getItems().addAll(witnessList);
    }

    @javafx.fxml.FXML
    public void next(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/managewitnesssaved");
    }

    @javafx.fxml.FXML
    public void update(ActionEvent actionEvent) {
        ManagewitnessModel selected = witnesstableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            alertLabel.setText("updated information successfully");
            return;
        }
        if (selected == null) {
            alertLabel.setText("please select a column first");
        }
    }
    @javafx.fxml.FXML
    public void add(ActionEvent actionEvent) {

        if (idTF.getText().isEmpty() || nameTF.getText().isEmpty() || ageTF.getText().isEmpty()|| contactTF.getText().isEmpty() || noteTA.getText().isEmpty())
        {alertLabel.setText("Please fill up all required fields");
            return;
        }


        String id = idTF.getText();
        String name = nameTF.getText();
        Integer age = Integer.parseInt(ageTF.getText());
        String contactinfo = contactTF.getText();
        String note = noteTA.getText();
        ManagewitnessModel witness = new ManagewitnessModel(id, name, age, contactinfo, note);
        witnessList.add(witness);
        witnesstableView.getItems().clear();
        witnesstableView.getItems().addAll(witnessList);
        alertLabel.setText("witness added.");
    }


    @javafx.fxml.FXML
    public void save(ActionEvent actionEvent) {
        String id = idTF.getText();
        String name = nameTF.getText();
        Integer age = Integer.parseInt(ageTF.getText());
        String contactinfo = contactTF.getText();
        String note = noteTA.getText();
        witnesstableView.getItems().clear();
        witnesstableView.getItems().addAll(witnessList);


            try (FileWriter writer = new FileWriter("Witness Info saved data.txt", true)) {
                writer.write("Witness Id: " + id + "\n");
                writer.write("Name: " + name + "\n");
                writer.write("age:" + age + "\n");
                writer.write("contactInfo:" + contactinfo + "\n");
                writer.write("note:" + note + "\n");
                writer.write("______________________\n");
                writer.close();
                alertLabel.setText("Saved data successfully");

            } catch (IOException e) {
                alertLabel.setText("Failed to save data");

            }

    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m1_sanjida_2312257/io_dashboard");
    }

}
//String id= idTF.getText();
//        String name= nameTF.getText();
//        Integer age= Integer.parseInt(ageTF.getText());
//        String contactinfo= contactTF.getText();
//        String note= noteTA.getText();
//        if(id.isEmpty()||name.isEmpty()||age==null||contactinfo.isEmpty()||note.isEmpty()){
//            alertLabel.setText("Please fill up all required fields");
//        return;}
//        for (ManagewitnessModel w : witnessList) {
//            if (w.getId().equals(id)) {
//                w.setName(name);
//                w.setAge(age);
//                w.setContactinfo(contactinfo);
//                w.setNote(note);
//                witnesstableView.refresh();
//            }
//
//        ManagewitnessModel witness=new ManagewitnessModel(id,name,age,contactinfo,note);
//        witnessList.add(witness);
//        witnesstableView.getItems().clear();
//        witnesstableView.getItems().addAll(witnessList);
//        alertLabel.setText(" Witness updated.");}