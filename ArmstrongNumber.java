import java.util.Scanner;
public class ArmstrongNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number(N): ");
        int N = sc.nextInt();
        int result = 0;
        int original = N;
        while(N != 0){
            int digit = N % 10 ;
            result += digit * digit * digit;
            N = N / 10;
        }
        if(original == result){
            System.out.println(original + " is aarmstrong number");
        }
        else{
            System.out.println(original + " is not a armstrong number");
        }
        sc.close();
    }
}