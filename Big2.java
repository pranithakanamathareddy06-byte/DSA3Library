import java.util.Scanner;
class Big2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        if(a > b){
            System.out.println(a + " is Big. ");
        }
        else{
            System.out.println(b + " is Big. ");
        }
        sc.close();

    }
}