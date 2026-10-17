public class LinkedListBubbleSortSLL {

   
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

       
        Node n1 = new Node(10);
        Node n2 = new Node(5);
        Node n3 = new Node(8);
        Node n4 = new Node(3);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

      
        Node head = n1;

        System.out.println("Before Sorting:");
        printList(head);

    
        boolean swapped;
        do {
            swapped = false;
            Node current = head;

            while (current.next != null) {
                if (current.data > current.next.data) {
                   
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);

        System.out.println("\nAfter Sorting:");
        printList(head);
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
