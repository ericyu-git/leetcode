//86. Partition List

package com.leetcode.exers;

public class partitionList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(2);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		int x = 3;
		ListNode res = partition(head, x);
		while (res != null) { 
			System.out.print(res.val + " ");
			res = res.next;
		}
	}
	public static ListNode partition(ListNode head, int x) {
        ListNode loList = new ListNode(0);
        ListNode hiList = new ListNode(0);
        ListNode newHead = loList;
        ListNode hiHead = hiList;
        
        while (head != null) {
            if (head.val < x ) {
                ListNode node = new ListNode(head.val);
                loList.next = node;
                loList = node;
                head = head.next;
            } else {
                ListNode node = new ListNode(head.val);
                hiList.next = node;
                hiList = node;
                head = head.next;
            }
        }
        loList.next = hiHead.next;
        return newHead.next;
    }
}
