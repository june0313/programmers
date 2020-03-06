package programmers.level_2.쇠막대기;

import java.util.Stack;

public class Solution {
    public int solution(String arrangement) {
        String newArrangement = arrangement.replaceAll("\\(\\)", "|");

        Stack<Character> stack = new Stack<>();

        int answer = 0;

        for (char c : newArrangement.toCharArray()) {
            if (c == '(') {
                stack.push(c);
                answer++;
            } else if (c == '|') {
                answer += stack.size();
            } else if (c == ')') {
                stack.pop();
            }
        }

        return answer;
    }
}
