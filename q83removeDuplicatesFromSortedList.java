//83. Remove Duplicates from Sorted List

package com.leetcode.exers;

public class removeDuplicatesFromSortedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(3);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		ListNode res = deleteDuplicates(head);
		while (res != null) { 
			System.out.print(res.val + " ");
			res = res.next;
		}
		

	}
	public static ListNode deleteDuplicates(ListNode head) {
        ListNode start = head;
        ListNode next = head.next;
        while (next != null) {
            if (start.val == next.val) {
                next = next.next;
                start.next = next;
            } else {
                start = start.next;
                next = next.next;
            }
        }
        return head;
    }
}
