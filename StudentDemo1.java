class Student1{
    int id;
    String name;
    String course;
    Student1(int id,String name,String course){
        this.id = id;
        this.name = name;
        this.course = course;

    } 
    void displayinfo(){
        System.out.println("studentid: " + id);
         System.out.println("name: " + name);
          System.out.println("course: " + course);
    }
}
public class StudentDemo1{
    public static void main(String[] args){
        Student1 s1 = new Student1(101,"raja","java");
        Student1 s2 = new Student1(102,"pranav","python");
        s1.displayinfo();
        s2.displayinfo();
    }

}