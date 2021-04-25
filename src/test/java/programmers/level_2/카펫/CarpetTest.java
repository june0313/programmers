package programmers.level_2.카펫;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarpetTest {
    Carpet sut;

    @Before
    public void setUp() throws Exception {
        sut = new Carpet();
    }

    @Test
    public void test() {
        assertArrayEquals(sut.solution(10, 2), new int[]{4, 3});
        assertArrayEquals(sut.solution(8, 1), new int[]{3, 3});
        assertArrayEquals(sut.solution(24, 24), new int[]{8, 6});
    }
}