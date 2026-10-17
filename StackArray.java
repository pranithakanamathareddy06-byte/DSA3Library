class Stack {
    int[] stack = new int[5];  
    int top = -1;              

 
    void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack is FULL");
        } else {
            top++;
            stack[top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is EMPTY");
        } else {
            int deleted = stack[top];
            top--;
            System.out.println("Popped: " + deleted);
        }
    }

    void display(){
        if (top == -1){
            System.out.println("Stack is EMPTY");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            
            System.out.println();
        }
    }
}

public class StackArray {
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
