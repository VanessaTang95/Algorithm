# Find All Duplicate in an Array
Bloomberg
Address:[LeetCode 442](https://leetcode.com/problems/find-all-duplicates-in-an-array/)
## Decription
> Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once. Find all the elements that appear twice in this array. Could you do it without extra space and in O(n) runtime?

## Examples
```
Input:
[4,3,2,7,8,2,3,1]

Output:
[2,3]
```

## Thoughts
* use hashmap to record the occurance of each number
* similar question on firecode.io, use `TreeSet`

## Solution
* [TreeSet Solution]()
  -T(n)=O(n);S(n)=O(1)
* [Math.ab Solution]()
  - T(n)=O(n); S(n)=O(1)
  - but this one is faster

## Related Problems
* [Find All Numbers Disappeared in an Array]()
