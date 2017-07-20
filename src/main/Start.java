package main;

/**
 * Start Klasse zum ausführen des Codes
 * @author Ludwig Kaftan
 * @version Alpha 1.0
 * 
 */
public class Start {

	private static Normal nm;
	/**
	 * Program start
	 * 
	 * @return The result of my "L" Project
	 * 
	 */
	public static void main(String[] args) {
		init();
	}

	/**
	 * Constructor for the main loop
	 * 
	 * @return The construct value's
	 * @since 1.0
	 * 
	 */
	private static void init() {
		nm = new Normal();
	}
}
