package com.example.studentmanagementsystem;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class LoginController {
    @FXML private TextField txtUsername;
    @FXML private PasswordField txtPassword;
    @FXML private Label lblError;

    @FXML
    private void handleLogin() {
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        if (username.equals("admin") && password.equals("admin123")) {
            try {
                FXMLLoader loader = new FXMLLoader(
                        getClass().getResource("main.fxml")
                );
                Scene scene = new Scene(loader.load());
                Stage stage = (Stage) txtUsername.getScene().getWindow();
                stage.setTitle("Student Management System");
                stage.setScene(scene);
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            lblError.setText("Invalid username or password!");
        }
    }
}