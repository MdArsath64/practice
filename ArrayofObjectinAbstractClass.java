abstract class Shape {
    abstract double area();
}
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }
    double area() {
        return side * side;
    }
}
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    double area() {
        return 0.5 * base * height;
    }
}
public class ArrayofObjectinAbstractClass {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];//array of object of abstract class
        shapes[0] = new Square(4);
        shapes[1] = new Triangle(3, 5);
        shapes[2] = new Square(2.5);
        shapes[3] = new Triangle(4, 6);

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.area());
        }
    }
}