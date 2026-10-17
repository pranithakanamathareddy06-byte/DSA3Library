public class PowerRecursion{
    static int power(int a,int b){
        if(b == 0)
        return 1;
        else
        return a * power(a,b - 1);

    }
    public static void main(String [] args){
        int a = 2, b = 6;
        System.out.println(a + " raised to the power " + b + " is: " + power(a,b));
    }
}