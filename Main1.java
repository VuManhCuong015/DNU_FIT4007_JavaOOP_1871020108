import  java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Nhap mot so nguyen: ");
        int N = scanner.nextInt();

        NumberCheck numberCheck = new NumberCheck(N);


        //if else de kiem tra ket qua
        if(numberCheck.isNaturalNumber()){
            System.out.println(N + " la so tu nhien");
        } else {
            System.out.println(N + " khong phai la so tu nhien");
        }
        scanner.close();
    }
    
}
