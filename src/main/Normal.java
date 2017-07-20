package main;

import controller.GuiController;
import view.Gui;

/**
 * Klasse die alles für den normalen Programmstart beinhaltet.
 * @author LudwigKaftan
 * @version Alpha 1.0
 */
public class Normal {

	public Gui oberflaeche;
	public GuiController guiCon;
	
	/**
	 * 1. GUI wird erstellt und Sichtbar gemacht
	 * 2. Controller wird erstellt
	 */
public Normal(){
	Gui oberflaeche = new Gui();
	oberflaeche.setVisible(true);
	
	guiCon = new GuiController();
	
	}
}
