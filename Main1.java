class Animal{
    protected String name;
    private String type;
    int age;
    Animal(String name,String type,int age){
        this.name = name;
        this.type = type;
        this.age = age;
    }
    public String getType(){
        return type;
    }

}
class Dog extends Animal{
    public Dog(String name,String type,int age){
        super(name,type,age);
    }
        public void printDetails() {
        System.out.println("Name: " + name);       // protected field, accessible
        System.out.println("Type: " + getType());  // private field, use getter
        System.out.println("Age: " + age);         // default field, accessible in same file

    }
}
public class Main1{
    public static void main(String[] args){
        Dog d = new Dog("buddy","canine",5);
        d.printDetails();

    }
}