# Symmetric Tree
---
## Description

> Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

> For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
```
    1
   / \
  2   2
 / \ / \
3  4 4  3
```
> But the following [1,2,2,null,3,null,3] is not:
```
    1
   / \
  2   2
   \   \
   3    3
   ```
* Note: Bonus points if you could solve it both recursively and iteratively.

## Solution
* Thoughts: Symmetric --> Mirror --> left.val = right.val --> vice versa

*[recursive solution](https://github.com/VanessaTang95/Algorithm/blob/master/LeetCode/Top100_Liked_Solution/SymmetricTreeRecurse.java)
  - Time Complexity: O(n);
  - Space Complexity: worst case: O(n);

[iterative solution]()

## Related Problem
* [Binary Tree Inorder Traversal]()
* [Employee Importance]()
* [Open the Lock]()

## Possible Follow-up
If you have done it recursively, follow-up: can you do it iteratively?
