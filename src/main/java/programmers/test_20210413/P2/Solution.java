package programmers.test_20210413.P2;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    private static final Map<Character, Character> BRACKET_PAIRS = new HashMap<>();

    static {
        BRACKET_PAIRS.put(')', '(');
        BRACKET_PAIRS.put(']', '[');
        BRACKET_PAIRS.put('}', '{');
    }

    public int solution(String s) {
        Queue<Character> queue = s.chars().mapToObj(i -> (char) i).collect(Collectors.toCollection(LinkedList::new));
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            moveFirstCharacterToLast(queue);
            if (isValidBracket(queue)) {
                count++;
            }
        }

        return count;
    }

    private void moveFirstCharacterToLast(Queue<Character> queue) {
        queue.offer(queue.poll());
    }

    private boolean isValidBracket(Queue<Character> queue) {
        Stack<Character> stack = new Stack<>();

        for (Character ch : queue) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (!stack.isEmpty() && stack.pop() != BRACKET_PAIRS.get(ch)) {
                return false;
            }
        }

        return stack.empty();
    }
}
