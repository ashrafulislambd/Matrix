module com.hello {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens com.hello to javafx.fxml;
    exports com.hello;
}
