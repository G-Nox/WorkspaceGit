package skills;

import java.util.ArrayList;

/**
 *   
 *   @author 	Ludwig Kaftan
 *   @version 	Alpha 1.0
 *
 */
public class L_Pi {
//    double[] pis;
    private ArrayList<Double> zehnerpi;
    int exponenten;
    
    public L_Pi (int exponenten){
        this.exponenten = exponenten;
    }

    public double berechnen(double stellen) { // 
        double pi = 0;
        
        for (int i = 0; i < stellen; i++) {
            double bruch = (Math.pow(-1, i) / (2 * i + 1)) * 4;
            pi = pi + bruch;
        }
        return pi;
    }

    /**
     * 
     * @since 	Alpha 1.0
     * @return 	
     * 
     */
    public void pi10() {
//        zehnerpi = new ArrayList();
        for (int j = 0; j < exponenten; j++) {
            zehnerpi.add(berechnen(Math.pow(10, j)));
        }
    }
    
    /**
     * 
     * @since 	Alpha 1.0
     * @return 	
     * 
     */
    public void ausgeben() {
        pi10();
        for (int k = 0; k < zehnerpi.size(); k++) {
            System.out.println("Pi mit 10^" + k + " Summanten:  " + zehnerpi.get(k));
        }
    }
    
}
