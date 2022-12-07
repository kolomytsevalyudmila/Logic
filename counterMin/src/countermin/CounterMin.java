
package countermin;

import java.util.Scanner;


public class CounterMin {

    
    public static void main(String[] args) {
       int n = 5;
       
        System.out.println("количество неповторяющихся элементов " + rezMin(n));
    }

    private static int rezMin(int n) {
        int counter = 1;
        
        Scanner sc = new Scanner(System.in);
        int first;
        int next;
        first = sc.nextInt();
        for (int i = 1; i < n; i++) {
            next = sc.nextInt();
            if(first != next) counter++;
            first = next;
            
        }
        
        
        return counter;
        
        
    }
    
}
