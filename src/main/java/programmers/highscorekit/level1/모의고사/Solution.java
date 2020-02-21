package programmers.highscorekit.level1.모의고사;

import java.util.*;

public class Solution {
    public int[] solution(int[] answers) {
        int[][] user = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] userScore = {0, 0, 0};

        for (int i = 0; i < answers.length; i++) {
            for (int k = 0; k < user.length; k++) {
                if (user[k][i % user[k].length] == answers[i]) userScore[k]++;
            }
        }

        int max = Arrays.stream(userScore).max().getAsInt();

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < user.length; i++) {
            if (userScore[i] == max) {
                result.add(i + 1);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
