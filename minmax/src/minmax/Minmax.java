
package minmax;

import java.util.Random;


public class Minmax {

   
    public static void main(String[] args) {
        int n = 5;
        Result res = new Result();
        
        searchNumber(n, res);
        System.out.println("Максимальное значение элемента: " + res.max);
        System.out.println("Минимальное значение элемента: " + res.min);
    }

    private static void searchNumber(int n, Result res) {
        
        int tmp;
        
        Random rnd = new Random();
        
        res.max = rnd.nextInt(10);
        System.out.println(res.max);
        res.min = res.max;
        for (int i = 1; i < n; i++) {
            tmp = rnd.nextInt(10);
            System.out.println(tmp);
            if(res.max < tmp) res.max = tmp;
            if(res.min > tmp) res.min = tmp;
        }
        
    }
}

class Result{
    int min;
    int max;
}