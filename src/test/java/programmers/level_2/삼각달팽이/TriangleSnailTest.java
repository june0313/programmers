package programmers.level_2.삼각달팽이;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleSnailTest {
    TriangleSnail sut;

    @Before
    public void setUp() throws Exception {
        sut = new TriangleSnail();
    }

    @Test
    public void test() {
        assertArrayEquals(sut.solution(1), new int[]{1});
        assertArrayEquals(sut.solution(2), new int[]{1, 2, 3});
        assertArrayEquals(sut.solution(3), new int[]{1, 2, 6, 3, 4, 5});
        assertArrayEquals(sut.solution(4), new int[]{1, 2, 9, 3, 10, 8, 4, 5, 6, 7});
        assertArrayEquals(sut.solution(5), new int[]{1, 2, 12, 3, 13, 11, 4, 14, 15, 10, 5, 6, 7, 8, 9});
        assertArrayEquals(sut.solution(6), new int[]{1, 2, 15, 3, 16, 14, 4, 17, 21, 13, 5, 18, 19, 20, 12, 6, 7, 8, 9, 10, 11});
    }
}