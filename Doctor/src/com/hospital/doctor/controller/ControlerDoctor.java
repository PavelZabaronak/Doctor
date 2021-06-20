package com.hospital.doctor.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControlerDoctor {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button surgeon;

    @FXML
    private Button dentist;

    @FXML
    private Button cardiologist;

    @FXML
    void rezervcardiologist(ActionEvent event) {

    }

    @FXML
    void rezervdentist(ActionEvent event) {

    }

    @FXML
    void rezervsurgeon(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert surgeon != null : "fx:id=\"surgeon\" was not injected: check your FXML file 'Doctor choice.fxml'.";
        assert dentist != null : "fx:id=\"dentist\" was not injected: check your FXML file 'Doctor choice.fxml'.";
        assert cardiologist != null : "fx:id=\"cardiologist\" was not injected: check your FXML file 'Doctor choice.fxml'.";

    }
}
