package programmers.level_3.야근지수;

import java.util.Arrays;

class NoOvertime {
    public int noOvertime(int no, int[] works) {

        while (no-- > 0) {
            works = Arrays.stream(works).sorted().toArray();
            works[works.length - 1] -= 1;
        }

        return Arrays.stream(works).map(w -> w * w).sum();
    }

    public static void main(String[] args) {
        NoOvertime c = new NoOvertime();
        int[] test = {4, 3, 3};
        System.out.println(c.noOvertime(4, test));
    }
}
