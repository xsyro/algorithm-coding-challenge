import leetcode.JavaSolution268;
import leetcode.JavaSolution387;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JavaSolution268Test {

    private JavaSolution268 solution268;

    @BeforeAll
    void init() {
        this.solution268 = new JavaSolution268();
    }

    @Test
    @DisplayName("Test case for input: '[3,0,1]'")
    public void testCase1() {
        Integer actual = this.solution268.missingNumber(new int[]{3,0,1});
        assertEquals(2, actual);
    }

    @Test
    @DisplayName("Test case for input: '[0,1]'")
    public void testCase2() {
        Integer actual = this.solution268.missingNumber(new int[]{0,1});
        assertEquals(2, actual);
    }

    @Test
    @DisplayName("Test case for input: '[9,6,4,2,3,5,7,0,1]'")
    public void testCase3() {
        Integer actual = this.solution268.missingNumber(new int[]{9,6,4,2,3,5,7,0,1});
        assertEquals(8, actual);
    }

}
