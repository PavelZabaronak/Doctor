package com.hospital.doctor.controller;



import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ControlerLogin {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField USR;

    @FXML
    private PasswordField RRRR;

    @FXML
    private Button STSRT;

    @FXML
    private Button TTTTT;

    @FXML
    void STSRT(ActionEvent event) {

    }

    @FXML
    void tttttt(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert USR != null : "fx:id=\"USR\" was not injected: check your FXML file 'Login.fxml'.";
        assert RRRR != null : "fx:id=\"RRRR\" was not injected: check your FXML file 'Login.fxml'.";
        assert STSRT != null : "fx:id=\"STSRT\" was not injected: check your FXML file 'Login.fxml'.";
        assert TTTTT != null : "fx:id=\"TTTTT\" was not injected: check your FXML file 'Login.fxml'.";

    }
}
