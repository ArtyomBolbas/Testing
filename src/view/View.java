package view;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class View {

	public void showWindowControllerStarting(Stage primaryStage) {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/view/Starting.fxml"));
		try {
			loader.load();
		} catch (IOException e) {
			System.out.println("Ошибка!!! " + e);
		}
		Parent root = loader.getRoot();
		primaryStage.setScene(new Scene(root));
		primaryStage.setResizable(false);
		primaryStage.setTitle("Testing: authorization");
		primaryStage.show();
	}
	
	public void showControllerRegistrationForm (Stage primaryStage) {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/view/RegistrationForm.fxml"));
		try {
			loader.load();
		} catch (IOException e) {
			System.out.println("Error!! " + e);
		}
		Parent root = loader.getRoot();
		primaryStage.setScene(new Scene(root));
		primaryStage.setResizable(false);
		primaryStage.setTitle("Testing: registratuionForm");
		primaryStage.show();
		
	}
	
	
}
