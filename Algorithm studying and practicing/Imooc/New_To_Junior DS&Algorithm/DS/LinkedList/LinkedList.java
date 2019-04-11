public class LinkedList<E>{
//property
  private class Node{
    public E e;
    public Node next;

//constructor
    public Node(E e, Node next){
      this.e=e;
      this.next=next;
    }

    public Node(E e){
      this(e,next:null);
    }

    public Node(){
      this(e:null,next:null);
    }

    @Override
    public String toString(){
      return e.toString();
    }

    private Node head;
    private int size;//users cannot modify

    public LinkedList(){
      head=null;
      size=0;
    }

    public int getSize(){
      return size;
    }

    public boolean isEmpty(){
      return size==0;
    }

    public void addFirst(E e){
      Node node=new Node(e);
      node.next=head;
      head=node;
      size++;
    }

    
  }
}
