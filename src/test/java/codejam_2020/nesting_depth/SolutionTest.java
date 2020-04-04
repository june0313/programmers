package codejam_2020.nesting_depth;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        assertThat(Solution.solve("0"), is("0"));
        assertThat(Solution.solve("1"), is("(1)"));
        assertThat(Solution.solve("11"), is("(11)"));
        assertThat(Solution.solve("01"), is("0(1)"));
        assertThat(Solution.solve("011"), is("0(11)"));
        assertThat(Solution.solve("10"), is("(1)0"));
        assertThat(Solution.solve("0000"), is("0000"));
        assertThat(Solution.solve("101"), is("(1)0(1)"));
        assertThat(Solution.solve("111000"), is("(111)000"));
        assertThat(Solution.solve("2"), is("((2))"));
        assertThat(Solution.solve("021"), is("0((2)1)"));
        assertThat(Solution.solve("221"), is("((22)1)"));
        assertThat(Solution.solve("312"), is("(((3))1(2))"));
        assertThat(Solution.solve("4"), is("((((4))))"));
    }
}