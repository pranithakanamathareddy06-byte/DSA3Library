interface printable{
    void print();
}
interface showable{
    void show();
}
class Demo implements printable,showable(){
    public  void print(){
        System.out.println("printing...");
    }
    public void show(){
        System.out.println("Showing...");
    }
}
public class Main{
    public static void main(String[] args){
        Demo d = new Demo();
        d.print();
        d.show();

    }
}