package skills;

/**
 *   
 *   @author 	Ludwig Kaftan
 *   @version 	Alpha 1.0
 *
 */
public class L_Palin {

	public boolean drom(String tocheck) {

		String wort = tocheck.toLowerCase();

		for (int x = 0, y = (wort.length() - 1); x < wort.length() / 2; x++, y--) {
			if (wort.charAt(x) != (wort.charAt(y))) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 
	 * @since 	Alpha 1.0
	 * @return 	
	 * 
	 * @param wort
	 * 
	 */
	public void ausgeben(String wort) {
		if (drom(wort) == true) {

			System.out.println("Ja es gibt Kuchen.");
		} else {
			System.out.println("Nein es gibt heute KEINEN Kuchen.");
		}
	}

}
