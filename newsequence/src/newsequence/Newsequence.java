
package newsequence;

import java.util.Random;


public class Newsequence {

    
    public static void main(String[] args) {
        int n = 10;
        
        System.out.println("Counter= " + bigCount(n));
    }

    private static int bigCount(int n) {
        
        int counter = 0;
        Random rnd = new Random();
        int prev;
        int curr;
        prev = rnd.nextInt(5);
        System.out.println(prev);
        for (int i = 1; i < n; i++) {
            curr = rnd.nextInt(5);
            System.out.println(curr);
            if(prev<curr){
                counter++;
            }
            prev = curr;
        }
        return counter;
    }
    
}
