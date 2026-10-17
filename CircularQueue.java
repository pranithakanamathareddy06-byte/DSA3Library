class CircularQueue {

    int size = 5;
    int[] queue = new int[size];
    int front = -1, rear = -1;

    void enqueue(int data) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is Full");
            return;
        }

        if (front == -1) front = 0;

        rear = (rear + 1) % size;
        queue[rear] = data;
        System.out.println(data + " inserted");
    }

    void dequeue() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(queue[front] + " deleted");

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue elements: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.display();

        cq.dequeue();
        cq.display();

        cq.enqueue(40);
        cq.enqueue(50);
        cq.enqueue(60);
        cq.display();
    }
}
