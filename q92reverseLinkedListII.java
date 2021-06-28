//92. Reverse Linked List II

package com.teddycoupon.practise;

public class reverseLinkedListII {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(2);
//		ListNode node2 = new ListNode(3);
//		ListNode node3 = new ListNode(4);
//		ListNode node4 = new ListNode(5);
		head.next = node1;
//		node1.next = node2;
//		node2.next = node3;
//		node3.next = node4;
		int l = 1, r = 2;
		ListNode newHead = reverseBetween(head, l, r);
		while (newHead != null) {
			System.out.print(newHead.val + " ");
			newHead = newHead.next;
		}
	}
	public static ListNode reverseBetween(ListNode head, int left, int right) {
	    ListNode pre = new ListNode(0);
	    pre.next = head;
	    ListNode start =pre;
	    ListNode lastNode = pre;

	    for (int i = 0; i <= right; i++) {
	        if (i < left) {
	            start = pre.next;
	            lastNode = pre;
	        }
	        pre = pre.next;
	    }
	    
	    ListNode newHead = rev(start, new ListNode(0), right - left);
	    lastNode.next = newHead;
	    for (int i = 0; i < right - left; i++) {
	        newHead = newHead.next;
	    }
	    newHead.next = pre != null ? pre : null;
//	    head =  
	    return lastNode.val == 0 ? lastNode.next : head;
	    }
	    public static ListNode rev(ListNode head, ListNode newHead, int n) {
	        ListNode nx = head.next;
	        head.next = newHead;
	        if ( n == 0 ) return head;

	        return rev(nx, head, n - 1);
	    }
}
