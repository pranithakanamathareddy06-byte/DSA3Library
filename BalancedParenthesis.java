public class BalancedParenthesis {

    static int top = -1;
    static char stack[] = new char[100];


    static void push(char x) {
        stack[++top] = x;
    }

    static char pop() {
        return stack[top--];
    }

    public static void main(String[] args) {

        String expr = "{[()]}";

        boolean balanced = true;

        for (int i = 0; i < expr.length(); i++) {

            char ch = expr.charAt(i);


            if (ch == '(' || ch == '{' || ch == '[') {
                push(ch);
            }

    
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (top == -1) {
                    balanced = false;
                    break;
                }

                char popped = pop();

                if ((ch == ')' && popped != '(') ||
                    (ch == '}' && popped != '{') ||
                    (ch == ']' && popped != '[')) {

                    balanced = false;
                    break; 
                }
            }
        }


        if (top != -1)
            balanced = false;

        if (balanced)
            System.out.println("Expression is Balanced");
        else
            System.out.println("Expression is Not Balanced");
    }
}
