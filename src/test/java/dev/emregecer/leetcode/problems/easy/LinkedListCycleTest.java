package dev.emregecer.leetcode.problems.easy;

import dev.emregecer.leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListCycleTest {

    private final LinkedListCycle linkedListCycle = new LinkedListCycle();

    @Test
    public void test1() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Creating a cycle

        assertTrue(linkedListCycle.hasCycle(head));
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head.next; // Creating a cycle

        assertTrue(linkedListCycle.hasCycle(head));
    }

    @Test
    public void test3() {
        ListNode head = new ListNode(1);

        assertFalse(linkedListCycle.hasCycle(head));
    }
}
