package programmers.highscorekit.level_2.전화번호목록;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrefixTest {
    private Prefix sut;

    @Before
    public void setUp() {
        sut = new Prefix();
    }

    @Test
    public void test1() {
        boolean result = sut.solution(new String[]{"119", "976231232", "1195512321"});
        assertFalse(result);
    }

    @Test
    public void test2() {
        boolean result = sut.solution(new String[]{"123", "456", "789"});
        assertTrue(result);
    }

    @Test
    public void test3() {
        boolean result = sut.solution(new String[]{"12", "123", "1235", "567", "88"});
        assertFalse(result);
    }
}