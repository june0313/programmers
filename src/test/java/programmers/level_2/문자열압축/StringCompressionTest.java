package programmers.level_2.문자열압축;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCompressionTest {
    StringCompression sut;

    @Before
    public void setUp() throws Exception {
        sut = new StringCompression();
    }

    @Test
    public void test() {
        assertEquals(sut.solution("a"), 1);
        assertEquals(sut.solution("ab"), 2);
        assertEquals(sut.solution("abab"), 3);
        assertEquals(sut.solution("aaaaaa"), 2);
        assertEquals(sut.solution("aabbaccc"), 7);
        assertEquals(sut.solution("xababcdcdababcdcd"), 17);
        assertEquals(sut.solution("abcabcabcabcdededededede"), 14);
    }
}