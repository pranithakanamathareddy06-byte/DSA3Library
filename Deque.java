class Deque {
    int[] deque;
    int front, rear, capacity;

    Deque(int size) {
        capacity = size;
        deque = new int[capacity];
        front = -1;
        rear = -1;
    }

    void insertFront(int data) {
        if ((rear + 1) % capacity == front) {
            System.out.println("Deque is Full");
            return;
        }

        if (front == -1) {
            front = rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity;
        }

        deque[front] = data;
        System.out.println(data + " inserted at front");
    }

    void insertRear(int data) {
        if ((rear + 1) % capacity == front) {
            System.out.println("Deque is Full");
            return;
        }

        if (rear == -1) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }

        deque[rear] = data;
        System.out.println(data + " inserted at rear");
    }

    void deleteFront() {
        if (front == -1) {
            System.out.println("Deque is Empty");
            return;
        }

        System.out.println(deque[front] + " deleted from front");

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
    }

    void deleteRear() {
        if (rear == -1) {
            System.out.println("Deque is Empty");
            return;
        }

        System.out.println(deque[rear] + " deleted from rear");

        if (front == rear) {
            front = rear = -1;
        } else {
            rear = (rear - 1 + capacity) % capacity;
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("Deque is Empty");
            return;
        }

        int i = front;
        while (true) {
            System.out.print(deque[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % capacity;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Deque dq = new Deque(5);

        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertFront(5);
        dq.display();

        dq.deleteFront();
        dq.display();
    }
}
