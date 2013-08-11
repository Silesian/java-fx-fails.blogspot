/*  Source: http://java-fx-fails.blogspot.de
 *	Mail: java.fx.solutions.blog@gmail.com
 *  Copyright (C) 2013
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.jalpha.jfx.solutions.menubar;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import de.jalpha.jfx.fails.menubar.quickfix.QuickFixedMenuBar;

public class MenuBarTestQuickFixed extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("MenuBar Original");
		Group root = new Group();
		Scene scene = new Scene(root, 400, 300, Color.WHITE);

		QuickFixedMenuBar menuBar = new QuickFixedMenuBar();

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
