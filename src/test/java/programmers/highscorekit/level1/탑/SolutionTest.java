package programmers.highscorekit.level1.탑;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {
    private Solution sut;

    @Before
    public void setUp() {
        sut = new Solution();
    }

    @Test
    public void test1() {
        // given
        int[] heights = new int[]{6, 9, 5, 7, 4};

        // when
        int[] answer = sut.solution(heights);

        // then
        assertThat(answer, is(new int[]{0, 0, 2, 2, 4}));
    }
}