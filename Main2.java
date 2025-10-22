import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        double r = sc.nextDouble(); // Khai báo và gán giá trị cho r

        Circle c = new Circle(r);

        System.out.println("Chu vi hình tròn = " + c.getChuVi());
        System.out.println("Diện tích hình tròn = " + c.getDienTich());
    }
}
