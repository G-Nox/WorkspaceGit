package controller;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author LudwigKaftan
 * @version Alpha 1.0 1. Settings laden (sofern vorhanden) 2. Werte übernehmen
 *          (default werte, falls nichts vorhanden ist) 3. Speichern
 */
public class Memory {

	private File optionenDatei;

	public Memory() {
		// Erzeugung unseres File-Objektes
		File optionenDatei = new File("resources/optionen.txt");
		openFile();
	}
	
	/*
	 * 1. Überprüfung, ob die mit dem Pfad assozierte Datei bzw. Verzeichnis existiert
	 * 
	 */
	public void openFile() {
		if (!optionenDatei.exists()) {
			try {
				// Erstelle Datei auf Festplatte
				boolean wurdeErstellt = optionenDatei.createNewFile();
				// Überprüfung, ob die Datei erstellt wurde
				if (wurdeErstellt) {
					System.out.println(
							"Option.txt wurde erfolgreich" + " am Ort: \"resources/optionen.txt\" erstellt");
				} else {
					System.out.println("Beispiel.txt wurde nicht erfolgreich" + " auf dem Laufwerk c erstellt");
				}
			} catch (IOException ex) {
				// Ein Fehler ist aufgetreten.
				ex.printStackTrace();
			}
		}
		
		
	}

	public void SetDefault() {

	}

	public void getInfos() {
		; // File infos ausspucken oder File zu public abändern
	}
}
