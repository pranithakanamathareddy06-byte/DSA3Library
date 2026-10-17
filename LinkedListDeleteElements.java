class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedListDeleteElements{
    public static void main(String[] args){
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);
        Node fourth = new Node(50);

        first.next = second;
        second.next = third;
        third.next = fourth;

        Node temp = first.next;
        temp.next = temp.next.next;

        temp = first;
        
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}