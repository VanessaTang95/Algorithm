# How to write a good algorithm and even program? - Getting Started by binary search
## Array can speak a lot
A lot of algorithms are actually based on array
* sorting problem：select sort, insertion sort, merge sort, quick sort
* searching problem: binary search
* data structure design：stack，queue/priority queue，heap

## So, how to coding in the proper way?
Let's code a _binary search_
 - fun fact
 - binary search was first developed in 1946
 - But the 1st binary search without bugs was developed in 1962

## DIY a Binary search
* Key Idea
  - Efficient in sorted Array
  - divide the array into two part
  - left < target, search the right part; right > target, search the left part
* Key to solution
  - find the base case to jump out of loop/recursion
  - find the range that can make problem smaller
### change of range
#### when the range is \[left,right\];
   `
    when right=arr.length-1
    base case: left<=right
    function case:
      target > arr\[mid\] --> left=mid+1;
      target < arr\[mid\] --> right=mid-1;
    `

#### when the range is [left,right)
  `
  when right=arr.length
  base case: left < right
  function case:
    target > arr\[mid\] -->left=mid+1;
    target < arr\[mid\] -->right=mid;
  `
#### Tricky Bugs
* the define of Mid
* `mid=(left+right)/2` may cause stack overflow: the value of `left+right` is over the range of integer
* so we use `mid=left+(right-left)/2`

## Summary
* know why we set up variable
* base case to stop loop/recursion
* test case considered!!! small data set -> mass data set
