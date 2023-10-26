package dev.emregecer.leetcode.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeNumberTest {

    private final PalindromeNumber pn = new PalindromeNumber();

    @Test
    public void testWithString1() {
        assertTrue(pn.isPalindromeViaStringUsage(121));
    }

    @Test
    public void testWithString2() {
        assertFalse(pn.isPalindromeViaStringUsage(-121));
    }

    @Test
    public void testWithString3() {
        assertFalse(pn.isPalindromeViaStringUsage(10));
    }

    @Test
    public void testWithoutString1() {
        assertTrue(pn.isPalindromeWithoutStringUsage(121));
    }

    @Test
    public void testWithoutString2() {
        assertFalse(pn.isPalindromeWithoutStringUsage(-121));
    }

    @Test
    public void testWithoutString3() {
        assertFalse(pn.isPalindromeWithoutStringUsage(10));
    }
}
