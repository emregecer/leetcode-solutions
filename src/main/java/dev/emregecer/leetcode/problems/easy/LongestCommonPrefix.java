package dev.emregecer.leetcode.problems.easy;

/**
 * <a href="https://leetcode.com/problems/longest-common-prefix/">Longest Common Prefix</a>
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 *
 * Example 1:
 * <p>
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * <p>
 * Example 2:
 * <p>
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take the first string as the reference for comparison
        String reference = strs[0];

        // Compare the current character with the same position in all other strings
        for (int i = 0; i < reference.length(); i++) {
            char c = reference.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    // If a character doesn't match, or we reach the end of any string, return the prefix
                    return reference.substring(0, i);
                }
            }
        }

        // If we reach this point, the entire reference string is a common prefix
        return reference;
    }
}
