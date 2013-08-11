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
package de.jalpha.jfx.fails.menubar.quickfix;

import javafx.scene.control.MenuBar;

public class QuickFixedMenuBar extends MenuBar {

	public QuickFixedMenuBar() {
		super();
		setStyle("-fx-skin: \"" + QuickFixedMenuBarSkin.class.getName() + "\";");
	}

}
