abstract class Shape{
    abstract double area();
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    double area(){
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implement abstract method
    @Override
    double area() {
        return 0.5 * base * height;
    }
}
public class ShapeDemoAbstract{
    public static void main(String[] args){
        Shape c = new Circle(5); 
        Shape t = new Triangle(4, 6);

        System.out.println("Circle Area = " + c.area());
        System.out.println("Triangle Area = " + t.area());
    }
}