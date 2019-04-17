/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
     //brutal solution
       if(head==null || head.next==null){
           return head;
       }

        if(head.next.next==null){
            return head.next;
        }


        int countSize=0;
        ListNode curNode=head;
        while(curNode!=null){
            curNode=curNode.next;
            countSize++;
        }

        int targetNodeIndex=0;
        if((0+countSize-1)%2!=0){//even number of nodes
            targetNodeIndex=1+(0+countSize-1)/2;
        }else{//odd number of nodes
            targetNodeIndex=(0+countSize-1)/2;
        }

        ListNode targetNode=head;
        while(targetNodeIndex--!=0){
            targetNode=targetNode.next;
        }

        return targetNode;
    }
}
