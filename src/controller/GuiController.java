package controller;

import java.util.Random;

import view.Gui;

public class GuiController {
	private Gui oberflaeche;

	public GuiController() {
	}

	public void startGui() {
		oberflaeche = new Gui();
		oberflaeche.setVisible(true);
	}

	public String bildSource(int n) {
		switch (n) {
		case 0:

		case 1:
			return "/images/avatar/avatar";
		case 2:
			return "/images/avatar/avatar";
		default:
			return "/images/avatar/avatar";
		}
	}
}
