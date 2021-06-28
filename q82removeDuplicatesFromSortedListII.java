//82. Remove Duplicates from Sorted List II

package com.leetcode.exers;

public class removeDuplicatesFromSortedListII {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(4);

		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		ListNode res = deleteDuplicates(head);
		while (res != null) { 
			System.out.print(res.val + " ");
			res = res.next;
		}
	}
		public static ListNode deleteDuplicates(ListNode head) {
			if (head == null) return null;
	       ListNode newHead = new ListNode(0);
	       newHead.next = head;
	       ListNode pre = newHead;
	       ListNode nx = head;
	       while (nx != null) {
	    	   while (nx.next != null && nx.val == nx.next.val) {
	    		   nx = nx.next;
	    	   }
	    	   if (pre.next == nx) {
	    		   pre = nx;
	    	   } else {
	    		   pre.next = nx.next;
	    	   }
	    	   nx = nx.next;
	       }
	       return newHead.next;
	    }
}
