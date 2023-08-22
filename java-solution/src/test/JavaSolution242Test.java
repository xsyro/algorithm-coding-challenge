import leetcode.JavaSolution217;
import leetcode.JavaSolution242;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JavaSolution242Test {


    private JavaSolution242 solution242;

    @BeforeAll
    public void init() {
        this.solution242 = new JavaSolution242();
    }


    @Test
    @DisplayName("Test case for input: 'nagaram' and 'nagaram'")
    public void testFirstUniqCharTestCase1() {
        assertTrue(this.solution242.isAnagram("anagram", "nagaram"));
    }

    @Test
    @DisplayName("Test case for input: 'rat' and 'car")
    public void testFirstUniqCharTestCase2() {
        assertFalse(this.solution242.isAnagram("rat", "car"));
    }




}
