import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nhap so nguyen a");
            int a  = input.nextInt();

        System.out.print("nhap so nguyen b");
                int b  = input.nextInt();

        System.out.println("Tong:"+(a+b));
        System.out.println("Hieu"+(a-b));
        System.out.println("Tich"+(a*b));
        System.out.println("Thuong (kieu nguyen"+ (a/b));

        input.close();


    }
}