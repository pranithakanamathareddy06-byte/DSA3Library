import java.util.Scanner;
public class PalindromeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number(N): ");
        int N = sc.nextInt();
        int reversed = 0;
        int number = N;
        while(N != 0){
            int digit = N % 10 ;
            reversed = reversed * 10 + digit;
            N = N / 10;
        }
        if(number == reversed){
            System.out.println( number + " is a palindrome");
        }
        else{
            System.out.println(number + " is not a palindrome");
        }
        sc.close();
    }
}
