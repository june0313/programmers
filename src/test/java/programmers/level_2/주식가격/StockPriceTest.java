package programmers.level_2.주식가격;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StockPriceTest {

    private StockPrice sut;

    @Before
    public void setUp() {
        sut = new StockPrice();
    }

    @Test
    public void test1() {
        int[] result = sut.solution(new int[]{1, 2, 3, 2, 3});
        assertThat(result, is(new int[]{4, 3, 1, 1, 0}));
    }
}