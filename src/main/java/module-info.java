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

    exports modulepkg.tib.Miraz_2222649.researchOfficer;
    opens modulepkg.tib.Miraz_2222649.researchOfficer to javafx.fxml;

    exports modulepkg.tib.Miraz_2222649.policyAnalyst;
    opens modulepkg.tib.Miraz_2222649.policyAnalyst to javafx.fxml;

}