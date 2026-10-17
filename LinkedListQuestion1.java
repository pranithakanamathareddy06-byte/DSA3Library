class Node{
     int data;
     Node next;
     Node(int data){
        this.data = data;
        this.next = null;
     }
}
public class LinkedListQuestion1{
    public static void main(String[] args){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        Node head = n1;
        Node temp = head;
        Node second = head.next;
        temp.next = second.next;
        second.next = temp;
        head = second;
        temp = head;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
           

    }
}