package com.example.atividade1.controller;

import com.example.atividade1.MainController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuPrincipalController {
    private Alert alert = new Alert(AlertType.INFORMATION);

    @FXML
    private AnchorPane root;

    @FXML
    private Button botaoSair;

    @FXML
    private void sair() throws IOException {
        Stage stage = (Stage) botaoSair.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void acessarCadastroCliente() throws IOException {
        MainController.setRoot("view/cadastrocliente.fxml");
    }

    @FXML
    private void acessarCadastroProduto() throws IOException {
        MainController.setRoot("view/cadastroproduto.fxml");
    }

    @FXML
    private void novaVenda() throws IOException {
        MainController.setRoot("view/novavenda.fxml");
    }

    @FXML
    private void acessarRelatorio() throws IOException {
        MainController.setRoot("view/relatorio.fxml");
    }

    @FXML
    private void mensagemAjuda() throws IOException {
        alert.setTitle("Ajuda do produto");
        alert.setHeaderText(null);
        alert.setContentText(
                "Nome: Sistema de Vendas\n" +
                "Versão: 1.0.0\n" +
                "Desenvolvedor: Ryan Estevão\n" +
                "Ano: 2026"
        );
        alert.showAndWait();
    }
}
