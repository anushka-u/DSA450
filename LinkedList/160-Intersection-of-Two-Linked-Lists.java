/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int LengthA = sizeOfList(headA);
        int LengthB= sizeOfList(headB);

        if(LengthA>LengthB)
        {
            int steps = LengthA-LengthB;
            for(int i=0;i<steps;i++)
            {
                headA=headA.next;
            }
        }
        else{
            int steps = LengthB-LengthA;
            for(int i=0;i<steps;i++)
            {
                headB=headB.next;
            }
        }

        while(headA!=headB)
        {
            headA=headA.next;
            headB=headB.next;
        }

        return headA;
    }

    public int sizeOfList(ListNode head)
    {
        int count=0;
        while(head!=null)
        {
            count++;
            head=head.next;
        }
        return count;
    }
}