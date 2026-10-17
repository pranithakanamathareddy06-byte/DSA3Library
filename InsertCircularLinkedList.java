class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class InsertCircularLinkedList{
    public static void main(String[] args){
        Node n1 = new Node(4);
        Node n2 = new Node(5);
        Node n3 = new Node(6);
        Node n4 = new Node(7);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n1;
        Node head = n1;

        Node newBegin = new Node(3);

        if(head == null){
            newBegin.next = newBegin;
            head = newBegin;
        }
        
        else{
            Node temp = head;
    
            while(temp.next != head){
            temp = temp.next;
            }

             newBegin.next = head;
             temp.next = newBegin;
             head = newBegin;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while(temp != head);

    
 }
}