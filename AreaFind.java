class Shape{
    double area(){
        System.out.println("Area not defined for generic shape.");
        return 0;
    }
}
class Circle extends Shape{
    double radius;
    Circle(double r){
        radius = r;
    }
    //  @Override
    double area(){
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape{
    double length;
    double width;
    Rectangle(double l,double w){
        length = l;
        width = w;
    }
    // @Override                      the @Override is not neccessary. it is used to check the compiler. it is better to keep it . 
    double area(){
        return length * width;
    }
}
class Triangle extends Shape{
    double height;
    double base;
    Triangle(double h,double b){
        height = h;
        base = b;
    }
    // @Override
    double area(){
        return 0.5 * height * base;
    }

}
public class AreaFind{
    public static void main(String[] args){
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(2,3);
        Shape s3 = new Triangle(3,4);
         System.out.println("Area of Circle: " + s1.area());
        System.out.println("Area of Rectangle: " + s2.area());
        System.out.println("Area of Triangle: " + s3.area());
    }
}