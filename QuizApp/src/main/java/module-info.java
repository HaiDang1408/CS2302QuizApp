module com.plhd.mavenproject3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    requires lombok;

    opens com.plhd.mavenproject3 to javafx.fxml;
    exports com.plhd.mavenproject3;
}
