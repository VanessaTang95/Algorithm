# LinkedList
* Why is LinkedList important?
  - real dynamic data structure
  - simplest dynamic data structure
  - better understanding on pointers
  - better understanding on recursion
  - assisted in making other data structure, like graphs

## Feature
* constructor:
```java
class Node{
  E e;//stored value
  Node next;//refer to next Node
}
```
* example: a-->b-->c-->null
  - a: head
  - c: tail
* cannot access randomly (without index)
* no need to consider fixed size problem

## array vs linkedlist
* array should be used in quick access situation
* Linkedlist should be used in dynamic stored which don't need to consider about the size

## Design by scratch
* add elements from head
```java
head=new Node(e,head);
```
* insert elements inside linkedlist, need to add another pointer
```java
node.next=previous.next;
previous.next=node;
```
