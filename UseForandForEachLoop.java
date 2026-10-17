import java.util.ArrayList;
public class UseForandForEachLoop{
    public static void main(String[] args){
        ArrayList<Integer>numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("using for loop: ");
        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        System.out.println("using for each loop: ");
        for(int n : numbers){
            System.out.println(n);
        }
    }
}