package NewApp.MyNewApp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SecondForm {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblOut;

    @FXML
    void btnClickAction(ActionEvent event) {
    	lblOut.setText(MainApp.token);

    }

    @FXML
    void initialize() {
        assert lblOut != null : "fx:id=\"lblOut\" was not injected: check your FXML file 'primary2.fxml'.";

    }

}
