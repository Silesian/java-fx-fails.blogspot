package de.jalpha.jfx.menu;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import com.jfx.fails.control.FMenuBar;

public class MenuTest extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("MenuBar Original");
		Group root = new Group();
		Scene scene = new Scene(root, 400, 300, Color.WHITE);

		FMenuBar menuBar = new FMenuBar();

		// --- Menu File
		Menu menuFile = new Menu("File");

		// --- Menu Edit
		Menu menuEdit = new Menu("Edit");

		// --- Menu View
		Menu menuView = new Menu("View");
		Menu menuView2 = new Menu("View2");
		Menu menuView3 = new Menu("View3");
		Menu menuView4 = new Menu("View4");
		Menu menuView5 = new Menu("View5");

		menuBar.getMenus().addAll(menuFile, menuEdit, menuView, menuView2,
				menuView3, menuView4, menuView5);

		menuBar.prefWidthProperty().bind(primaryStage.widthProperty());

		root.getChildren().addAll(menuBar);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
