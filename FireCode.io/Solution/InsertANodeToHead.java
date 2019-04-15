public ListNode insertAtHead(ListNode head, int data) {

            ListNode newHead=new ListNode(data);

            if(head==null){
                return newHead;
            }

            newHead.next=head;
            return newHead;


}
