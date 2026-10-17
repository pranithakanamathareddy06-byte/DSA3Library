import java.util.Scanner;
public class TwoDArrayInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] marks = new int[2][3];
        System.out.println("Enter the marks for 2 students (3 subjects each): ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                marks[i][j] = sc.nextInt();

            }
        }
        System.out.println("marks table: ");
        for(int i = 0; i < 2; i++){
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
        }
