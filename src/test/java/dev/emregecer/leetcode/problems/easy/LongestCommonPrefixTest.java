package dev.emregecer.leetcode.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {

    private final LongestCommonPrefix lcp = new LongestCommonPrefix();

    @Test
    public void test1() {
        assertEquals(lcp.longestCommonPrefix(new String[]{"flower","flow","flight"}), "fl");
    }

    @Test
    public void test2() {
        assertEquals(lcp.longestCommonPrefix(new String[]{"dog","racecar","car"}), "");
    }
}
