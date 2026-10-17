class Calculator{
    Calculator(int a,int b){
        System.out.println("sum(int): " + (a + b));
    }
    Calculator(double a,double b){
        System.out.println("sum(double): " + (a + b));
    }
    Calculator(String a,String b){
        System.out.println("concatenation: " + (a + b));
    }
}
public class ConstructorTypeDemo{
    public static void main(String[] args){
        Calculator c1 = new Calculator(5,10);
        Calculator c2 = new Calculator(5.5,6.6);
        Calculator c3 = new Calculator("hello", "world");
    }
}