class Node {
    int data;
    int priority;
    Node next;
    Node prev;

    Node(int data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
        this.prev = null;
    }
}

public class PriorityQueueLinkedList {
    Node head = null;


    void enqueue(int data, int priority) {
        Node newNode = new Node(data, priority);

    
        if (head == null) {
            head = newNode;
        }

        else if (priority > head.priority) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
       
        else {
            Node temp = head;

            while (temp.next != null && temp.next.priority >= priority) {
                temp = temp.next;
            }

            newNode.next = temp.next;

            if (temp.next != null) {
                temp.next.prev = newNode;
            }

            temp.next = newNode;
            newNode.prev = temp;
        }

        System.out.println("Enqueued: " + data + " (Priority: " + priority + ")");
    }

    void dequeue() {
        if (head == null) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Dequeued: " + head.data);
        head = head.next;

        if (head != null) {
            head.prev = null;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = head;
        System.out.println("Priority Queue Elements:");
        while (temp != null) {
            System.out.println("Data: " + temp.data + 
                               " Priority: " + temp.priority);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        PriorityQueueLinkedList P = new PriorityQueueLinkedList();

        P.enqueue(10, 1);
        P.enqueue(20, 2);
        P.enqueue(30, 3);
        P.enqueue(40, 4);

        P.display();

        P.dequeue();
        P.dequeue();

        P.display();
    }
}
