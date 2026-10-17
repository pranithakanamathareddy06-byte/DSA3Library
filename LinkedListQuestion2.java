class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;;
        this.next = null;
        this.prev = null;

    }
}
public class LinkedListQuestion2{
    public static void main(String[] args){
        Node n1 = new Node(5);
        Node n2 = new Node(6);
        Node n3 = new Node(7);
        Node n4 = new Node(8);
        n1.next = n2;
        n2.prev = n1;
        n2.next = n3;
        n3.prev = n2;
        n3.next = n4;
        n4.prev = n3;
        Node head = n1;

        System.out.println("before swapping");
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        Node first = head;
        Node second = head.next;
        first.next = second.next;
        if(second.next != null){
            second.next.prev = first;
        }
        second.prev = null;
        second.next = first;
        first.prev = second;
        head = second;

        System.out.println("After swapping:");
        temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    


    }
}