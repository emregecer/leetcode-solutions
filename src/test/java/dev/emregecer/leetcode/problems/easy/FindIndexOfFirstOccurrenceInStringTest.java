package dev.emregecer.leetcode.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindIndexOfFirstOccurrenceInStringTest {

    private FindIndexOFirstOccurrenceInString indexFinder = new FindIndexOFirstOccurrenceInString();

    @Test
    public void test1() {
        assertEquals(indexFinder.strStr("sadbutsad", "sad"), 0);
    }

    @Test
    public void test2() {
        assertEquals(indexFinder.strStr("leetcode", "leeto"), -1);
    }
}
