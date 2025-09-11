import java.util.*;
public class Notation {
    public static int evalRPN(String [] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i = i + 1) {
            if (tokens[i].equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (tokens[i].equals("*") ) {
                stack.push(stack.pop() * stack.pop());
            } else if (tokens[i].equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            } else if (tokens[i].equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            }
            stack.push(Integer.parseInt(tokens[i]));
        }
        return stack.pop();
    }
}
