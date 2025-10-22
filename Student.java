public class Student {
    private int age;

    private static final int CURRENT_YEAR = 2023;

    public Student(int age){
        if (age>0 && age < 120){
            this.age = age;
        }else{
            System.err.println("Error:Tuoi nhap vao ko dung");
            this.age  = 0;

        }
    }
    public int calculateBirthYear(){
        if(this.age <= 0){
            return 0 ;
        }
        return CURRENT_YEAR - this.age;
    }
    public boolean isValid(){
        return this.age > 0;
    }
    public int getAge(){
        return this.age;
    }
}
