public class InfixEvaluation {

    // Stack for operators (char stack)
    static int top1 = -1;
    static char stack1[] = new char[100];

    // Stack for evaluation (int stack)
    static int top2 = -1;
    static int stack2[] = new int[100];

    // Push for operator stack
    static void push1(char x) {
        stack1[++top1] = x;
    }

    static char pop1() {
        return stack1[top1--];
    }

    // Push for value stack
    static void push2(int x) {
        stack2[++top2] = x;
    }

    static int pop2() {
        return stack2[top2--];
    }

    // Precedence method
    static int precedence(char x) {
        if (x == '+' || x == '-')
            return 1;
        else if (x == '*' || x == '/')
            return 2;
        else
            return 0;
    }

    public static void main(String[] args) {

        String infix = "2+3*4";
        String postfix = "";

        for (int i = 0; i < infix.length(); i++) {

            char ch = infix.charAt(i);

            if (Character.isDigit(ch)) {
                postfix += ch;
            }

            else {                        
                while (top1 != -1 && precedence(stack1[top1]) >= precedence(ch)) {
                    postfix += pop1();
                }
                push1(ch);
            }
        }

        while (top1 != -1) {
            postfix += pop1();
        }

        System.out.println("Postfix Expression: " + postfix);

        // -------- Postfix Evaluation --------
        for (int i = 0; i < postfix.length(); i++) {

            char ch = postfix.charAt(i);

            if (Character.isDigit(ch)) {
                push2(ch - '0');   
            }

            else {
                int b = pop2();
                int a = pop2();

                int result = 0;

                
                if (ch == '+')
                    result = a + b;
                else if (ch == '-')
                    result = a - b;
                else if (ch == '*')
                    result = a * b;
                else if (ch == '/')
                    result = a / b;

                push2(result);
            }
        }

        System.out.println("Final Evaluated Value: " + pop2());
    }
}
