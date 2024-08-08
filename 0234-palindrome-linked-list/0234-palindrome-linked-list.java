class Solution
{   
    public ListNode Reverse(ListNode p)
    {
        ListNode q=null,r=null; 
        while(p!=null)
        {
            r= q; 
            q = p; 
            p = p.next; 
            q.next = r;
        } 
        return q;
    }
    public boolean isPalindrome(ListNode head)
    {
       ListNode slow=head,fast=head; 
       while(fast.next!=null && fast.next.next!=null)
       {
         slow = slow.next; 
         fast = fast.next.next;
       } 
      ListNode second =  Reverse(slow.next); 
      ListNode first = head;  
      while(second!=null)
      {
        if(first.val != second.val)
        {
            return false;
        } 
        first = first.next; 
        second = second.next; 
      }
      return true;

    }
}