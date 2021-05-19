package programmers.level_2.hindex;

import java.util.Arrays;

public class HIndex {
    public int solution(int[] citations) {
        Arrays.sort(citations);

        int answer = 0;
        int length = citations.length;

        for (int i = 0; i < citations.length; i++) {
            if ((length - i) <= citations[i]) {
                answer = length - i;
                break;
            }
        }

        return answer;
    }
}
