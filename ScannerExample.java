import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String Name = sc.nextLine();
        System.out.print("Enter the Age: ");
        int Age = sc.nextInt();
        System.out.print("Enter the Grade: ");
        double Grade = sc.nextDouble();
        System.out.println("\n--- StudentInfo ---");
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Grade: " + Grade);
        sc.close();
    }
    
}
