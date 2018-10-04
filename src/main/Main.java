package main;

import org.apache.log4j.Logger;

import javafx.application.Application;
import javafx.stage.Stage;
import view.View;

public class Main extends Application {

	private static final Logger LOG = Logger.getLogger(Main.class);
	
	private static View view = new View();
	
	@Override
	public void start(Stage primaryStage) {
		view.showWindowControllerStarting(primaryStage);
	}

	public static void main(String[] args) {
		LOG.info("Приложение Testing - запущенно!");
		LOG.debug("запущен метод - main(String[] args); (Главный метод приложения), в классе -  Main");
		launch(args);
	}
	
	public static View getView() {
		return view;
	}
}


//fx:root maxHeight="-Infinity" maxWidth="-Infinity"