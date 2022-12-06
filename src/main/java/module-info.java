module com.example.olamundofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.olamundofx to javafx.fxml;
    exports com.example.olamundofx;
}