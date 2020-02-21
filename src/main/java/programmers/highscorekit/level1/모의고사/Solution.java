package programmers.highscorekit.level1.모의고사;

import java.util.*;

public class Solution {
    public int[] solution(int[] answers) {

        int[] user1 = new int[]{1, 2, 3, 4, 5};
        int[] user2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] user3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int user1Score = 0;
        int user2Score = 0;
        int user3Score = 0;

        for (int i = 0; i < answers.length; i++) {
            int answer = answers[i];
            if (user1[i % 5] == answer) user1Score++;
            if (user2[i % 8] == answer) user2Score++;
            if (user3[i % 10] == answer) user3Score++;
        }

        int max = Integer.max(user1Score, Integer.max(user2Score, user3Score));
        List<Integer> result = new ArrayList<>();

        if (user1Score == max) result.add(1);
        if (user2Score == max) result.add(2);
        if (user3Score == max) result.add(3);
        return result.stream().mapToInt(i -> i).toArray();
    }
}
