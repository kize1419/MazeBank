module com.example.mazebank {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens com.example.mazebank to javafx.fxml;
    exports com.example.mazebank;
}