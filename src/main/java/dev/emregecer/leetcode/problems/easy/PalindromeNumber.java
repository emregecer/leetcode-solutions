package dev.emregecer.leetcode.problems.easy;

/**
 * <a href="https://leetcode.com/problems/palindrome-number/">Palindrome Number</a>
 * Given an integer x, return true if x is a
 * palindrome and false otherwise.
 * <p>
 * Example 1:
 * <p>
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 */
public class PalindromeNumber {

    public boolean isPalindromeViaStringUsage(int x) {
        if (x < 0) {
            return false;
        }

        String numAsStr = String.valueOf(x);

        String reversed = new StringBuilder(numAsStr).reverse().toString();

        return reversed.equals(numAsStr);
    }

    public boolean isPalindromeWithoutStringUsage(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        //1234
        //First loop: digit = 4, reversed = 4, x = 123
        //Second loop: digit = 3, reversed = 43, x = 12
        //Third loop = digit = 2, reversed = 432, x = 1
        //Fourth loop = digit = 1, reversed = 4321, x = 0
        //END: 1234 != 4321
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }

    public boolean isPalindrome(int x) {
        return isPalindromeWithoutStringUsage(x);
    }
}
