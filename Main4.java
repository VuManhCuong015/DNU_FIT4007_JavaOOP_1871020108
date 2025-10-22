import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tinh toan tam giac");

        //nhap so lieu vao code 
        System.out.println("Nhap do dai canh a ");
        double a = scanner.nextDouble();

        System.out.println("Nhap do dai canh b ");
        double b = scanner.nextDouble();

        System.out.println("Nhap do dai canh c ");
        double c = scanner.nextDouble();

        scanner.close();


        Triangle triangle = new Triangle(a,b,c);


        if (triangle.isValid()){
            double perimeter = triangle.calulatePerimeter();
            double area = triangle.caculateArea();

            System.out.println("Chu vi cua tam giac la:"+perimeter);
            System.out.println("Dien tich cua tam giac la:"+area);
        }
        else{
            System.out.println("Loi khong the tinh toan");
        }


    }
    
}
