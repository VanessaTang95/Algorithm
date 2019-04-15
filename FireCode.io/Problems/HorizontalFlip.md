# Horizontal Flip
Infosys

## Description
> You are given an m x n 2D image matrix where each integer represents a pixel. Flip it in-place along its horizontal axis.

## Examples
```
Input image :
              1 1
              0 0
Modified to :
              0 0
              1 1

```

## Thoughts
* what is the output when the m=n=1? or matrix is empty?
* First thoughts is to use two pointers to solve this problem.
* Since it's only flip horizontally, so each row's value doesn't change. Thus we don't need to consider about the Matrix[][]

## Solution
[Solution](https://github.com/VanessaTang95/Algorithm/blob/master/FireCode.io/Solution/HorizontalFlip.java)
- T(n)=O(n)
- S(n)=O(1)
