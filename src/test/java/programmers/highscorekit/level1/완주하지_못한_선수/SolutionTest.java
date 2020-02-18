package programmers.highscorekit.level1.완주하지_못한_선수;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {
    private Solution sut;

    @Before
    public void setUp() {
        sut = new Solution();
    }

    @Test
    public void test1() {
        // given
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"kiki", "eden"};

        // when
        String result = sut.solution(participant, completion);

        // then
        assertThat(result, is("leo"));
    }

    @Test
    public void test2() {
        // given
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        // when
        String result = sut.solution(participant, completion);

        // then
        assertThat(result, is("vinko"));
    }

    @Test
    public void test3() {
        // given
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "mislav", "ana"};

        // when
        String result = sut.solution(participant, completion);

        // then
        assertThat(result, is("mislav"));
    }
}