import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Nhap a:");
        int a = scanner. nextInt();
        System.out.println("Nhap b:");
        int b = scanner. nextInt();

        Swap swap = new Swap(a, b);

        swap.swapNumbers();
        swap.showResult();
    }
}
