package skills;

/**
 *   
 *   @author 	Ludwig Kaftan
 *   @version 	Alpha 1.0
 *
 */
public class L_Fibu {
	// int fibunatzahl;

	public int fibuzahl(int x) {
		if (x <= 1) {
			return 1;
		}
		if (x == 2) {
			return 1;
		}
		return fibuzahl(x - 1) + fibuzahl(x - 2);
	}
}
