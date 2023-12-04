package com.example.binariodecimal;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.paint.Color;

public class HelloController {

    @FXML
    private TextField textFDecimal;
    @FXML
    private TextField textFBinario;
    @FXML
    private Button BtnCopiarDec;
    @FXML
    private Button btnCopiarBin;
    @FXML
    private Button btnConvertir;
    @FXML
    private Label labelAlerta;
    @FXML
    protected void CopiarDec(){
        String textToCopy = textFDecimal.getText();
        // Obtener el sistema de portapapeles
        Clipboard clipboard = Clipboard.getSystemClipboard();
        // Configurar el contenido del portapapeles
        ClipboardContent content = new ClipboardContent();
        content.putString(textToCopy);
        // Establecer el contenido en el portapapeles
        clipboard.setContent(content);
        System.out.println("Texto copiado al portapapeles: " + textToCopy);

    }
    @FXML
    protected void CopiarBin(){
        String textToCopy = textFBinario.getText();
        // Obtener el sistema de portapapeles
        Clipboard clipboard = Clipboard.getSystemClipboard();
        // Configurar el contenido del portapapeles
        ClipboardContent content = new ClipboardContent();
        content.putString(textToCopy);
        // Establecer el contenido en el portapapeles
        clipboard.setContent(content);
        System.out.println("Texto copiado al portapapeles: " + textToCopy);
    }
    @FXML
    protected void Convertir(){
        int Conversion=0;
        int NumDec=0;
        try{
            labelAlerta.setText(""); // Reseta el label de alertas
            if (textFDecimal.getText() != null && !textFDecimal.getText().isEmpty()) { // verifica que no este vacio el texto
                Conversion= Integer.parseInt(Integer.toBinaryString(Integer.parseInt(textFDecimal.getText())));  //Convierte de String a Int y despues a Binario y a Int otra vez
                textFBinario.setText(String.valueOf(Conversion));   //Establece el valor en el Tfield pero antes lo conveierte a String
            }else if(textFBinario.getText() != null && !textFBinario.getText().isEmpty()){
                Conversion=Integer.parseInt(textFBinario.getText(),2) ;
                textFDecimal.setText(String.valueOf(Conversion));
            }
        }catch (NumberFormatException  m){
            labelAlerta.setText("Ingresa solo numeros");    //Mensaje
            System.out.println("g"+m.getMessage());
        }

    }

}