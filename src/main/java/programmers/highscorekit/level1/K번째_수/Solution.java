package programmers.highscorekit.level1.K번째_수;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answers = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int from = commands[i][0] - 1;
            int to = commands[i][1];
            int k = commands[i][2] - 1;

            answers[i] = Arrays.stream(array, from, to).sorted().toArray()[k];
        }

        return answers;
    }
}
