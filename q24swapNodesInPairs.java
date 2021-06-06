//24. Swap Nodes in Pairs

public ListNode swapPairs(ListNode head) {
	        if(head == null || head.next == null) return head;
	        ListNode curNode = head;
	        ListNode nextNode = head.next;
	        while(nextNode != null){
	            int temp = curNode.val;
	            curNode.val = nextNode.val;
	            nextNode.val = temp;
	            if(nextNode.next == null || nextNode.next.next == null)
	            	return head;
	            curNode = nextNode.next;
	            nextNode = curNode.next;
	        }
	        return head;
	    }