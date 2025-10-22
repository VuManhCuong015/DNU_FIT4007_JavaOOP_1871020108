import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap ten cua ban:");
        String name = scanner.nextLine();

        Person person = new Person(name);
        person.displayLength();
        scanner.close();
    }
}
