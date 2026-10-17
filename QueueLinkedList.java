class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front, rear;

    Queue() {
        front = null;
        rear = null;
    }

    void Enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            System.out.println("Enqueued: " + data);
            return;
        }

        rear.next = newNode;
        rear = newNode;
        System.out.println("Enqueued: " + data);
    }

    void Dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        int data = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        System.out.println("Dequeued: " + data);
    }

    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Queue elements:");
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);

        q.display();

        q.Dequeue();
        q.Dequeue();

        q.display();
    }
}
