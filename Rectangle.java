public class Rectangle {
    private double length;
    private double width;

    public Rectangle  (double length,double width){
        this.length = length;
        this.width = width;

    }
    public double area(){//tinh dien tich hinh chu nhat 
        return length * width;

    }
    public double perimeter(){//tinh chu vi cua hinh chu nhat
        return 2 * (length * width);
    }
}
