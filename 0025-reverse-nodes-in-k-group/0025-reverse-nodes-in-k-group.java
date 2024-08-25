class Solution
{
    public ListNode reverse(ListNode head)
    {
        ListNode p=head,q=null,r=null; 
        while(p!=null)
        {
            r = q; 
            q = p; 
            p = p.next; 
            q.next = r;
        }
        return q;
    }
    public ListNode FindKthNode(ListNode temp,int k)
    {
        int i; 
        for(i=1 ; i<=k-1 ; i++)
        {
            if(temp!=null)
            temp = temp.next;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k)
    {
        ListNode temp = head; 
        ListNode prevNode = null; 
        while(temp!=null)
        {
          ListNode KthNode = FindKthNode(temp,k); 
          if(KthNode==null)
          {
             if(prevNode!=null)
             {
                prevNode.next = temp;
             }
             break;
          }
          ListNode curr = KthNode.next;
          KthNode.next = null;  
          ListNode revNode = reverse(temp); 
          if(temp==head)
          {
            head = revNode; 
          }
          else 
          {
             prevNode.next = revNode;
          }
           prevNode = temp;
          temp = curr; 
         
        } 
        return head;
    }
}