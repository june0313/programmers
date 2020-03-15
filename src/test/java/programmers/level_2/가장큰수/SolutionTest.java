package programmers.level_2.가장큰수;

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
        String result = sut.solution(new int[]{6, 10, 2});
        assertThat(result, is("6210"));
    }

    @Test
    public void test2() {
        String result = sut.solution(new int[]{3, 30, 34, 5, 9});
        assertThat(result, is("9534330"));
    }

    @Test
    public void test3() {
        String result = sut.solution(new int[]{3, 30});
        assertThat(result, is("330"));
    }

    @Test
    public void test4() {
        String result = sut.solution(new int[]{121, 12});
        assertThat(result, is("12121"));
    }

    @Test
    public void test5() {
        String result = sut.solution(new int[]{0, 0, 0});
        assertThat(result, is("0"));
    }

    @Test
    public void test6() {
        String result = sut.solution(new int[]{10, 0});
        assertThat(result, is("100"));
    }

    @Test
    public void test7() {
        String result = sut.solution(new int[]{0, 0, 0, 1, 0, 0, 0});
        assertThat(result, is("1000000"));
    }
}