package programmers.level_2.스킬트리;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SkillTreeTest {
    SkillTree sut;

    @Before
    public void setUp() throws Exception {
        sut = new SkillTree();
    }

    @Test
    public void test() {
        assertEquals(sut.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA", "AE"}), 3);
    }
}