# Relate Element
## Description
>Given an array nums and a value val, remove all instances of that value in-place and return the new length.

>Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

>The order of elements can be changed. It doesn't matter what you leave beyond the new length.

## Questions to ask
* Can we copy array
* How do we define remove? Physically corp the array size?
* What is the output of this problem - this case the length or new array
* Should we care about the order of the original array
* what will be the output of null array


## Examples
* Example 1
```
Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2.

It doesn't matter what you leave beyond the returned length.
```
* Example 2
```
Given nums = [0,1,2,2,3,0,4,2], val = 2,

Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.

Note that the order of those five elements can be arbitrary.

It doesn't matter what values are set beyond the returned length.
```

## My Thoughts
* Use two pointers, one in loop, one used as manul operate pointer; make the element equals to value to the end of the array, and then crop the array

## Solution
* [Two pointer Solution]()
  - But the original array didn't crop, it automatically cropped by LC
  - T(n)=O(n)
  - S(n)=O(1)
## Related Problem
* [remove duplicates from sorted array]()
