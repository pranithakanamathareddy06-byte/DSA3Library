import java.util.Stack;
public class StackExample{
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        stack.push("Element1");
        stack.push("Element2");
        stack.push("Element3");
        System.out.println("stack: " + stack);
        String poppedElement = stack.pop();
        System.out.println("poppedElement: " + poppedElement);
        System.out.println("stack after pop: " + stack);
        String topElement = stack.peek();
        System.out.println("top element: " + topElement);
        System.out.println("Is stackmEmpty?" + stack.isEmpty());
        int position = stack.search("Element2");
        System.out.println("position of Element2: " + position);

    }
}