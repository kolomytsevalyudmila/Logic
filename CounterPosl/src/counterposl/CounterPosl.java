
package counterposl;

import java.util.Random;


public class CounterPosl {
   
    
    public static void main(String[] args) {
        int n = 10;
        int x = 3;
        
        System.out.println("Заданное число встречается: " + counterNumb(n, x) + " раз");
        
    }

    private static int counterNumb(int n, int x) {
        
        int pos = 0;
        int d;
        int counter = 0;
        
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            d = rnd.nextInt(10);
            System.out.println((i + 1) + " " + d);
            if(x == d) counter++;
            
        }
        return counter;
        }
    
}
