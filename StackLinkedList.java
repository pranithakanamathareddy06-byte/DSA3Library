class Stack {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;  
    
    void push(int value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: " + value);
    }

    void pop(){
        if (top == null) {
            System.out.println("Stack is EMPTY");
        } else {
            int deleted = top.data;
            top = top.next;
            System.out.println("Popped: " + deleted);
        }
    }

    
    void display() {
        if (top == null) {
            System.out.println("Stack is EMPTY");
        } else {
            System.out.print("Stack elements: ");
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
public class StackLinkedList {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.pop();

        s.display();
    }
}
