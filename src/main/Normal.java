package main;

import controller.GuiController;

/**
 * Klasse die alles für den normalen Programmstart beinhaltet.
 * @author LudwigKaftan
 * @version Alpha 1.0
 */
public class Normal {
	public GuiController guiCon;
	
	/**
	 * 1. GUI wird erstellt und Sichtbar gemacht
	 * 2. Controller wird erstellt
	 */
public Normal(){
	guiCon = new GuiController();
	guiCon.startGui();
	
	}
}
