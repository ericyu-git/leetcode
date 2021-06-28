//203. Remove Linked List Elements

package com.leetcode.exers;

public class removeLinkedListElements {

	public static void main(String[] args) {
		ListNode head = new ListNode(7);
		ListNode newHead = head;
		int val = 7;
		for (int i = 0; i < 4; i++) {
			ListNode node = new ListNode(7);
			head.next = node;
			head = node;
		}
		ListNode res = removeElements(newHead, val);
		while (res != null) {
			System.out.print(res.val + " ");
			res = res.next;
		}
	}
	public static ListNode removeElements(ListNode head, int val) {
		ListNode p1 = new ListNode(0);
        ListNode p2 = head;
        ListNode ans = p1;
        p1.next = head;
        if (head == null) return head;
        while (p2 != null && p2.next != null) {
            if (p2.val == val) {
                p2 = p2.next;
                p1.next = p2;
            } else {
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        if (p2.val == val) {
            p1.next = null;
        }
        return ans;
    }
}
