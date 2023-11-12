/*Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3. */
public class Middle_of_the_Linked_List {
    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode mid=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            mid=mid.next;
        }
        ListNode curr=mid;
        return curr;
    }
}
