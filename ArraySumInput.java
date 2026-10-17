import java.util.Scanner;
public class ArraySumInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        int sum = 0;
        System.out.println("Enter the numbers: ");
        for(int i = 0; i < number.length; i++){
            number[i] = sc.nextInt();
        }
        for(int i = 0; i < number.length; i++){
            sum = sum + number[i];
        }
        System.out.println("sum is " + sum);
        sc.close();
    }

}