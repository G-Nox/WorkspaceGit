package main;

import controller.GuiController;
import view.Gui;

public class Normal {

	public Gui oberflaeche;
	public GuiController guiCon;
public Normal(){
	Gui oberflaeche = new Gui();
	oberflaeche.setVisible(true);
	
	guiCon = new GuiController();
	
	}
}
