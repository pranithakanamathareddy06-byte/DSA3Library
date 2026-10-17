class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
    public class LinearSearchLinkedList{
      
        static boolean linearSearch(Node head, int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


public static void main(String[] args){
        Node first = new Node(105);
        Node second = new Node(210);
        Node third = new Node(315);
        Node fourth = new Node(420);
        Node fifth = new Node(525);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        int key = 210;

        if (linearSearch(first, key)) {
            System.out.println("Book ID " + key + " is FOUND in Linked List");
        } else {
            System.out.println("Book ID " + key + " is NOT FOUND in Linked List");
        }

        System.out.println("\nLinked List elements:");

        Node temp = first;
    
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}