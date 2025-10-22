public class Triangle{
    private double a;
    private double b;
    private double c;

    public Triangle(double a,double b,double c){
       //kiem tra hop le trong constructor 
       if(a>0 && b>0 && c>0 && (a + b > c) && (a + c > b) && (b + c > a)){
        //neu hop le gan gia tri
        this.a = a;
        this.b = b;
        this.c = c;
       } else {
        //neu khong hop le in thong bao loi va dat cac canh ve 0
        System.err.println("Error: ba canh cua tam giac khong hop le");
        this.a = 0;
        this.b = 0;
        this.c = 0;
       }
    }

//cong thuc tinh chu vi
public double calulatePerimeter(){
    return a+b+c;
    }
    //cong thuc tinh dien tich heron 
public double caculateArea(){
    if (a == 0 && b == 0 && c == 0){
        return 0;//tra ve 0 neu khong neu tam giac khong hop le
    }
    //tinh nua chu vi
    double s = calulatePerimeter() / 2;

    //ap dung cong thuc heron 
    double areaSquared = s * (s - a) * (s - b) * (s - c);

    //tham khao chat gpt dung math.sqrt de tinh can bac hai(sqrt)
    return Math.sqrt(Math.max(areaSquared, 0)); //tra ve gia tri duong hoac 0 neu gia tri am
    }
public boolean isValid (){
    return this.a>0 &&this.b>0&& this.c>0;
    }
}
