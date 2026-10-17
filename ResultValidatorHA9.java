import java.util.*;
class InvalidMarksException extends Exception {
    InvalidMarksException(String message) {
        super(message);
    }
}

class Student {
    String name;
    int marks;

    Student(String name, int marks) throws InvalidMarksException {
        this.name = name;
        validateMarks(marks);
        this.marks = marks;
    }
    void validateMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100.");
        }
    }
    String getResult() {
        if (marks >= 35)
            return "Pass";
        else
            return "Fail";
    }
}

public class ResultValidatorHA9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks (0-100): ");
            int marks = sc.nextInt();

            Student s = new Student(name, marks);

            System.out.println("\n--- Student Result ---");
            System.out.println("Name : " + s.name);
            System.out.println("Marks: " + s.marks);
            System.out.println("Result: " + s.getResult());
        }
        catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter only numbers for marks.");
        }
    }
}
