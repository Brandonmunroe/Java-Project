import java.util.Stack;

public class ValidParenthesis {
    public static boolean validParenthesis(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Push opening brackets to the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop(); // no need for .charValue() now

                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(validParenthesis("()"));       // true
        System.out.println(validParenthesis("()[]{}"));   // true
        System.out.println(validParenthesis("(]"));       // false
        System.out.println(validParenthesis("([)]"));     // false
        System.out.println(validParenthesis("{[]}"));     // true
    }
}
