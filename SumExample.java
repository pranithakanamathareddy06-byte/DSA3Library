import java.util.Scanner;
public class SumExample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number(N) : ");
        int N = sc.nextInt();
        int evensum = 0;
        int oddsum = 0;
        int i = 1;
        for(i = 1; i <= N; i++){
            if((i % 2) == 0){
                evensum += i;
            }
            else{
                oddsum += i;
            }
        } 
        System.out.println("evensum is : " + evensum);
        System.out.println("oddsum is : " + oddsum);
        sc.close();
        
        
        
        
    }
}