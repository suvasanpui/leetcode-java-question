/*Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

 

Example 1:


Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
Example 2:

Input: head = [], val = 1
Output: [] */
public class Remove_linked_list_element {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newhead=new ListNode(-1);
         newhead.next=head;
         ListNode curr=newhead;
         while(curr.next!=null)
         {
             if(curr.next.val==val){
                 curr.next=curr.next.next;
             }else
                 {
                     curr=curr.next;
                 }
         }
         return newhead.next;
     }
}
