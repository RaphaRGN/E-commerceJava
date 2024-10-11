module com.org.raphaelprojects.teste {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.org.raphaelprojects.teste to javafx.fxml;
    exports com.org.raphaelprojects.teste;
}