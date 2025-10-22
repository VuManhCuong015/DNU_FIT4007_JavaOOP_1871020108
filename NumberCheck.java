public class NumberCheck{
    private int number;

    public NumberCheck(int number){
        this.number = number;
    }

    public boolean isNaturalNumber(){
        if(number > 0){
            return true;
        }else {
            return false;
        }
        }
    }
