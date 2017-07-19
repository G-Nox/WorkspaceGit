package view;

import java.awt.Container;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.WindowConstants;

@SuppressWarnings("serial") // Unterdrückt compiler warnung
public class Gui extends JFrame {

//	private GridBagLayout lout = new GridBagLayout();
	private int x = 1280;	// breite
	private int y = 720;	// höhe
    private JSplitPane split;
    private GroupLayout gl;
    private JLabel pic;
    private JButton btnOpt;
    
	public Gui() {
		super("Prototyp");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(x, y); 	// größe setzen
		this.setResizable(true); // größe ändern erlaubt
		this.setLocationRelativeTo(null);

        // Erzeugung eines JSplitPane-Objektes mit horizontaler Trennung
        split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        split.setDividerLocation(400);
        gl = new GroupLayout();
        
//        split.setMinimumSize(250);
//        split.setMaximumSize(600);

        
        // Hier setzen wir Die Elemente ein
        split.setLeftComponent(pic);
        split.setLeftComponent(btnOpt);
        
        //Initialisierung der Objekte
        btnOpt.setText("Optionen");
//        btnOpt.addActionListener();
        
        
//		lout.columnWidths = new int[] { 400, x - 400 };
//		lout.rowHeights = new int[] { y };

//		Container contain = this.getContentPane();
//		contain.setLayout(lout);

	}

}