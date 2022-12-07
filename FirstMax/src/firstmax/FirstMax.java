
package firstmax;

import java.util.Random;


public class FirstMax {

   
    public static void main(String[] args) {
       int n = 10;
       
        System.out.println("Максимальное значение в последовательности под порядковым номером: " + posMax(n));
    }

    private static int posMax(int n) {
        int pos = 1;
        int max;
        int curr;
        
        Random rnd = new Random();
        max = rnd.nextInt(10);
        
        System.out.println(max);
        
        
        for (int i = 1; i < n; i++) {
            curr = rnd.nextInt(10);
            System.out.println(curr);
            if(max < curr){
                max = curr;
                pos = i;
                   
            }
            
        }
        return pos + 1;
    }
    
}
