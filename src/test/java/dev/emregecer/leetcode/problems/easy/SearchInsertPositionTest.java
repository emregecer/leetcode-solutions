package dev.emregecer.leetcode.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInsertPositionTest {

    private final SearchInsertionPosition sip = new SearchInsertionPosition();

    @Test
    public void test1() {
        assertEquals(sip.searchInsert(new int[]{1, 3, 5, 6}, 5), 2);
    }

    @Test
    public void test2() {
        assertEquals(sip.searchInsert(new int[]{1, 3, 5, 6}, 2), 1);
    }

    @Test
    public void test3() {
        assertEquals(sip.searchInsert(new int[]{1, 3, 5, 6}, 7), 4);
    }
}
