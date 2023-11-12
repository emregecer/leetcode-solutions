package dev.emregecer.leetcode.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcelSheetColumnTitleTest {

    private final ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();

    @Test
    public void test1() {
        assertEquals(excelSheetColumnTitle.convertToTitle(1), "A");
    }

    @Test
    public void test2() {
        assertEquals(excelSheetColumnTitle.convertToTitle(28), "AB");
    }

    @Test
    public void test3() {
        assertEquals(excelSheetColumnTitle.convertToTitle(701), "ZY");
    }
}
