module br.dev.arthur.dukemarket.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    
    requires java.sql;
    
            
            
            
    opens br.dev.arthur.dukemarket.javafx to javafx.fxml;
    opens br.dev.arthur.dukemarket.javafx.controller to javafx.fxml;
    
    exports br.dev.arthur.dukemarket.javafx;
    exports br.dev.arthur.dukemarket.javafx.controller;
    exports br.dev.arthur.dukemarket.javafx.DAO;
    exports br.dev.arthur.dukemarket.javafx.model;
    exports connection;

    requires mysql.connector.java; 

}



