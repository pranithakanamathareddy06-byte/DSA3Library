import java.io.*;
class Student implements Serializable{
    private static final long SerialVersionUID = 1L;
    private String name;
    private int age;
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name: " + name + ", age: " + age);
    }
    public class SeriializableDemo{
        public static void main(String[] args){
            String fileName = "Student"
        }
    }
}