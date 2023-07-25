import leetcode.JavaSolution217;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JavaSolution217Test {


    private JavaSolution217 solution217;

    @BeforeAll
    public void init() {
        this.solution217 = new JavaSolution217();
    }


    @Test
    @DisplayName("Test case for input: 'leetcode'")
    public void testFirstUniqCharTestCase1() {
        assertEquals(this.solution217.containsDuplicate(new int[]{1,2,3,1}), true);
    }

    @Test
    @DisplayName("Test case for input: 'loveleetcode'")
    public void testFirstUniqCharTestCase2() {
        assertEquals(this.solution217.containsDuplicate(new int[]{1,2,3,4}), false);
    }

    @Test
    @DisplayName("Test case for input: 'aabb'")
    public void testFirstUniqCharTestCase3() {
        assertEquals(this.solution217.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}), true);
    }




}
