package skills;

import java.util.ArrayList;

/**
 * @author Ludwig Kaftan
 * @version Alpha 1.0
 * 
 * 
 */
public class L_Eratosthenes {

	public L_Eratosthenes() {
	}

	public void getPrim(int xzahlen) {
		ArrayList<Integer> potprim = new ArrayList<>(); // array anlegen
		for (int x = 2; x <= xzahlen; x++) // anzahl der potenziellen primzahlen
											// bestimmen
		{
			potprim.add(x); // array fuellen mit potentiellen primzahlen
			// System.out.print(potprim.get(x - 2) + ", "); // fuellung pruefen
		}
		System.out.println(); // leerzeile (�bersichtshalber)
		int index = 0;
		while (index < potprim.size()) {
			for (int z = (index + 1); z < potprim.size(); z++) {
				if (potprim.get(z) % potprim.get(index) == 0) {
					potprim.remove(z);
					z--;
				}
			}
			index++;
		}
		for (int y = 0; y < potprim.size(); y++) {

			System.out.print(potprim.get(y) + ", ");

		}
	}
}
