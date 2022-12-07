
package flagsequence;

import java.util.Scanner;


public class FlagSequence {

    
    public static void main(String[] args) {
        int n = 6;
        
        System.out.println("Количество участков постоянства: " + stableNum(n));
    }

    private static int stableNum(int n) {
        
        int prev;
        int curr;
        int counter = 0;
        boolean flag = false;
    
        Scanner sc = new Scanner(System.in);
        prev = sc.nextInt();
        for (int i = 1; i < n; i++) {
            curr = sc.nextInt();
            if(prev == curr){
                if(flag == false){
                    counter++;
                    flag = true;
                }
            }
            else flag = false;
            prev = curr;
        }
        return counter;
    }
    
}
