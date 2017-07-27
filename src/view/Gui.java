package view;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.WindowConstants;

import controller.GuiController;
import controller.RandomBild;

/**
 * Die gesplittete Standard Oberfläche
 * 
 * @author LudwigKaftan
 * @version Alpha 1.0
 * @return Benutzeroberfläche
 */

@SuppressWarnings("serial") // Unterdrückt compiler warnung
public class Gui extends JFrame {
	private TabStart sc = new TabStart();
	private TabTimer time = new TabTimer();
	private TabSettings set = new TabSettings();

	/**
	 * 1. Initialisierung des Fensters 2. Container und Layout setzen 3. Linke
	 * Seite
	 */
	public Gui() {
		super("Prototyp");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setResizable(true); // größe ändern erlaubt
		this.setBounds(700, 10, 450, 300); // Position & Masse
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		this.getContentPane().add(tabbedPane);
		Dimension min = new Dimension(300, 200);
		this.setMinimumSize(min);

		// Tab: Home
		tabbedPane.addTab("Home", null, sc, null);

		// Tab: Time
		tabbedPane.addTab("Time", null, time, null);

		// Options
		tabbedPane.addTab("Settings", null, set, null);

	}
}
