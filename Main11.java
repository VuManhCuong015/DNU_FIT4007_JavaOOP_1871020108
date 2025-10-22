import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a = sc.nextInt();

        System.out.print("Nhập b: ");
        int b = sc.nextInt();

        SwapPair pair = new SwapPair(a, b);

        System.out.println("Trước khi hoán đổi:");
        pair.display();

        
        pair.swapWithTemp();
        System.out.println("Sau khi hoán đổi:");
        pair.display();

        
        pair = new SwapPair(a, b);
        pair.swapWithArithmetic();
        System.out.println("Sau khi hoán đổi:");
        pair.display();

        pair = new SwapPair(a, b);
        pair.swapWithXor();
        System.out.println("Sau khi hoán đổi:");
        pair.display();

        sc.close();
    }
}
