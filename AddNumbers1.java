import java.util.Scanner;
public class AddNumbers1{
    static int add(int a,int b){
    return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = sc.nextInt();
        System.out.print("Enter the second number: ");
        int second = sc.nextInt();
        int result = add(first,second);
        System.out.println("sum = " + result);
    }
}