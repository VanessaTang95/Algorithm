# Find the Number that appears once

Oracle

## Description
> Write a method that returns a number that appears only once in an array.
> Assume the array will surely have a unique value. The array will never be empty.

## Example
```
{1,2,3,4,1,2,4,3,5} ==> 5
```
## Thoughts
* before know more about the constraints
  - what if the array doen'y have unique number, what to return?
  - number size?
* When meet the problem with occurance, the first thought is _"Can I use a fixed array to solve this problem"_, and in this problem, it's not practical to do that(number not char)
* Then consider whether use HashMap or not

## Solution
[HashMap_Solution]()
  - T(n)=O(n)
  - S(n)=O(n)
