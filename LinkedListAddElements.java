class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListAddElements {
    public static void main(String[] args) {

        Node first = new Node("pranitha");
        Node second = new Node("juhith");
        Node third = new Node("sunny");

        first.next = second;
        second.next = third;

        Node newNode = new Node("harika");
    
        Node temp = first;
        while (temp != null) {
            temp = temp.next;
        }
        temp.next = newNode;

        temp = first;
        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
