package dev.emregecer.leetcode.problems.easy;


import dev.emregecer.leetcode.util.ListNode;

/**
 * <a href="https://leetcode.com/problems/merge-two-sorted-lists">Merge Two Sorted List</a>
 * You are given the heads of two sorted linked lists list1 and list2.
 * <p>
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Return the head of the merged linked list.
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to serve as the head of the merged list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Continue as long as both input lists are not empty
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        // If one of the input lists is not empty, attach it to the merged list
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }
}
