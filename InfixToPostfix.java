public class InfixToPostfix {

    static int top = -1;
    static char stack[] = new char[100];

    // Push method
    static void push(char x) {
        stack[++top] = x;
    }

    // Pop method
    static char pop() {
        return stack[top--];
    }

    // Method to check precedence
    static int precedence(char x) {
        if (x == '+' || x == '-')
            return 1;
        else if (x == '*' || x == '/')
            return 2;
        else
            return 0;
    }

    public static void main(String[] args) {

        String infix = "a * b + c - d / e";
        String postfix = "";

        for (int i = 0; i < infix.length(); i++) {

            char ch = infix.charAt(i);

            // If digit, add to postfix
            if (Character.isDigit(ch)) {
                postfix += ch;
            }

            // If '(' push to stack
            else if (ch == '(') {
                push(ch);
            }

            // If ')', pop until '('
            else if (ch == ')') {
                while (stack[top] != '(') {
                    postfix += pop();
                }
                pop(); // remove '('
            }

            // If operator
            else {
                while (top != -1 && precedence(stack[top]) >= precedence(ch)) {
                    postfix += pop();
                }
                push(ch);
            }
        }

        // Pop remaining operators
        while (top != -1) {
            postfix += pop();
        }

        System.out.println("Infix Expression  : " + infix);
        System.out.println("Postfix Expression: " + postfix);
    }
}
