class Person{
    private String name;
    private int age;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        if(a >= 0 && a <= 120){
            age = a;
        }
        else{
            System.out.println("Invalid age!");
        }
    }
    public int getAge(){
        return age;
    }
}
public class PersonDemo{
    public static void main(String[] args){
        Person p = new Person();
        p.setName("pranitha");
        p.setAge(17);
        // p.setAge(-5);
        System.out.println("name: " + p.getName());
        System.out.println("age: " + p.getAge());

    }
}