package dev.emregecer.leetcode.problems.easy;

import dev.emregecer.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeTwoSortedListsTest {

    private final MergeTwoSortedLists merger = new MergeTwoSortedLists();

    @Test
    public void test1() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        assertLinkedList(merger.mergeTwoLists(l1, l2), new int[]{1, 1, 2, 3, 4, 4});
    }

    @Test
    public void test2() {
        assertLinkedList(merger.mergeTwoLists(null, null), new int[]{});
    }

    @Test
    public void test3() {
        assertLinkedList(merger.mergeTwoLists(null, new ListNode(0)), new int[]{0});
    }

    private void assertLinkedList(ListNode list, int[] expected) {
        for (Integer i : expected) {
            assertEquals(i, list.val);
            list = list.next;
        }
    }
}
