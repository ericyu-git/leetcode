class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode res = ans;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0 ){
            ListNode curr = new ListNode(0);
            int sum = ((l1 == null)? 0:l1.val) + ((l2 == null)? 0:l2.val) + carry;
            curr.val = sum % 10;
            carry = sum / 10;
            ans.next = curr;
            ans = curr;
            
            l1 = (l1 == null)? l1: l1.next;
            l2 = (l2 == null)? l2: l2.next;
        }
        return res.next;
      }
}
