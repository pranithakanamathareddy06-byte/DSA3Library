public class StringReverse {

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

    public static void main(String[] args) {

        String str = "HELLO";
        String reversed = "";

        // Push all characters into stack
        for (int i = 0; i < str.length(); i++) {
            push(str.charAt(i));
        }

        // Pop all characters from stack
        while (top != -1) {
            reversed += pop();
        }

        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + reversed);
    }
}
