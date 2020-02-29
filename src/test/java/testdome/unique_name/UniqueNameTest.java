package testdome.unique_name;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class UniqueNameTest {
    @Test
    public void test1() {
        String result = UniqueName.firstUniqueName(new String[]{"Andy", "Josh", "Andy", "Ollie"});
        assertThat(result, is("Josh"));
    }
}