class Angle1{
    int length;
    int breadth;
    Angle1(){
        length = 10;
        breadth = 5;
    }
    Angle1(int l,int b){
        length = l;
        breadth = b;

    }
    int getArea(){
        return length * breadth;
    }
    int getPerimeter(){
        return 2 * (length + breadth);
    }
}
public class RectangleDemo1{
    public static void main(String[] args){
        Angle1 rec1 = new Angle1();
        Angle1 rec2 = new Angle1(20,15);
        System.out.println("area: " + rec1.getArea());
        System.out.println("perimeter: " + rec2.getArea());
        System.out.println("area: " + rec1.getPerimeter());
        System.out.println("perimeter: " + rec2.getPerimeter());

    }
}