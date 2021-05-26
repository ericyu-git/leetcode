class Solution { 

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) { 

        ListNode n= new ListNode(0); 

        ListNode i=l1,j=l2,sum=n; 

        int plus=0; 

        int value=0; 

        while(i!=null || j!=null){ 

            int x=(i!=null)? i.val : 0; 

            int y=(j!=null)? j.val : 0; 

            if(x+y>=10){ 

                value=(x+y)%10+plus; 

                plus=1; 

            }else{ 

                value=(x+y)%10+plus; 

                plus=0; 

            } 

            sum.next=new ListNode(value); 

            sum=sum.next; 

            i=i.next; 

            j=j.next; 

        } 

       return n.next;  

      } 

} 