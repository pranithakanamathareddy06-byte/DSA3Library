import java.util.*;
class TestJavaCollection2{
    public static void main(String[] args){
        LinkedList <String> al = new LinkedList <String>();
        al.add("sunny");
        al.add("harika");
        al.add("harini");
        al.add("kanna");
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}