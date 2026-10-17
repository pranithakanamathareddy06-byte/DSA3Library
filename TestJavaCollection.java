import java.util.*;
class TestJavaCollection{
    public static void main(String[] args){
        ArrayList <String> list = new ArrayList <String>();
        list.add("sunny");
        list.add("harika");
        list.add("harini");
        list.add("kanna");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}