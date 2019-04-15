public ListNode deleteAtTail(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }

        ListNode nextNode=head.next;
        ListNode curNode=head;

        while(nextNode.next!=null){
            curNode=nextNode;
            nextNode=nextNode.next;
        }

    curNode.next=null;

    return head;

}
