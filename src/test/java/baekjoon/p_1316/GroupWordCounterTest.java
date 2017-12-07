package baekjoon.p_1316;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class GroupWordCounterTest {

    private Main groupWordCounter;

    @Before
    public void setUp() throws Exception {
        groupWordCounter = new Main();
    }

    @Test
    public void countTest() throws Exception {
        List<String> words = Arrays.asList("happy", "new", "year");
        int count = groupWordCounter.getGroupWordCount(words);
        assertThat(count, is(3));
    }

    @Test
    public void countTest2() throws Exception {
        List<String> words = Collections.singletonList("ccazzzzbb");
        int count = groupWordCounter.getGroupWordCount(words);
        assertThat(count, is(1));
    }

    @Test
    public void countTest3() throws Exception {
        List<String> words = Arrays.asList("kin", "aabbbccb");
        int count = groupWordCounter.getGroupWordCount(words);
        assertThat(count, is(1));
    }
}