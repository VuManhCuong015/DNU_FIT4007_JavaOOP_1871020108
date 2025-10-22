public class Swap {
    private int a;
    private int b;
    
    public Swap(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void swapNumbers() {
        a = a + b;
        b = a - b;
        a = a - b;
    }


    public void showResult() {
       System.out.println("Sau khi hoan doi: a = " + a + ", b = " + b);
    }
}
