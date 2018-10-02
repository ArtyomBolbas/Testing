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
			//e.printStackTrace();
		}
		Parent root = loader.getRoot();
		primaryStage.setScene(new Scene(root));
		primaryStage.setResizable(true);
		primaryStage.setMinHeight(700);
		primaryStage.setMinWidth(800);
		primaryStage.setTitle("Testing - authorization");
		primaryStage.show();
	}
	
	
}
