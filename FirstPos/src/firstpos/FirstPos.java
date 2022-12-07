
package firstpos;

import java.util.Random;


public class FirstPos {

    
    public static void main(String[] args) {
        int x = 3;
        int d;
        int n = 10;
        
        System.out.println("Совпадение произошло на позиции: " + firstNumber(n, x));
    }

    private static int firstNumber(int n, int x) {
        int pos = 0;
        int d;
        
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            d =  rnd.nextInt(4) + 3;
            System.out.println((i+1) + " " + d);
            if (x == d) { 
                pos = i+1;
                break;
            }
       }
     return pos;
    }
  
}
