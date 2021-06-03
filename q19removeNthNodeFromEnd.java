//19. Remove Nth Node From End of List

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ans = new ListNode(0);
        ListNode lastNode = ans;
        ListNode preNode = ans;
        ans.next = head;
        for(int i = 0; i <= n; i++){
            lastNode = lastNode.next;
        }
        while(lastNode != null){
            lastNode = lastNode.next;
            preNode = preNode.next;
        }
        preNode.next = preNode.next.next;
        return ans.next;
    }