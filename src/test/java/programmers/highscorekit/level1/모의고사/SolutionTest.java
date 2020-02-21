package programmers.highscorekit.level1.모의고사;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution sut = new Solution();

        int[] result = sut.solution(new int[]{1, 2, 3, 4, 5});

        assertThat(result, is(new int[]{1}));
    }

    @Test
    public void test2() {
        Solution sut = new Solution();

        int[] result = sut.solution(new int[]{1,3,2,4,2});

        assertThat(result, is(new int[]{1, 2, 3}));
    }
}