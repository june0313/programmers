package programmers.highscorekit.level_2.기능_개발;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SolutionTest {
    private Solution sut;

    @Before
    public void setUp() {
        sut = new Solution();
    }

    @Test
    public void test1() {
        int[] result = sut.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        assertThat(result, is(new int[]{2, 1}));
    }
}