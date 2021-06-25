234. Palindrome Linked List

package com.leetcode.exers;

public class palindromeLinkedList {

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node21 = new ListNode(5);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(1);
		node1.next = node2;
		node2.next = node21;
		node21.next = node3;
		node3.next = node4;
		ListNode head = node1;
		System.out.println(isPalindrome(head));

	}
	public static boolean isPalindrome(ListNode head) {
        boolean ans = true;
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2 != null && p2.next != null) {
        	p1 = p1.next;
        	p2 = p2.next.next;
        }
        ListNode newHead = reverse(p1, null);
        while(newHead != null) {
        	if (head.val != newHead.val) 
        		return false;
        	head = head.next;
        	newHead = newHead.next;
        }
        return ans;
    }
	public static ListNode reverse(ListNode head, ListNode newHead) {
		if (head == null) 
			return newHead;
		ListNode next = head.next;
		head.next = newHead;
		return reverse(next, head);
	}
}
