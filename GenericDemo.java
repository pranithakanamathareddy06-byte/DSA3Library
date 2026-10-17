class Box<T>{
    private T value;
    public void set(T value){
        this.value = value;
    }
    public T get(){
        return value;
    }
}
public class GenericDemo{
    public static void main(String[] args){
        Box <Integer> IntBox = new Box<>();
        IntBox.set(100);
        System.out.println("Integer Box: " + IntBox.get());
        Box <String> strBox = new Box<>();
        strBox.set("Hello Generics");
        System.out.println("String Box: " + strBox.get());
    }
}