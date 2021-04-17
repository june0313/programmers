package programmers.test_20210413.P1;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SolutionTest {
    private Solution sut;

    @Before
    public void setUp() throws Exception {
        sut = new Solution();
    }

    @Test
    public void test() {
        assertThat(sut.solution(new int[]{1}, new boolean[]{true}), is(1));
        assertThat(sut.solution(new int[]{1}, new boolean[]{false}), is(-1));
        assertThat(sut.solution(new int[]{1, 2, 3}, new boolean[]{true, false, true}), is(2));
    }

    @Test
    public void tes2() {
        assertThat(sut.solution2(new int[]{1}, new boolean[]{true}), is(1));
        assertThat(sut.solution2(new int[]{1}, new boolean[]{false}), is(-1));
        assertThat(sut.solution2(new int[]{1, 2, 3}, new boolean[]{true, false, true}), is(2));
    }
}