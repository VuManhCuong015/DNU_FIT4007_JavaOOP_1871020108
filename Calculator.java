public class Calculator {
    private int a;
    private int b;



    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public double divide(){
        return(double)a/b;
    }
    public void displayResult(){
        System.out.println(a+"/"+b+"="+divide());;
    }
}
