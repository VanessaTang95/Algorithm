public ListNode findMiddleNode(ListNode head) {
    //use two loops to solve this
    //brutal
    if(head==null || head.next==null || head.next.next==null){
        return head;
    }

    int countSize=0;
    ListNode curNode=head;
    while(curNode!=null){
        curNode=curNode.next;
        countSize++;
    }

    int targetNodeIndex=(0+countSize-1)/2;
    ListNode targetNode=head;
    while(targetNodeIndex--!=0){
        targetNode=targetNode.next;
    }

    return targetNode;

}
