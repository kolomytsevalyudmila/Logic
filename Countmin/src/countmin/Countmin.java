
package countmin;

import java.util.Random;


public class Countmin {

   
    public static void main(String[] args) {
        int n = 10;
        Result res = new Result();
        
        searchResult(n, res);
        System.out.println("Повторяющихся максимальных элементов: " + res.Max);
        System.out.println("Повторяющихся минимальных элементов: " + res.Min);
    }

    private static int searchResult(int n, Result res) {
        
        int tmp;
        int counter = 0;
        
        Random rnd = new Random();
        int first = rnd.nextInt(10);
        System.out.println(res.Max);
        res.Min = res.Max;
        for (int i = 1; i < n; i++) {
            tmp = rnd.nextInt(5);
            System.out.println(tmp);
            if(res.Min > tmp)
            {
                res.Min = tmp;
                counter++;
               
            }
           if(res.Max < tmp)
           {
              res.Max = tmp;
              counter++;
            }
            
        }
        return counter;
    }
}
    
    class Result{
        int Min;
        int Max;
    }

    

