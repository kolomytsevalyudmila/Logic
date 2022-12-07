
package sequence;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Sequence {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел в последовательности");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ввведите число для определения");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            if(array[i+1]>array[i])
                System.out.println("Индекс наибольшего элемента последовательности: "+ i);
            
        }
    }
    
}
