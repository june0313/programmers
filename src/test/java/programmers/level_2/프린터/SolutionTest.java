package programmers.level_2.프린터;

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
        int result = sut.solution(new int[]{2, 1, 3, 2}, 2);
        assertThat(result, is(1));
    }

    @Test
    public void test2() {
        int result = sut.solution(new int[]{1, 1, 9, 1, 1, 1}, 0);
        assertThat(result, is(5));
    }
}