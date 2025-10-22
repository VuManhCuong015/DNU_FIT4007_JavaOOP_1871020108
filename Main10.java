import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Nhap vao mot ky tu:");
        char ch = scanner.next().charAt(0);

        if(ch < 'a' || ch > 'y'){
            System.out.println("Ky tu khong hop le. Vui long nhap ky tu tu 'a' den 'y'.");
        } else {
            NextChar nextChar = new NextChar(ch);
            nextChar.displayNextChar();
        }
        scanner.close();
    }
    
}
