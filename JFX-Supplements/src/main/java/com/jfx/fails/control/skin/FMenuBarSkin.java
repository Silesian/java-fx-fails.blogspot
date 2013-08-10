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

package com.jfx.fails.control.skin;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

import com.sun.javafx.scene.control.skin.MenuBarSkin;

public class FMenuBarSkin extends MenuBarSkin {

	private final Menu minSizeMenu = new Menu(">");
	private double lastComputePrefWidth;

	public FMenuBarSkin(final MenuBar control) {
		super(control);

		control.widthProperty().addListener(new ChangeListener<Number>() {

			public void changed(
					ObservableValue<? extends Number> observableValue,
					Number oldValue, Number newValue) {
				ObservableList<Menu> menus = control.getMenus();

				Double width = (Double) newValue;
				double computePrefWidth = computePrefWidth(getHeight());

				if (width < computePrefWidth) {
					lastComputePrefWidth = computePrefWidth;
					menus.remove(minSizeMenu);
					Menu removedMenu = menus.remove(menus.size() - 1);

					if (!menus.contains(minSizeMenu))
						menus.add(minSizeMenu);

					MenuItem newMenuItem = createMenuItem(removedMenu);
					minSizeMenu.getItems().add(0, newMenuItem);
				} else if (width >= lastComputePrefWidth
						&& !minSizeMenu.getItems().isEmpty()) {
					MenuItem newMenuItem = minSizeMenu.getItems().remove(0);
					Menu newMenu = createMenu(newMenuItem);
					menus.add(menus.size() - 1, newMenu);

					if (minSizeMenu.getItems().isEmpty())
						menus.remove(minSizeMenu);
				}
			}

		});
	}

	private MenuItem createMenuItem(Menu removedMenu) {
		MenuItem menuItem = new MenuItem(removedMenu.getText());
		menuItem.setOnAction(removedMenu.getOnAction());
		return menuItem;
	}

	private Menu createMenu(MenuItem newMenuItem) {
		Menu menu = new Menu(newMenuItem.getText());
		menu.setOnAction(newMenuItem.getOnAction());
		return menu;
	}
}
