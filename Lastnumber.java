public class Lastnumber {
    public int getLastDigit (int number){
        return Math.abs (number % 10);
    }
    public void showResult(int number){
        int lastDigit = getLastDigit(number);
        System.out.println("number:"+number);
        System.out.println("Last number:"+lastDigit);
        
    }
}
