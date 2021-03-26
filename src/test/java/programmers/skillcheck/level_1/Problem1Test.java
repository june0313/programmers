package programmers.skillcheck.level_1;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Problem1Test {
    Problem1 sut;

    @Before
    public void setUp() throws Exception {
        sut = new Problem1();
    }

    @Test
    public void test() {
        assertThat(sut.solution(new int[]{3, 1, 2, 3}), is(2));
        assertThat(sut.solution(new int[]{3, 3, 3, 2, 2, 4}), is(3));
        assertThat(sut.solution(new int[]{3, 3, 3, 2, 2, 2}), is(2));
        assertThat(sut.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), is(5));
    }
}