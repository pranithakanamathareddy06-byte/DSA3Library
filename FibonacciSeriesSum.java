import java.util.Scanner;
public class FibonacciSeriesSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int a = 0, b = 1,sum = 1;
        for(int i = 3; i <= number; i++){
            int next = a + b;
            a = b;
            b = next;
            sum+=next;
        }
        System.out.println("sum = " + sum);
        sc.close();
    }
}