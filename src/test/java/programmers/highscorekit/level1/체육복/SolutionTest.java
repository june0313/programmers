package programmers.highscorekit.level1.체육복;

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
        int result = sut.solution(5, new int[]{2, 4}, new int[]{1, 3, 5});
        assertThat(result, is(5));
    }

    @Test
    public void test2() {
        int result = sut.solution(5, new int[]{2, 4}, new int[]{3});
        assertThat(result, is(4));
    }

    @Test
    public void test3() {
        int result = sut.solution(3, new int[]{3}, new int[]{1});
        assertThat(result, is(2));
    }

    @Test
    public void test4() {
        int result = sut.solution(5, new int[]{1}, new int[]{1});
        assertThat(result, is(5));
    }

    @Test
    public void test5() {
        int result = sut.solution(5, new int[]{1, 3, 5}, new int[]{2, 4});
        assertThat(result, is(4));
    }

    @Test
    public void test6() {
        int result = sut.solution(5, new int[]{2, 4}, new int[]{2, 4});
        assertThat(result, is(5));
    }

    @Test
    public void test7() {
        int result = sut.solution(5, new int[]{1, 5}, new int[]{3});
        assertThat(result, is(3));
    }

    @Test
    public void test8() {
        int result = sut.solution(5, new int[]{2, 3, 4}, new int[]{3, 4, 5});
        assertThat(result, is(4));
    }
}