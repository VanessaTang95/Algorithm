# Remove Duplicated from Sorted Array
Facebook + Bloomberg + Microsoft
## Description
> Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

> Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

## Questions to ask
* How do define remove, physically remove and corp the size of array? or move all targets to the end?
* What would the order of elements be like? in order or not?

## Examples
* Example 1
```
Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.
```
* Example 2
```
Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

It doesn't matter what values are set beyond the returned length.
```
## My Thoughts
It should be silimar to the _move zeroes_ problem and _remove elements_ problem, we will use two pointers, one in loop, another one as manul pointer

## Solution
* [Two pointers solution](https://github.com/VanessaTang95/Algorithm/blob/master/Algorithm%20studying%20and%20practicing/Immoc/master_algorithmInterview/Array/RemoveDuplicates.java)
  - be careful about the order(judge condition and its operataion case)
  - T(n)=O(n)
  - S(n)=O(1)

## Related Problem
* [Remove Duplicated from Sorted Array II]()
