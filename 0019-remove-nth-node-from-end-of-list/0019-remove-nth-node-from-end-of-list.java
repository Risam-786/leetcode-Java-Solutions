/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    
        ListNode temp = head;
        int len = 0;  
        while(temp!=null)
        {
            len++; 
            temp = temp.next;
        } //len=6  
        int t = len-n; //t = 4  
        if(t==0)
        {
            return head.next;
        }
        temp = head; 
        int i; 
        for(i=1 ; i<=t-1 ; i++)
        {
            temp = temp.next;
        }
         temp.next = temp.next.next; 
         return head;
    
}
    }
