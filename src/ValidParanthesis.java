import java.util.Stack;

/**
 * ------------------------------------------------------------------------
 * Author   : Sanjay Krishna Narayanan
 * Created  : 10/23/26
 * Version  : 1.0
 * ------------------------------------------------------------------------
 */
public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "";
        System.out.println(validate(s));
    }

    private static boolean validate(String s) {
        Stack stack = new Stack();
        for (char c : s.toCharArray()) {
            if (c == ')') {
                pushpop(stack, '(', c);
            } else if (c == '}') {
                pushpop(stack, '{', c);
            } else if (c == ']') {
                pushpop(stack, '[', c);
            } else {
                stack.push(c);
            }
        }
        return (stack.empty());
    }

    private static void pushpop(Stack stack, char obj, char c) {
        if (!stack.isEmpty() && stack.peek().equals(obj)) {
            stack.pop();
        } else {
            stack.push(c);
        }
    }
}
