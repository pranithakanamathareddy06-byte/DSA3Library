class Box{
    private double length;
    private double breadth;

    public void setlength(double l){
        length = l;
    }
    public void setbreadth(double b){
        breadth = b;
    }
    public double getlength(){
        return length;
    }
    public double getbreadth(){
        return breadth;
    }
    public double getArea(){
        return length * breadth;
    }
}
public class BoxDemo{
    public static void main(String[] args){
        Box b1 = new Box();
        b1.setlength(5.0);
        b1.setbreadth(3.0);
        System.out.println("length: " + b1.getlength());
         System.out.println("breadth: " + b1.getbreadth());
          System.out.println("Area: " + b1.getArea());

    }
}