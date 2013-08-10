package de.jalpha.jfx.fails.menubar.quickfix;

import javafx.scene.control.MenuBar;

public class QuickFixedMenuBar extends MenuBar {

	public QuickFixedMenuBar() {
		super();
		setStyle("-fx-skin: \"" + QuickFixedMenuBarSkin.class.getName() + "\";");
	}

}
