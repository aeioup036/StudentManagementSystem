module com.example.studentmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires dotenv.java;

    opens com.example.studentmanagementsystem to javafx.fxml;
    exports com.example.studentmanagementsystem;
}