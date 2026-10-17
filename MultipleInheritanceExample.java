interface A{
    default void display(){
        System.out.println("display from A");
    }
}
interface B{
    default void display(){
        System.out.println("display from B");
    }
}
class C implements A,B{
    public void display(){
        System.out.println("Resolved in class C");
        A.super.display();
        B.super.display();
    }
}
public class MultipleInheritanceExample{
    public static void main(String[] args){
        C obj = new C();
        obj.display();
    }
}