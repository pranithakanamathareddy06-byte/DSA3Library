import java.util.Scanner;
class GradeCalculatorHA2{
     public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the MarksObtained: ");
        double marksObtained = sc.nextDouble();
        System.out.println("Enter the TotalMarks: ");
        double TotalMarks = sc.nextDouble();
        double percentage = (marksObtained / TotalMarks) * 100;
        System.out.println("Percentage is " + percentage + " %");
        
        if(percentage > 90 && percentage < 100){
            System.out.println("Grade A");
        }
        else if(percentage > 80 && percentage < 89){           
            System.out.println("Grade B");
        }
        else if(percentage > 70 && percentage < 79){
               System.out.println("Grade B");
        }
        else if(percentage > 60 && percentage < 69){
             System.out.println("Grade C");
        }
        else if(percentage > 50 && percentage < 59){
               System.out.println("Grade D");
        }
        else if (percentage >= 0 && percentage <= 49) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid marks entered");
        } 
        sc.close();
    }
}