// import java.util.Scanner;
// public class SumSir{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         int sum = 0;
//         for(; n > 0; n = n / 10){
//             sum = sum + n % 10;
//         }
//         while(n > 0){
//         int digit = n % 10;
//         sum = sum + digit;
//         n = n / 10;
//         }
//         System.out.println(sum + " is the sum of the digits of the entered number");
//     }
// }


// import java.util.Scanner;
// public class SumSir{
   
//     static int sumDigits(int n){
//          if(n == 0)
//         return 0;
//     else
//         return (n % 10) + sumDigits(n / 10);
// }
// public static void main(String[] args){
//      Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         int sum = sumDigits(n);
//          System.out.println(sum + " is the sum of the digits of the entered number");



// }   
// }


// public class SumSir{
//     public static void main(String[] args){
//         int n = 546;
//         int digit;
//         int sum =  0;
//         while(n > 0){
//              int t = (n / 10) * 10;
//             digit = n - t;
//             sum = sum + digit;
//             n = n / 10;
     
//        }
//        System.out.println(sum);
//     }
// }


import java.util.Scanner;
public class SumSir{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        String numString = Integer.toString(n);
        int length = numString.length();
        int[] digits = new int[length];
        for( int i = 0; i < length; i++){
            digits[i] = numString.charAt(i) - '0';
        }
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += digits[i];
        }
        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}

