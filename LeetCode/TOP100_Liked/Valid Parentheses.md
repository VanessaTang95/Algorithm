# Valid Parentheses

## Description
> Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
> An input string is valid if:
> 1. Open brackets must be closed by the same type of brackets.
> 2. Open brackets must be closed in the correct order.
> 3.Note that an empty string is also considered valid.
## Examples
* Example 1:
  ```
     Input: "()"
     Output: true
  ```

* Example 2:
```
Input: "()[]{}"
Output: true
```

* Example 3:
```
Input: "(]"
Output: false
```

* Example 4:
```
Input: "([)]"
Output: false
```
* Example 5:
```
Input: "{[]}"
Output: true
```
---
## Solution
* [Solution1](https://github.com/VanessaTang95/Algorithm/blob/master/LeetCode/Top100_Liked_Solution/ValidParentheses.java)
  - Time complexity should be O(n);
* [Solution2 (brilliant one)](https://github.com/VanessaTang95/Algorithm/blob/master/LeetCode/Top100_Liked_Solution/ValidPharentheses2.java)
  - T(n)=O(n);

## Related problems:
* [Generate Parentheses]()
* [Longest Valid Parentheses]()
* [Remove Invalid Parentheses]()
* [Check If Word Is Valid After Substitutions]()
