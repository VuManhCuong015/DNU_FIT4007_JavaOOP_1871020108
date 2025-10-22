public class SwapPair {
    private int a;
    private int b;

    
    public SwapPair(int a, int b) {
        this.a = a;
        this.b = b;
    }

  
    public int getA() {
        return a;
    }

   
    public int getB() {
        return b;
    }

   
    public void swapWithTemp() {
        int temp = a;
        a = b;
        b = temp;
    }

    
    public void swapWithArithmetic() {
        a = a + b;
        b = a - b;
        a = a - b;
    }

   
    public void swapWithXor() {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }

    
    public void display() {
        System.out.println("a = " + a + ", b = " + b);
    }
}
