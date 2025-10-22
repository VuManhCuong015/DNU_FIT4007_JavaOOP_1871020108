import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lastnumber lastnumber = new Lastnumber();
        System.out.print("Enter number:");
        int number = scanner.nextInt();

        lastnumber.showResult(number);
        scanner.close();
    }
    
}
