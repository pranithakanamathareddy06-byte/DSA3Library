import java.util.Scanner;
class CheckArmstrongNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int number = sc.nextInt();
        int original = number;
        int result = 0;
        while(number != 0){
        int digit = number % 10;
         result = result + (digit * digit * digit) ;
         number = number / 10;
        }
         if (result == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        sc.close();


    
}
}