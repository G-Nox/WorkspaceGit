package skills;

import java.util.Random;

/**
 *   
 *   @author 	Ludwig Kaftan
 *   @version 	Alpha 1.0
 *
 */
public class L_Lotto {

    public int[] spielen() {
        int[] zahlen = new int[6];
        Random r1 = new Random();
        for (int i = 0; i < 6; i++) {
            int zz = r1.nextInt(50);

            int index = 0;
            boolean gefunden = false;
            while (index < 6 && !gefunden) {
                if (zz == zahlen[index]) {
                    gefunden = true;
                    i--;
                } else {
                    index++;
                }

            }
            if (gefunden == false) {
//                System.out.print(zz + ", ");
                zahlen[i] = zz;
            }

        }
        return zahlen;

    }
}
