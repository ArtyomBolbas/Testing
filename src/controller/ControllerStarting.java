package controller;

import java.net.URL;

import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import main.Main;
import view.View;

public class ControllerStarting {

	private Stage primaryStage = new Stage();
	private static View view;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonOpenID;

    @FXML
    private Button buttonRegistrationID;

    @FXML
    private Button buttonCloseID;
    
    @FXML
    void buttonClose(ActionEvent event) {
    	System.exit(0);
    }

    @FXML
    void buttonRegistration(ActionEvent event) {
    	if(!primaryStage.isShowing()) {
    		view.showControllerRegistrationForm(primaryStage);
    	}
    }
    
    @FXML
    void buttonOpen(ActionEvent event) {

    }
    

    @FXML
    void initialize() {
    	view = Main.getView();
    }

}
