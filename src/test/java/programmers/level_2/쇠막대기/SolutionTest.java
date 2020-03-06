package programmers.level_2.쇠막대기;

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
        int result = sut.solution("()");
        assertThat(result, is(0));
    }

    @Test
    public void test2() {
        int result = sut.solution("(())");
        assertThat(result, is(2));
    }

    @Test
    public void test3() {
        int result = sut.solution("((()))");
        assertThat(result, is(4));
    }

    @Test
    public void test4() {
        int result = sut.solution("(()())");
        assertThat(result, is(3));
    }

    @Test
    public void test5() {
        int result = sut.solution("(()()())");
        assertThat(result, is(4));
    }

    @Test
    public void test6() {
        int result = sut.solution("((()()))");
        assertThat(result, is(6));
    }

    @Test
    public void test7() {
        int result = sut.solution("()(((()())(())()))(())");
        assertThat(result, is(17));
    }
}