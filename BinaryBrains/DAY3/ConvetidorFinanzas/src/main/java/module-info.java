module com.example.convetidorfinanzas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.convetidorfinanzas to javafx.fxml;
    exports com.example.convetidorfinanzas;
}