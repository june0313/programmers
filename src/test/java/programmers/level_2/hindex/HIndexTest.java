package programmers.level_2.hindex;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HIndexTest {
    HIndex sut;

    @Before
    public void setUp() throws Exception {
        sut = new HIndex();
    }

    @Test
    public void test() {
        assertEquals(sut.solution(new int[]{0, 0, 0}), 0);
        assertEquals(sut.solution(new int[]{3, 0, 6, 1, 5}), 3);
        assertEquals(sut.solution(new int[]{1, 3, 5, 7, 9, 11, 13}), 5);
        assertEquals(sut.solution(new int[]{8, 10, 10, 15, 17, 22, 24, 28, 32, 42, 47}), 10);
        assertEquals(sut.solution(new int[]{31, 66}), 2);
    }
}