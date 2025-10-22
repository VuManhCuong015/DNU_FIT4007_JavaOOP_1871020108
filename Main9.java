import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so a:");
        int a = scanner.nextInt();

        System.out.print("Nhap so b:");
        int b = scanner.nextInt();

        if (b==0){
            System.out.println("error b khong duoc bang 0");
        }else{
            Calculator calculator = new Calculator(a,b);
            calculator.displayResult();
        }
        scanner.close();
    }
}
