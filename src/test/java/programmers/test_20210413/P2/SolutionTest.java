package programmers.test_20210413.P2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution sut;

    @Before
    public void setUp() throws Exception {
        sut = new Solution();
    }

    @Test
    public void test() {
        assertEquals(sut.solution("()"), 1);
        assertEquals(sut.solution(")("), 1);
        assertEquals(sut.solution("[]()"), 2);
    }
}