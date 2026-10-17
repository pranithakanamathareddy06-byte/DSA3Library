import java.util.Scanner;
public class ArrayExample2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        System.out.println("Enter the marks of 5 students: ");
        for(int i = 0; i < marks.length;i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("your entered: ");
        for(int i = 0; i < marks.length;i++){
            System.out.println("student " + (i + 1) + ": " + marks[i]);
        }
        sc.close();

    }
}