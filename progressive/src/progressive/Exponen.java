
package progressive;


public class Exponen {
    private int base;
    private int step;
    private int n;
    private String num;
    private boolean flag = true;

    public Exponen(int base, int step, int n) {
        this.base = base;
        this.step = step;
        this.n = n;
        calc();
    }
    
    public boolean isFlag(){
        return flag;
    }
    
    private void calc(){
        int prev;
        int curr;
        int step1;
        prev = base;
        curr = base * step;
        step1 = curr / prev;
        prev = curr;
        curr = step1;
        
        
        for (int i = 1; i < n; i++) {
            curr = prev * step;
            if (curr / prev != step1){
                flag = false;
                break;
            }
            prev = curr;
            
        }
    }

}

    
    
