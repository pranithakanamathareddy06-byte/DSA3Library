class Person{
    String name;
    int age;
    void Displayinfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person{
    String course;
    void displaycourse(){
        System.out.println("Course: " + course);
    }
}
    public class InheritanceDemo{
        public static void main(String[] args){
            Student s1 = new Student();
            s1.name = "ravi";
            s1.age = 23;
            s1.course = "java programming";
            s1.Displayinfo();
            s1.displaycourse();
        }

    }
