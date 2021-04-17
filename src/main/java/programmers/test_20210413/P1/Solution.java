package programmers.test_20210413.P1;

import java.util.stream.IntStream;


public class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                sum += absolutes[i];
            } else {
                sum -= absolutes[i];
            }
        }

        return sum;
    }

    public int solution2(int[] absolute, boolean[] signs) {
        return IntStream.range(0, absolute.length)
                .map(i -> (signs[i] ? 1 : -1) * absolute[i])
                .sum();
    }
}
