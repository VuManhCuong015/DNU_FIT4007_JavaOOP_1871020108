import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.print("Nhap tuoi sinh vien:");
        int age  = scanner.nextInt();

        scanner.close();

        Student student = new Student(age);

        if (student.isValid()){
            int birthYear = student.calculateBirthYear();
            System.out.println("Nam sinh cua sinh vien la:"+ birthYear);
            System.out.println("Tuoi cua sinh vien tinh den nam 2023 la:"+ student.getAge());
        }else{
            System.out.println("khong the tinh tuoi vui long chon tuoi phu hop:");

        }
    }
}