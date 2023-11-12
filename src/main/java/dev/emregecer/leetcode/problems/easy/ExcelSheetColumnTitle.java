package dev.emregecer.leetcode.problems.easy;

/**
 * <a href="https://leetcode.com/problems/excel-sheet-column-title/">Excel Sheet Column Title</a>
 * Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
 * <p>
 * For example:
 * <p>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: columnNumber = 1
 * Output: "A"
 * <p>
 * Example 2:
 * <p>
 * Input: columnNumber = 28
 * Output: "AB"
 * <p>
 * Example 3:
 * <p>
 * Input: columnNumber = 701
 * Output: "ZY"
 */
public class ExcelSheetColumnTitle {

    public String convertToTitle(int columnNumber) {
        StringBuilder builder = new StringBuilder();

        while (columnNumber > 0) {
            // Adjust the column number to be 0-based
            columnNumber--;

            // Get the remainder when divided by 26 (number of letters in the English alphabet)
            int remainder = columnNumber % 26;

            // Convert the remainder to the corresponding letter and prepend it to the result
            builder.insert(0, (char) ('A' + remainder));

            // Update the column number for the next iteration
            columnNumber /= 26;
        }

        return builder.toString();
    }
}
