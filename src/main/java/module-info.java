module modulepkg.tib {
    requires javafx.controls;
    requires javafx.fxml;


    opens modulepkg.tib to javafx.fxml;
    exports modulepkg.tib;
    exports modulepkg.tib.m1_sanjida_2312257;
    opens modulepkg.tib.m1_sanjida_2312257 to javafx.fxml;
    exports modulepkg.tib.m1_mohima_2110887;
    opens modulepkg.tib.m1_mohima_2110887 to javafx.fxml;
    exports modulepkg.tib.common;
    opens modulepkg.tib.common to javafx.fxml;
    exports modulepkg.tib.Mannaf_2110279;
    opens modulepkg.tib.Mannaf_2110279 to javafx.fxml, javafx.base;

}