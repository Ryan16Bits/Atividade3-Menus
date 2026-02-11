package com.example.atividade1.controller;

import com.example.atividade1.MainController;
import javafx.fxml.FXML;

import java.io.IOException;

public class RelatorioController {

    @FXML
    private void voltar() throws IOException {
        MainController.setRoot("view/menuprincipal.fxml");
    }
}
