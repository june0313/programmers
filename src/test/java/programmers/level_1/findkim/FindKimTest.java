package programmers.level_1.findkim;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FindKimTest {

    private FindKim sut;

    @Before
    public void setUp() throws Exception {
        sut = new FindKim();
    }

    @Test
    public void findKim0() throws Exception {
        // given
        String[] names = {"Kim", "Queen", "Tod"};

        // when
        String result = sut.findKim(names);

        // then
        assertThat(result, is("김서방은 0에 있다"));
    }

    @Test
    public void findKim2() throws Exception {
        // given
        String[] names = {"Queen", "Tod", "Kim"};

        // when
        String result = sut.findKim(names);

        // then
        assertThat(result, is("김서방은 2에 있다"));
    }

}