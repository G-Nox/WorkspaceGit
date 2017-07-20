package view;

import java.awt.Container;
import java.awt.GridBagLayout;

import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.WindowConstants;

/**
 * Die gesplittete Standard Oberfläche
 * 
 * @author LudwigKaftan
 * @version Alpha 1.0
 * @param x,y, Breite und Höhe
 * @return Benutzeroberfläche
 */

@SuppressWarnings("serial") // Unterdrückt compiler warnung
public class Gui extends JFrame {

	// private GridBagLayout lout = new GridBagLayout();
	private int x = 1280; // breite
	private int y = 720; // höhe
	private JSplitPane split;
	private GroupLayout gl;
	private JLabel pic;
	private JButton btnOpt;
	private Icon icon;	
	private Icon bild;

	/**
	 * 1. Initialisierung des Fensters
	 * 2. 
	 */
	public Gui() {
		super("Prototyp");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(x, y); // größe setzen
		this.setResizable(true); // größe ändern erlaubt
		this.setLocationRelativeTo(null);

		// Erzeugung eines JSplitPane-Objektes mit horizontaler Trennung
		split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		split.setDividerLocation(400);

//		gl = new GroupLayout(parent);
//		gl.addLayoutComponent(pic, arg1);
		// split.setMinimumSize(250);
		// split.setMaximumSize(600);

		// Hier setzen wir Die Elemente ein
//		Icon bild = new ImageIcon(bildDateiAlsString); 
//		labelFuerBild.setIcon(bild);

		split.setLeftComponent(pic);
		split.setLeftComponent(btnOpt);

		// Initialisierung der Objekte
		btnOpt.setText("Optionen");
		// btnOpt.addActionListener();

	}

}