public ListNode findMiddleNode(ListNode head) {
    if(head==null){
        return null;
    }

    ListNode slow=head, fast=head;
    while(fast!=null && fast.next!=null && fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;

}
