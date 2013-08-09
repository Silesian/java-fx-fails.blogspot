package com.jfx.fails.control.skin;

import javafx.scene.control.MenuBar;

import com.sun.javafx.scene.control.skin.MenuBarSkin;

public class FMenuBarSkin extends MenuBarSkin {

	public FMenuBarSkin(MenuBar control) {
		super(control);
	}

	@Override
	protected double computeMinWidth(double height) {
		return super.computePrefWidth(height);
	}

}
