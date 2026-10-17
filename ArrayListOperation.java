import java.util.ArrayList;
public class ArrayListOperation{
    public static void main(String[] args){
        ArrayList<String>fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("mango");
        System.out.println("Fruits: " + fruits);
        System.out.println("First fruit: " + fruits.get(0));
        fruits.set(1,"orange");
        fruits.remove("mango");
        System.out.println("updated fruits: "+ fruits);
        System.out.println("number of fruits: " + fruits.size());

    }/
}