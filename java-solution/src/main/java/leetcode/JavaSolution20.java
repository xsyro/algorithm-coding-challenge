package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class JavaSolution20 {

    /**
     * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     *
     * An input string is valid if:
     *
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Every close bracket has a corresponding open bracket of the same type.
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        while(s.contains("[]") || s.contains("{}") || s.contains("()")) {
            s = s.replace("[]", "");
            s = s.replace("{}", "");
            s = s.replace("()", "");
        }
        return s.isEmpty();
    }


    /**
     * This failed the test case but still a valid answer to some test cases as follows
     * E.g:
     * ' ( [ { } ] ) ' is Valid
     * ' [ ( { } ) ] ' is Valid, etc.
     * @param s
     * @return
     */
    public boolean isValid_F(String s) {
        Map<Character, Character> dictionaryOfChars = new HashMap<Character, Character>(s.toCharArray().length);
        dictionaryOfChars.put(')', '(');
        dictionaryOfChars.put('(', ')');
        dictionaryOfChars.put('{', '}');
        dictionaryOfChars.put('}', '{');
        dictionaryOfChars.put(']', '[');
        dictionaryOfChars.put('[', ']');

        Stack<Character> sStacks = new Stack<Character>();
        for (char c : s.toCharArray()) {
            sStacks.push(c);
        }

        for (char fromLeftChar : s.toCharArray()) {
            char fromRightChar = sStacks.pop();
            if (dictionaryOfChars.get(fromRightChar) != fromLeftChar)
                return false;
        }
        return true;
    }

}