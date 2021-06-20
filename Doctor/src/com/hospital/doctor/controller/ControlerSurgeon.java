package com.hospital.doctor.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;

public class ControlerSurgeon {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> time;

    @FXML
    private TableColumn<?, ?> date;

    @FXML
    private Button St;

    @FXML
    void rezervdate(ActionEvent event) {

    }

    @FXML
    void rezervsurgeon(ActionEvent event) {

    }

    @FXML
    void rezervtime(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert time != null : "fx:id=\"time\" was not injected: check your FXML file 'Surgeon.fxml'.";
        assert date != null : "fx:id=\"date\" was not injected: check your FXML file 'Surgeon.fxml'.";
        assert St != null : "fx:id=\"St\" was not injected: check your FXML file 'Surgeon.fxml'.";

    }
}

