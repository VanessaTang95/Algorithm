# Fibonacci Number
Address:[LeetCode 509](https://leetcode.com/problems/fibonacci-number/)
## Description
> The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
> F(0) = 0,   F(1) = 1
> F(N) = F(N - 1) + F(N - 2), for N > 1.
> Given N, calculate F(N).

## Examples:
* Example 1:
```
Input: 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
```
* Example 2:
```
Input: 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
```
*Example 3:
```
Input: 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
```

## First Thoughts
* Using brutal solution, which is using the rule of Fibonacci

## solution
* [Brutal Solution](https://github.com/VanessaTang95/Algorithm/blob/master/LeetCode/Tag_Easy_Solution/Fib_Solution1.java)
  - T(n)=T(n-1)+T(n-2)=O(2^n)
  - S(n)=O(n)
* [iternative Solution](https://github.com/VanessaTang95/Algorithm/blob/master/LeetCode/Tag_Easy_Solution/Fib_Solution3.java)
  - Probably the best solution so far
  - T(n)=O(n)
  - S(n)=O(1)
  - It's dp solution
* [recursive Solution](https://github.com/VanessaTang95/Algorithm/blob/master/LeetCode/Tag_Easy_Solution/Fib_Solution2.java)
  - T(n)=O(n)
  - S(n)=O(1)
  - It's dp Solution
  - need to be careful about time limitation

## Similar Problem
* [Climbing Stairs]()
* [Split Array into Fibonacci Sequence]()
* [Length of Longest Fibonacci Subsequence]()
