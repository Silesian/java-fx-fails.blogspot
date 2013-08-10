package de.jalpha.jfx.fails.menubar.quickfix;

import javafx.scene.control.MenuBar;

import com.sun.javafx.scene.control.skin.MenuBarSkin;

public class QuickFixedMenuBarSkin extends MenuBarSkin {

	public QuickFixedMenuBarSkin(MenuBar control) {
		super(control);
	}

	@Override
	protected double computeMinWidth(double height) {
		return super.computePrefWidth(height);
	}

}
