
package sravnull;

import java.util.Random;


public class SravNull {

   
    public static void main(String[] args) {
        
        Result rez = new Result();
        int n = 10;
        
        nullCounter(n, rez);
        System.out.println("Положительных чисел: " + rez.counterPos);
        System.out.println("Нулевых значений: " +   rez.counterNull);
        System.out.println("Отрицательных значений: " + rez.counterNeg);
    }

    private static void nullCounter(int n, Result rez) {
        
        Random rnd = new Random();
        int d;
        for (int i = 0; i < n; i++) {
            d = rnd.nextInt(11) - 5;
            System.out.println(d);
            if (d > 0) rez.counterPos++;
            else if (d == 0) rez.counterNull++;
            else rez.counterNeg++;
        }
        
    }
    
}

class Result{
    int counterPos;
    int counterNeg;
    int counterNull;
}