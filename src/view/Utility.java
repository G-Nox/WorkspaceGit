package view;
import java.awt.GridBagConstraints;
import java.awt.Insets;

/**
 * Hilft beim Layout mit GridBagLayout.
 * 
 * @author Cornelia Rabe
 * @version 1.0
 */
public class Utility {

	/**
	 * Diese Methode erzeugt die Constraints fuer die Objekte in einem
	 * GridBagLayout.
	 * 
	 * @param x
	 *            Spalte des Grafikobjekts
	 * @param y
	 *            Zeile des Grafikobjekts
	 * @param width
	 *            Breite des Grafikobjekts
	 * @param height
	 *            Hoehe des Grafikobjekts
	 * @return GridBagConstraints fuer das jeweilige Grafikobjekt
	 */
	static public GridBagConstraints makegbc(int x, int y, int width,
			int height ) {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = width;
		gbc.gridheight = height;
		 
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		return gbc;
	}
}

