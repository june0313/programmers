package programmers.level_2.타겟넘버;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SolutionTest {
    private Solution sut;

    @Before
    public void setUp() {
        sut = new Solution();
    }

    @Test
    public void test1() {
        int result = sut.solution(new int[]{1, 1, 1, 1, 1}, 3);
        assertThat(result, is(5));
    }
}