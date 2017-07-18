package skills;

/**
 *   
 *   @author 	Ludwig Kaftan
 *   @version 	Alpha 1.0
 *
 */
public class L_EinMalEins {
    int n;
    int[][] array;
    
    public L_EinMalEins(int diagonale) {
        this.n=diagonale;
    }
    
    public void tabelle() {
        array = new int[n][n];

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                array[x][y] = (x+1) * (y+1) ;
            }
        }
    }
    

    public void ausgeben() {
        int breite = (array.length * 3) + 1;
//        int hoehe = (array[0].length * 2) + 1;

        for (int i = 0; i < array[0].length; i++) {	//Anzahl Zeilen

            for (int k = 0; k < breite; k++) {
                System.out.print("-");
            }
            System.out.println();

            for (int j = 0; j < 10; j++) {			//innerhalb einer Zeile
                System.out.print("|");
                String zahl = "" + array[j][i];
                if (array[j][i] < 10) {
                    zahl = "0" + array[j][i];
                }
                System.out.print(zahl);
            }
            System.out.print("|");
            System.out.println();
        }
        for (int k = 0; k < breite; k++) {
            System.out.print("-");
        }
        System.out.println();

    }
}

