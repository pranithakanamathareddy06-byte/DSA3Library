import java.util.*;
class Student2{
    int studentid;
    String name;
    String course;
    Student2(int studentid,String name,String course){

        this.studentid = studentid;
        this. name = name;
        this.course = course;
    }
    @Override
    public String toString() {
        return "studentid: " + studentid + ", name: " + name + ", course: " + course ;
    }
}
public class SARS {
    static ArrayList<Student2> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static void registerStudent(){
        System.out.println("Enter studentid: ");
        int id = sc.nextInt();
        System.out.println("Enter studentname: ");
        String name = sc.nextLine();
        System.out.println("Enter the course: ");
        String course = sc.nextLine();
        students.add(new Student2(id, name, course));
        System.out.println("student registered successfully!\n");
    }
    static void registerCourse(){
        System.out.println("enter the course details: ");
        System.out.println("course name: ");
        String course = sc.nextLine();
        System.out.println("course code: ");
        String code = sc.nextLine();
        System.out.println("course " + course + " (" + code + ") registration successfully!\n"); 
        
    }
    static void displayAll(){
        if(students.isEmpty()){
            System.out.println("No students registered yet.\n");
            return;
        }
        System.out.println("===== registered students =====");
        for(Student2 s : students){

            System.out.println(s);
        }
        System.out.println();

    }
    static void showMenu(){
        System.out.println("===== student admission/registration system (SARS) =====");
        System.out.println("1.register student");
        System.out.println("2.register course");
        System.out.println("3.display All students");
        System.out.println("4.Exit");
        System.out.println("enter your choice: ");
    }

public static void main(String[] args){
    int choice;
    do {
        showMenu();
        choice = sc.nextInt();
        sc.nextLine();
        switch(choice)
        {
            case 1 -> registerStudent();
            case 2 -> registerCourse();
            case 3 -> displayAll();
            case  4 -> System.out.println("exiting.. thankyou!");
            default -> System.out.println("Invalid choice! try again.\n");
    }

} while(choice != 4);
}
}