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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next == null)return head;

        //ListNode temp1=head;
        // ListNode temp=head;
        // head=head.next;
        // temp.next=head.next;
        // head.next=temp;
        
        

       return swap(head); 
    }
    public ListNode swap(ListNode hd) {
        if(hd ==null || hd.next == null) return hd;
        ListNode temp = hd.next;
        ListNode l = temp.next;
        hd.next=l;
        temp.next=hd;
        hd = temp;
        temp=temp.next;
        temp.next = swap(l);
        return hd;
    }
}