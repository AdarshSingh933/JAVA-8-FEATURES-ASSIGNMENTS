import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");

        System.out.println("Stack: " + stack);
        System.out.println("Peek: " + stack.peek());
        stack.pop();
        System.out.println("Stack after pop: " + stack);
    }
}
