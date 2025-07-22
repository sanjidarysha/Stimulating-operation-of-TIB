module modulepkg.tib {
    requires javafx.controls;
    requires javafx.fxml;


    opens modulepkg.tib to javafx.fxml;
    exports modulepkg.tib;
}