
package srarm;

import java.util.Random;


public class Srarm {

    
    public static void main(String[] args) {
        int n = 10;
        
        System.out.println("armean = " + arMean(n)); 
    }

    private static double arMean(int n) {
        int sum = 0;
        int x;
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            x = rnd.nextInt(5);
            System.out.println(x);
            sum += x;   
        }
        return (double)sum / n;
    }
    
}
