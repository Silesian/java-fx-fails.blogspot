package com.jfx.fails.control;

import javafx.scene.control.MenuBar;

public class FMenuBar extends MenuBar {

	public FMenuBar() {
		super();
		setStyle("-fx-skin: \"com.jfx.fails.control.skin.FMenuBarSkin\";");
	}

}
