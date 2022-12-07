
package firstbreak;

import java.util.Random;


public class FirstBreak {

   
    public static void main(String[] args) {
        int n = 10;
        int d = 0;
        
        System.out.println("Порядковый номер максимального числа: " + PosNumber(n, d));
    }

    private static int PosNumber(int n, int d) {
        int d;
        int pos;
        int counter = 0;
        
        Random rnd = new Random();
        pos = rnd.nextInt(n);
        for (int i = 1; i < n; i++) {
            
            
            
        }
        System.out.println(pos);
        return 0;
        
       
    
    
    
    }
    
}
