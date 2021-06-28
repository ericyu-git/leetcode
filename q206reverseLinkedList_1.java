//206. Reverse Linked List

package com.leetcode.exers;

public class test {

	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode newNode = head;
		ListNode shownode = head;
		for (int i = 1; i < 6; i++) {
			ListNode node = new ListNode(i);
			newNode.next = node;
			newNode = node;			
		}
		head = head.next;
		shownode = reverseList(head);
		while (shownode != null) {
			System.out.print(shownode.val+" ");
			shownode = shownode.next;
		}	
	}
	public static  ListNode reverseList(ListNode head) {
	    ListNode newHead = null;
	    while (head != null) {
	        ListNode next = head.next;
	        head.next = newHead;
	        newHead = head;
	        head = next;
	    }
	    return newHead;
	}