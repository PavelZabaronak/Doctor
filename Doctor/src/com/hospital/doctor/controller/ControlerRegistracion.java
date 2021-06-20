package com.hospital.doctor.controller;





import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ControlerRegistracion {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login;

    @FXML
    private PasswordField password;

    @FXML
    private Button registracion;

    @FXML
    private TextField name;

    @FXML
    private TextField email;

    @FXML
    private TextField surname;

    @FXML
    void registracionGo(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert login != null : "fx:id=\"login\" was not injected: check your FXML file 'Registracion.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'Registracion.fxml'.";
        assert registracion != null : "fx:id=\"registracion\" was not injected: check your FXML file 'Registracion.fxml'.";
        assert name != null : "fx:id=\"name\" was not injected: check your FXML file 'Registracion.fxml'.";
        assert email != null : "fx:id=\"email\" was not injected: check your FXML file 'Registracion.fxml'.";
        assert surname != null : "fx:id=\"surname\" was not injected: check your FXML file 'Registracion.fxml'.";

    }
}

