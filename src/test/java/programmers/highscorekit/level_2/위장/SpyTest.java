package programmers.highscorekit.level_2.위장;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpyTest {
    private Spy sut;

    @Before
    public void setUp() {
        sut = new Spy();
    }

    @Test
    public void test1() {
        int result = sut.solution(new String[][]{
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"},
        });

        assertEquals(result, 5);
    }

    @Test
    public void test2() {
        int result = sut.solution(new String[][]{
                {"crow_mask", "face"},
                {"blue_sunglasses", "face"},
                {"smoky_makeup", "face"},
        });

        assertEquals(result, 3);
    }
}