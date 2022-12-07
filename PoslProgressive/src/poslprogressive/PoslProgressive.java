
package poslprogressive;

import java.util.Random;


public class PoslProgressive {

   
    public static void main(String[] args) {
        int n = 20;
    System.out.println(randNumber(n));
    }

    public static int randNumber(int n) {
         int numb = 0;
         int x;
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            x= rnd.nextInt(100);
            System.out.println(x);
            numb = x;
                   
        }
        return (int)n;
        }

}

public abstract class Liner{
    
}
    