module com.example.comp1001st200511451test1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comp1001st200511451test1 to javafx.fxml;
    exports com.example.comp1001st200511451test1;
}