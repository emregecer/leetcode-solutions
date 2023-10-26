package dev.emregecer.leetcode.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumsTest {

    private final TwoSums twoSums = new TwoSums();

    @Test
    public void test1() {
        assertArrayEquals(twoSums.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
    }

    @Test
    public void test2() {
        assertArrayEquals(twoSums.twoSum(new int[]{3, 2, 4}, 6), new int[]{1, 2});
    }

    @Test
    public void test3() {
        assertArrayEquals(twoSums.twoSum(new int[]{3, 3}, 6), new int[]{0, 1});
    }
}
