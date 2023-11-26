package com.example.convetidorfinanzas;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Objects;

public class HelloController {
    @FXML
    private ComboBox<String> combDivisa1;
    @FXML
    private ComboBox<String> combDivisa2;
    @FXML
    private TextField valor1;
    @FXML
    private  TextField valor2;
    @FXML
    public void initialize(){
        String[] divisa = new String[]{ "MNX","USD","EUR"};
        combDivisa1.getItems().addAll(divisa);
        combDivisa2.getItems().addAll(divisa);
    }
    public void Conversion(){
        double conversion;
        // Convertir de MNX A USD
     if(Objects.equals(combDivisa1.getSelectionModel().getSelectedItem(), "MNX") && Objects.equals(combDivisa2.getSelectionModel().getSelectedItem(), "USD")){

         if (valor1.getText() != null && !valor1.getText().isEmpty()) {
             System.out.println("Convirtiendo....");
             conversion = Double.parseDouble(valor1.getText()) / 17.12;
             valor2.setText(String.valueOf(conversion));
             System.out.println("Conversion realizada.");
         } else if (valor2.getText() != null && !valor2.getText().isEmpty()) {
             System.out.println("Convirtiendo con casilla 2....");
             conversion = Double.parseDouble(valor2.getText()) * 17.12;
             valor1.setText(String.valueOf(conversion));
             System.out.println("Conversion realizada.");

         }// Convertir de MNX A EUR
     } else if(Objects.equals(combDivisa1.getSelectionModel().getSelectedItem(), "MNX") && Objects.equals(combDivisa2.getSelectionModel().getSelectedItem(), "EUR")){
         if (valor1.getText() != null && !valor1.getText().isEmpty()) {
             System.out.println("Convirtiendo....");
             conversion= Double.parseDouble(valor1.getText()) / 18.73;
             valor2.setText(String.valueOf(conversion));
             System.out.println("Conversion realizada.");
         } else if (valor2.getText() != null && !valor2.getText().isEmpty()) {
             System.out.println("Convirtiendo con casilla 2....");
             conversion = Double.parseDouble(valor2.getText()) * 18.73;
             valor1.setText(String.valueOf(conversion));
             System.out.println("Conversion realizada.");
         }// Convertir de USD A MNX
        }else if(Objects.equals(combDivisa1.getSelectionModel().getSelectedItem(), "USD") && Objects.equals(combDivisa2.getSelectionModel().getSelectedItem(), "MNX") ){
         if (valor1.getText() != null && !valor1.getText().isEmpty()) {
             System.out.println("Convirtiendo....");
             conversion= Double.parseDouble(valor1.getText()) * 17.12;
             valor2.setText(String.valueOf(conversion));
             System.out.println("Conversion realizada.");
         } else if (valor2.getText() != null && !valor2.getText().isEmpty()) {
             System.out.println("Convirtiendo con casilla 2....");
             conversion = Double.parseDouble(valor2.getText()) / 17.12;
             valor1.setText(String.valueOf(conversion));
             System.out.println("Conversion realizada.");
         }// Convertir de USD A EUR
     }else if(Objects.equals(combDivisa1.getSelectionModel().getSelectedItem(), "USD") && Objects.equals(combDivisa2.getSelectionModel().getSelectedItem(), "EUR")  ){
         if (valor1.getText() != null && !valor1.getText().isEmpty()) {
             System.out.println("Convirtiendo....");
             conversion= Double.parseDouble(valor1.getText()) / 0.91;
             valor2.setText(String.valueOf(conversion));
             System.out.println("Conversion realizada.");
         } else if (valor2.getText() != null && !valor2.getText().isEmpty()) {
             System.out.println("Convirtiendo con casilla 2....");
             conversion = Double.parseDouble(valor2.getText()) * 0.91;
             valor1.setText(String.valueOf(conversion));
             System.out.println("Conversion realizada.");
         }// Convertir de EUR A MNX
     } else if(Objects.equals(combDivisa1.getSelectionModel().getSelectedItem(), "EUR") && Objects.equals(combDivisa2.getSelectionModel().getSelectedItem(), "MNX") &&valor1.getText() !=null ){
         if (valor1.getText() != null && !valor1.getText().isEmpty()) {
             System.out.println("Convirtiendo....");
             conversion= Double.parseDouble(valor1.getText()) *18.7;
             valor2.setText(String.valueOf(conversion));
             System.out.println("Conversion realizada.");
         } else if (valor2.getText() != null && !valor2.getText().isEmpty()) {
             System.out.println("Convirtiendo con casilla 2....");
             conversion = Double.parseDouble(valor2.getText()) / 18.7;
             valor1.setText(String.valueOf(conversion));
             System.out.println("Conversion realizada.");
         }// Convertir de EUR A USD
     } else if(Objects.equals(combDivisa1.getSelectionModel().getSelectedItem(), "EUR") && Objects.equals(combDivisa2.getSelectionModel().getSelectedItem(), "USD") &&valor1.getText() !=null ){
         if (valor1.getText() != null && !valor1.getText().isEmpty()) {
             System.out.println("Convirtiendo....");
             conversion= Double.parseDouble(valor1.getText()) *1.09;
             valor2.setText(String.valueOf(conversion));
             System.out.println("Conversion realizada.");
         } else if (valor2.getText() != null && !valor2.getText().isEmpty()) {
             System.out.println("Convirtiendo con casilla 2....");
             conversion = Double.parseDouble(valor2.getText()) / 1.09;
             valor1.setText(String.valueOf(conversion));
             System.out.println("Conversion realizada.");
         }
     }
    }
    public  void Limpiar(){
        valor1.setText("");
        valor2.setText("");
    }
}