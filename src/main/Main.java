package main;

import javafx.application.Application;
import javafx.stage.Stage;
import view.View;

public class Main extends Application {

	private View view = new View();

	@Override
	public void start(Stage primaryStage) {
		view.showWindowControllerStarting(primaryStage);
	}

	public static void main(String[] args) {
		launch(args);
	}
}


//fx:root maxHeight="-Infinity" maxWidth="-Infinity"