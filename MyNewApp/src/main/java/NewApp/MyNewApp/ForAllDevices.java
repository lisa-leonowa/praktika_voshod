package NewApp.MyNewApp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ForAllDevices {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BtnAllDevices;

    @FXML
    private Button BtnNewValue;

    @FXML
    private CheckBox CheckBoxDateTime;

    @FXML
    private ListView<?> ListViewAllDevices;

    @FXML
    private DatePicker TimeAndDateOnDevice;

    @FXML
    private TextField ValueOnDevice;

    @FXML
    private TextField XAgentToken;

    @FXML
    private Label labelErrorsAgentToken;

    @FXML
    void ListViewAllDevicesEsit(ActionEvent event) {

    }

    @FXML
    void ListViewAllDevicesStart(ActionEvent event) {

    }

    @FXML
    void getAllDevices(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert BtnAllDevices != null : "fx:id=\"BtnAllDevices\" was not injected: check your FXML file 'primary2.fxml'.";
        assert BtnNewValue != null : "fx:id=\"BtnNewValue\" was not injected: check your FXML file 'primary2.fxml'.";
        assert CheckBoxDateTime != null : "fx:id=\"CheckBoxDateTime\" was not injected: check your FXML file 'primary2.fxml'.";
        assert ListViewAllDevices != null : "fx:id=\"ListViewAllDevices\" was not injected: check your FXML file 'primary2.fxml'.";
        assert TimeAndDateOnDevice != null : "fx:id=\"TimeAndDateOnDevice\" was not injected: check your FXML file 'primary2.fxml'.";
        assert ValueOnDevice != null : "fx:id=\"ValueOnDevice\" was not injected: check your FXML file 'primary2.fxml'.";
        assert XAgentToken != null : "fx:id=\"XAgentToken\" was not injected: check your FXML file 'primary2.fxml'.";
        assert labelErrorsAgentToken != null : "fx:id=\"labelErrorsAgentToken\" was not injected: check your FXML file 'primary2.fxml'.";

    }

}
