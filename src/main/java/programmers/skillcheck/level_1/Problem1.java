package programmers.skillcheck.level_1;

import java.util.Arrays;

public class Problem1 {
    public int solution(int[] nums) {
        long uniqueNumCount = Arrays.stream(nums).distinct().count();
        return Math.min(nums.length / 2, (int) uniqueNumCount);
    }
}
