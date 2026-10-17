import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b + " ");
        for(int i = 3; i <= number; i++){
            int next = a + b;
            System.out.println(next + " ");
            a = b;
            b = next;
        }
        sc.close();
    }
}