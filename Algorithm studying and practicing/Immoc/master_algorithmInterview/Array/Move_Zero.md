# Move Zeroes
(Facebook & Bloomberg)
## Description
> Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

## Question need to ask or clearify
* Is this Problem alowed copy array?
* Does the output have any constraints? like the order of the elements?
* Is this array sorted?
* How about the edge case? what is the output for null, or \[0\]?
* Any constraints in time complexity?

## Example
```
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
```
* note:
  - You must do this in-place without making a copy of the array.
  - Minimize the total number of operations.


## Problem break down
### my thoughts:(Also the things we need to ask interviewee)
* If the order of after-function array elements don't have specific requirement:
  - can we search for 0, and swap first 0 with last position,then shrink the right range; two pointers--> but then the array will be \[12,1,3,0,0\] very close to solution!!!
* If we can simply copy a array:
  - create another array, use one loop to put every non-zero elements into new array
  - then use another loop, copy the new array's elements into the original array
  - another for loop, index start as new array's size, end with original array's length, put rest elements as 0
### others thoughts
* two pointers


## Solution
* If copy array is allowed -[solution](https://github.com/VanessaTang95/Algorithm/blob/master/Algorithm%20studying%20and%20practicing/Immoc/master_algorithmInterview/Array/Move_Zeroes.java)
  - T(n)=O(n)
  - S(n)=O(n)
* [two pointers](https://github.com/VanessaTang95/Algorithm/blob/master/Algorithm%20studying%20and%20practicing/Immoc/master_algorithmInterview/Array/Move_Zeroes_2.java)
  - T(n)=O(n)
  - S(n)=O(1)


## Related Problems
[remove element]()
