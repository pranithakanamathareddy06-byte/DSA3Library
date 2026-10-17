import java.util.Scanner;
class MultiplicationTableHA3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number: ");
        int n = sc.nextInt();
         System.out.println("Multiplication Table of " + n + ":");
        for(int i = 1; i <= 10; i++){
            System.out.println("Multiplication of " + n + " * " + i + " is " + (n * i));
        }
        sc.close();
    }
}