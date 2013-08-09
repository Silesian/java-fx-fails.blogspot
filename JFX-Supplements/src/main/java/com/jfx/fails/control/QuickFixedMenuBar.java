package com.jfx.fails.control;

import javafx.scene.control.MenuBar;

public class QuickFixedMenuBar extends MenuBar {

	public QuickFixedMenuBar() {
		super();
		setStyle("-fx-skin: \"com.jfx.fails.control.skin.QuickFixedMenuBarSkin\";");
	}

}
