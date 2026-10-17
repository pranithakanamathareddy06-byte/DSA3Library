class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;  // πr²
    }

    double circumference() {
        return 2 * Math.PI * radius;  // 2πr
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle(5);  // Example: radius = 5

        System.out.println("Radius: " + c.radius);
        System.out.println("Area of Circle: " + c.area());
        System.out.println("Circumference of Circle: " + c.circumference());
    }
}
