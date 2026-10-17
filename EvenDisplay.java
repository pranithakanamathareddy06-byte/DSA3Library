import java.util.Scanner;
public class EvenDisplay {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number (N): ");
        int N = sc.nextInt();
        int evensum = 0;
        int i = 1;
        for(i = 1; i <= N; i++){
            if((i % 2) == 0){
                System.out.println(" " +i);
    
            }
        } 
        sc.close();
    }
    
}
