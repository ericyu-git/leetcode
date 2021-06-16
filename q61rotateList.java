//61. Rotate List

package com.leetcode.exers; 

public class rotateList {

	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode nxNode = head;
		int n = 2;
		for (int i = 1; i <= 5; i++) {
			ListNode node = new ListNode(i);
			nxNode.next = node;
			nxNode = nxNode.next;			
		}
		head = head.next;
		ListNode showNode = rotateRight(head, n);
		while(showNode != null) {
			System.out.print(showNode.val + " ");
			showNode = showNode.next;			
		}
	}
       public static ListNode rotateRight(ListNode head, int k) {
	       if (head == null || head.next == null) return head; 
           int n = 0;
           ListNode counter = head;
           while (counter != null) {
               n++;
               counter = counter.next;
           }
           for (int i = 0; i < (k % n); i++) {
	        	ListNode temp = head;
	        	while (temp.next.next != null) {
	        		temp = temp.next;
	        	}
	        	ListNode lastNode = temp.next;
	        	temp.next = null;
	        	lastNode.next = head;
	        	head = lastNode;
	        }
	        return head;
	    }
