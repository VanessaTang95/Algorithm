/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        return reverse(head,null);

    }


    public ListNode reverse(ListNode head, ListNode newNode){
        if(head==null){
            return newNode;
        }
        ListNode next=head.next;
        head.next=newNode;
        newNode=head;
        return reverse(next,newNode);
    }
}
