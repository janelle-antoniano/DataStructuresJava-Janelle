import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);  // Push
        stack.push(20);
        System.out.println(stack.pop());  // Pop
    }
}
