package programmers.level_2.타겟넘버;

public class Solution {
    public int solution(int[] numbers, int target) {
        return targetCount(numbers, target, 0, 0);
    }

    private int targetCount(int[] numbers, int target, int index, int sum) {
        if (index >= numbers.length) {
            return sum == target ? 1 : 0;
        }

        int leftCount = targetCount(numbers, target, index + 1, sum + numbers[index]);
        int rightCount = targetCount(numbers, target, index + 1, sum - numbers[index]);

        return leftCount + rightCount;
    }
}
