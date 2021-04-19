package codejam_2021.moons_and_umbrellas;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        assertThat(Solution.calculateCost(2, 3, "C"), is(0));
        assertThat(Solution.calculateCost(2, 3, "J"), is(0));
        assertThat(Solution.calculateCost(2, 3, "CJ"), is(2));
        assertThat(Solution.calculateCost(2, 3, "JC"), is(3));
        assertThat(Solution.calculateCost(2, 3, "CJC"), is(5));
        assertThat(Solution.calculateCost(2, 3, "JCJ"), is(5));
        assertThat(Solution.calculateCost(2, 3, "JCJC"), is(8));
        assertThat(Solution.calculateCost(2, 3, "CJCJ"), is(7));
    }

    @Test
    public void replace() {
        String original = "CJ?CJ?";
        String replaced = original.replaceFirst("\\?", "C");
        System.out.println(original);
        System.out.println(replaced);

    }
}