package programmers.highscorekit.level1.탑;

public class Solution {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];

        for (int i = heights.length - 1; i > 0; i--) {
            for (int k = i - 1; k >= 0; k--) {
                if (heights[i] < heights[k]) {
                    answer[i] = k + 1;
                    break;
                }
            }
        }

        return answer;
    }
}
