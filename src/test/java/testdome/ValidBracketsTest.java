package testdome;

import org.junit.Test;
import testdome.valid_brackets.ValidBrackets;

import static org.junit.Assert.*;

public class ValidBracketsTest {

    @Test
    public void test1() {
        boolean result = ValidBrackets.isValid("[{()}]");
        assertTrue(result);
    }

    @Test
    public void test2() {
        boolean result = ValidBrackets.isValid("[(");
        assertFalse(result);
    }

    @Test
    public void test3() {
        boolean result = ValidBrackets.isValid("([)]");
        assertFalse(result);
    }

    @Test
    public void test4() {
        boolean result = ValidBrackets.isValid("()([])");
        assertTrue(result);
    }
}