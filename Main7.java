import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        SecondNumber processcor = new SecondNumber();
        System.out.println("Nhap vao mot so nguyen co it nhat 2 so:");
        int number = scanner.nextInt();
        
        if (Math.abs(number) < 10) {
            System.out.println("Vui long nhap so nguyen co it nhat 2 chu so.");
        } else {
            int secondNumber = processcor.getSecondNumber(number);
            boolean isEven = processcor.checkSecondNumberIsEven(number);
            processcor.showResult(number, secondNumber, isEven);
        }
    }
}
