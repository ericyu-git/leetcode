//143. Reorder List

package com.leetcode.exers;

public class reorderList {

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
		reorderList(head);
		while (shownode != null) {
			System.out.print(shownode.val+" ");
			shownode = shownode.next;
		}	
	}
	public static void reorderList(ListNode head) {
        ListNode start = head;
        ListNode nxN = head.next;
        ListNode nodeSize = head;
        int n = 0;
        while (nodeSize != null) {
        	nodeSize = nodeSize.next;
        	n++;
        }
        int times = n % 2 == 0 ? n / 2 - 1 : n / 2;
        insert(head, start, nxN, times);
    }
    public static void insert(ListNode head, ListNode start, ListNode nxN, int times) {
        if (times > 0) {
            ListNode end = head;
            ListNode secEnd = head;
            while (secEnd.next.next != null) {
            	secEnd = secEnd.next;
            }
            end = secEnd.next;
            end.next = nxN;
            start.next = end;
            secEnd.next = null;
            insert (head, start.next.next, nxN.next, times - 1);
        }
    }
}
