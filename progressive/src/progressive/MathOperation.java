
package progressive;


public class MathOperation {
    public static void main(String[] args){
        Arifm arifm = new Arifm(1, 5, 10);
        Exponen exponen = new Exponen(3, 9, 5);
        
        System.out.println("Арифметическая прогрессия: " + arifm.isFlag());
        System.out.println("Геометрическая прогрессия: " + exponen.isFlag());
        
        
    }
}
