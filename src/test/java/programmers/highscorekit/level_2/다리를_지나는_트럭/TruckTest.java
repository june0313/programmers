package programmers.highscorekit.level_2.다리를_지나는_트럭;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TruckTest {

    private Truck sut;

    @Before
    public void setUp() {
        sut = new Truck();
    }

    @Test
    public void test1() {
        int result = sut.solution(2, 10, new int[]{7, 4, 5, 6});
        assertThat(result, is(8));
    }

    @Test
    public void test2() {
        int result = sut.solution(100, 100, new int[]{10});
        assertThat(result, is(101));
    }

    @Test
    public void test3() {
        int result = sut.solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10});
        assertThat(result, is(110));
    }
}