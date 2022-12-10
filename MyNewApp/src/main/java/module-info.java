module NewApp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires javafx.graphics;
	requires com.google.gson;
    opens NewApp.MyNewApp to javafx.fxml;
    exports NewApp.MyNewApp;
}