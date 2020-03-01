package testdome.valid_brackets;

import java.util.*;

public class ValidBrackets {

    private static Map<Character, Character> pairs = new HashMap<>();

    static {
        pairs.put(']', '[');
        pairs.put('}', '{');
        pairs.put(')', '(');
    }

    public static boolean isValid(String brackets) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : brackets.toCharArray()) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else if (stack.pop() != pairs.get(bracket)) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(ValidBrackets.isValid("[{()}]"));
    }
}
