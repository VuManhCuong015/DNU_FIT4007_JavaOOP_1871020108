public class Person {
    private String name;
    public Person(String name){
        this.name = name;
    }
public int getNameLength(){
    return name.length();
}

public void displayLength(){
    System.out.println("do dai ten cua ban:"+ getNameLength());
}
    
}
