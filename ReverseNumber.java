import java.util.Scanner;
public class ReverseNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Nmber(N): ");
        int N = sc.nextInt();
        int reversed = 0;
        while(N != 0){
            int digit = N % 10 ;
            reversed = reversed * 10 + digit;
            N = N / 10;
        }
        
        System.out.println("Reversed number is " + reversed);
        sc.close();
    }
}