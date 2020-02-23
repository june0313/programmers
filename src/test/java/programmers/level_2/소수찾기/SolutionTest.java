package programmers.level_2.소수찾기;

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
        assertThat(sut.solution("17"), is(3));
    }

    @Test
    public void test2() {
        assertThat(sut.solution("011"), is(2));
    }

    @Test
    public void test3() {
        assertThat(sut.solution("1234"), is(14));
    }
}