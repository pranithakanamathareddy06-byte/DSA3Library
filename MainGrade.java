class Student{
    String name;
    int rollno;
    int[] marks;
    Student(String n,int r,int[] m){
        name = n;
        rollno = r;
        marks = m;
    }
   
        double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    // Method to display grade based on average
    void displayGrade() {
        double avg = calculateAverage();
        char grade;

        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 75) {
            grade = 'B';
        } else if (avg >= 60) {
            grade = 'C';
        } else if (avg >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display all details
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Average Marks: " + avg);
        System.out.println("Grade: " + grade);
        System.out.println("-----------------------------");
    }
}

public class MainGrade {
    public static void main(String[] args) {
        // Marks for 3 students
        int[] marks1 = {95, 88, 90};
        int[] marks2 = {76, 82, 70};
        int[] marks3 = {45, 60, 55};

        // Creating objects
        Student s1 = new Student("Pranitha", 1, marks1);
        Student s2 = new Student("Aarav", 2, marks2);
        Student s3 = new Student("Diya", 3, marks3);

        // Displaying their grades
        s1.displayGrade();
        s2.displayGrade();
        s3.displayGrade();
    }
}