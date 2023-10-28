package dev.emregecer.leetcode.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {

    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    public void test1() {
        assertTrue(validParentheses.isValid("()"));
    }

    @Test
    public void test2() {
        assertTrue(validParentheses.isValid("()[]{}"));
    }

    @Test
    public void test3() {
        assertFalse(validParentheses.isValid("(]"));
    }

    @Test
    public void test4() {
        assertTrue(validParentheses.isValid("{((([])))}"));
    }
 }
