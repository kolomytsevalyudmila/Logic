
package scannercounterrazl;

import java.util.Scanner;


public class ScannerCounterRazl {

    
    public static void main(String[] args) {
        int n = 6;
        
        System.out.println("Количество различных значений последовательност: " + razlCount(n));
    }

    private static int razlCount(int n) {
        int count = 1;
        int prev;
        int curr;
        
        Scanner sc = new Scanner(System.in);
        prev = sc.nextInt();
        
        for (int i = 1; i < n; i++) {
            curr = sc.nextInt();
            if(prev != curr){
                count++;
            }
            prev = curr;
        }
        return count;
    }
    
}
