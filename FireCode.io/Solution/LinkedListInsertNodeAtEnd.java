// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode insertAtTail(ListNode head, int data) {
    ListNode target=new ListNode(data);

    if(head==null){
        return target;
    }

    ListNode curNode=head;
    while(curNode.next!=null){
        curNode=curNode.next;
    }

    curNode.next=target;
    target.next=null;
    return head;


}
