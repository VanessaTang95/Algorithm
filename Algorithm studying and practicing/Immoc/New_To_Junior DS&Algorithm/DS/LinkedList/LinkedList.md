# LinkedList
* 为什么链表很重要
  - 链表是真正的动态数据结构
  - 最简单的动态数据结构
  - 更加深入的理解引用/指针
  - 更深入理解递归机制（recursion）
  -辅助组成其他数据结构，比如图/hashtable

## 组成
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
* 无法随机访问（通过索引直接拿元素）
* 不需要处理固定容量问题

## 数组 VS 链表
* 数组最好用于有索引必要的情况，支持快速查询
* 链表：处理动态存储，不被容量困住的情况

## 设计特点
* 从链表头添加元素
```java
head=new Node(e,head);
```
* 从链表中添加元素,新加一个指针
```java
node.next=previous.next;
previous.next=node;
```
