/*Given the head of a singly linked list, return true if it is a 
palindrome
 or false otherwise.

 

Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false */
public class Palindrome_Linked_List {
    public ListNode reverse(ListNode current)
    {
        ListNode curr=current;
        ListNode prev=null;
        ListNode temp;
        while(curr!=null)
        {
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode mid=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            mid=mid.next;
        }
        ListNode last=reverse(mid);
        while(last!=null)
        {
            if(last.val==head.val)
            {
                last=last.next;
                head=head.next;
            }
            else{
                return false;
            }
            
        }
        return true;
    }
}
