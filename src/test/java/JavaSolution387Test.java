import leetcode.JavaSolution387;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JavaSolution387Test {


    private JavaSolution387 solution387;

    @BeforeAll
    void init() {
        this.solution387 = new JavaSolution387();
    }

    @Test
    public void testFirstUniqChar() {
        this.solution387.firstUniqChar("leetcode");
    }
}
