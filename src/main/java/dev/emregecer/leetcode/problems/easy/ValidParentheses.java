package dev.emregecer.leetcode.problems.easy;

import java.util.Map;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/valid-parentheses/">Valid Parentheses</a>
 * <p>
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * <p>
 *
 * Example 1:
 * <p>
 * Input: s = "()"
 * Output: true
 *
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                charStack.push(c); // Push opening parentheses onto the stack
            } else if (c == ')' || c == '}' || c == ']') {
                if (charStack.isEmpty()) {
                    return false; // No matching opening parenthesis
                }

                char top = charStack.pop(); // Pop the top element from the stack

                // Check if the popped opening parenthesis matches the current closing parenthesis
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return charStack.isEmpty();
    }
}
