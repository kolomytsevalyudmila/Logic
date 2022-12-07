
package sravnposled;

import java.util.Scanner;


public class SravnPosled {

   
    public static void main(String[] args) {
        
        int n = 5;
        boolean rez = sravnPosled(n);
        
        if (rez) System.out.println("Все равны");
        else System.out.println("Не равны");
         
    }

    private static boolean sravnPosled(int n) {
        
        Scanner sc = new Scanner(System.in);
        int first;
        int next;
        first = sc.nextInt();
        for (int i = 1; i < n; i++) {
            next = sc.nextInt();
            if (first != next)
                return false;
        }
        return true;
    }
    
}
