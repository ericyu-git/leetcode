//21. Merge Two Sorted Lists

public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode head = ans;
        if(l1 == null && l2 == null) return ans.next;
        else if(l1 == null) return l2;
        else if(l2 == null) return l1;
        while(l1 != null || l2 != null){
           if(l1 == null && l2 != null){
               ans.next = l2;
               ans = ans.next;
               l2 = l2.next;
           }else if(l1 != null && l2 == null){
               ans.next = l1;
               ans = ans.next;
               l1 = l1.next;
           }else if(l1.val <= l2.val){
               ans.next = l1;
               ans = ans.next;
               l1 =l1.next;
           }else if(l1.val > l2.val){
               ans.next = l2;
               ans = ans.next;
               l2 = l2.next;             
           }
        }
      return head.next;  
    }