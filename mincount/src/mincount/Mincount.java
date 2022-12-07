
package mincount;

import java.util.Random;


public class Mincount {

   
    public static void main(String[] args) {
            int n = 10;
            
            
            System.out.println("Количество минимальных значений последовательности: " + countMin(n));
            
    }

    private static int countMin(int n) {
        
        int cmin = 1;
        int min;
        int next;
        
        Random rnd = new Random();
        min = rnd.nextInt(5);
        System.out.println(min);
        
        for (int i = 1; i < n; i++) {
            next = rnd.nextInt(5);
            System.out.println(next);
            
            if (min > next){
                min = next;
                cmin = 1;
            } else if(min == next) {
                cmin++;
            }
        }
        return cmin;
    }
}


