package skills;

/**
 *   
 *   @author 	Ludwig Kaftan
 *   @version 	Alpha 1.0
 *
 */
public class L_Baum {

	/**
	 * 
	 * @since 	Alpha 1.0
	 * @return 	A tree
	 * @param 	hoehe how high the size of the tree is
	 * 
	 */
    public void baumzeichnen(int hoehe) {
        if (hoehe > 1) {
            for (int groesse = 0; groesse < hoehe; groesse++) {
                for (int x = (hoehe - groesse); x >= 0; x--) {
                    System.out.print(' '); // * (hoehe-groesse)
                }
                for (int x = (groesse + groesse); x >= 0; x--) {
                    System.out.print('*'); // * ( groesse + (groesse +1))
                }
                System.out.println();
            }
            for (int groesse = 0, x = (hoehe - groesse) - 1; x >= 0; x--) {
                System.out.print(' ');
            }

            System.out.println("| |");

        }
    }
}
