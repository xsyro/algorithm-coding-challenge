import leetcode.JavaSolution387;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JavaSolution387Test {

    private JavaSolution387 solution387;

    @BeforeAll
    void init() {
        this.solution387 = new JavaSolution387();
    }

    @Test
    @DisplayName("Test case for input: 'leetcode'")
    public void testFirstUniqCharTestCase1() {
        Integer firstUniqCharIndex = this.solution387.firstUniqChar("leetcode");
        assertEquals(firstUniqCharIndex, 0);
    }

    @Test
    @DisplayName("Test case for input: 'loveleetcode'")
    public void testFirstUniqCharTestCase2() {
        Integer firstUniqCharIndex = this.solution387.firstUniqChar("loveleetcode");
        assertEquals(firstUniqCharIndex, 2);
    }

    @Test
    @DisplayName("Test case for input: 'aabb'")
    public void testFirstUniqCharTestCase3() {
        Integer firstUniqCharIndex = this.solution387.firstUniqChar("aabb");
        assertEquals(firstUniqCharIndex, -1);
    }
}
