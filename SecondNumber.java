public class SecondNumber {
    public int getSecondNumber(int number){
        int absoluteNumber = Math.abs(number);
        return (absoluteNumber / 10) % 10;
    }
public boolean checkSecondNumberIsEven(int number){
    return Math.abs(getSecondNumber(number)) > 9;
}
public void showResult (int number,int secondNumber, boolean isEven){
    System.out.println("so nguyen:"+number);
    System.out.println("Chu so gan cuoi:" +secondNumber); 
    }
}