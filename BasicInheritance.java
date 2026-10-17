interface Animal{
    void eat();
    void sleep();
}
class Dog implements Animal{
    public void eat(){
        System.out.println("Dog eats food");
    }
    public void sleep(){
        System.out.println("Dog sleeps");
    }

}
public class BasicInheritance{
    public static void main(String[] args){
        Animal a = new Dog();
        a.eat();
        a.sleep();
    }
}