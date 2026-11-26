module br.dev.arthur.javafx_ex1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.dev.arthur.javafx_ex1 to javafx.fxml;
    exports br.dev.arthur.javafx_ex1;
}
