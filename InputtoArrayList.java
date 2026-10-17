import java.util.*;
public class InputtoArrayList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String>names = new ArrayList<String>();
        System.out.println("Enter 3 students names: ");
        for(int i = 0; i < 3; i++){
            names.add(sc.nextLine());
        }
        System.out.println("Student names: ");
        for(String name: names){
            System.out.println(name);
        }
    }
}