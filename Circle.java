public class Circle {
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    public double getChuVi(){
        return 2 * Math.PI * radius;
    }

    public double getDienTich(){
        return Math.PI * radius * radius;
    }
}
