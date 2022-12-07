
package numberexit;

import java.util.Random;


public class NumberExit {

   
    public static void main(String[] args) {
        int n = 10;
        int x = 5;
      
      
        System.out.println("Порядковый номер числа: " + exNumber(n, x));
    }

    private static int exNumber(int n, int x) {
        int pos = 0;
        int d;
        
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            
            d = rnd.nextInt(4) + 3;
            System.out.println((i+1) + " " + d);
            if (x == d) pos = i + 1;
            
        }
        return pos;
        
        
    }
}
    
