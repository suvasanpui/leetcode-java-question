/*Given the head of a linked list, return the list after sorting it in ascending order.

 

Example 1:


Input: head = [4,2,1,3]
Output: [1,2,3,4]
Example 2:


Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]
Example 3:

Input: head = []
Output: [] */
public class Sort_List {
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
    ListNode merge(ListNode fast,ListNode second)
    {
        
        
        ListNode ans=new ListNode(0);
        ListNode curr=ans;
        while(fast!=null && second!=null)
        {
            if(fast.val>second.val)
            {
                curr.next=second;;
                second=second.next;

            }else{
                curr.next=fast;
                fast=fast.next;
            }
            curr=curr.next;
        }
        if(fast!=null || second!=null)
        {
            curr.next=(fast!=null)?fast:second;
        }
        return ans.next;
    }
    ListNode mid1(ListNode head1)
    {
        ListNode fast=head1;
        ListNode slow=head1;
        ListNode prev=null;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        return prev;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode mid=mid1(head);
        ListNode second_half=mid.next;
        mid.next=null;
        ListNode l1=sortList(head);
        ListNode l2=sortList(second_half);
        return merge(l1,l2);
    }
    
}
}
