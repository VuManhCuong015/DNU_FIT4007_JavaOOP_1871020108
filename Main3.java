
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Nhap chieu dai cua hinh chu nhat:");
        double length = scanner.nextDouble();
        System.out.println("Nhap chieu rong cua hinh chu nhat:");
        double width = scanner.nextDouble();

        //close scanner 
        scanner.close();
        //truyen gia tri vua roi vao constructor 
        Rectangle rectangle = new Rectangle(length,width);

        //tinh toan chu vi va dien tich
        double area = rectangle.area();
        double perimeter = rectangle.perimeter();
        
        //in ra ket qua 
        System.out.println("Diện tích hình chữ nhật là: " + area);
        System.out.println("Chu vi hình chữ nhật là: " + perimeter);
    
    }
}
