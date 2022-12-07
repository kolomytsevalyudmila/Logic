
package countrazn;

import java.util.Random;


public class CountRazn {

    
    public static void main(String[] args) {
        int n = 5;
        
        System.out.println("количество неповторяющихся значений последовательности " + razlCount(n));
    }

    private static int razlCount(int n) {
        int count = 1;
        int prev;
        int curr;
        
        Random rnd = new Random();
        prev = rnd.nextInt(3);
        System.out.println(prev);
        
        
        for (int i = 1; i < n; i++) {
            curr = rnd.nextInt(3);
            System.out.println(curr);
            if (prev == curr){ 
                prev = curr;
            }else if(prev != curr) {
                count ++;
            }
        }
        return count;
    
    }
    
}
