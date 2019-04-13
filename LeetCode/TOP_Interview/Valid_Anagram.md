# Valid Anagram
Address:[LeetCode 242](https://leetcode.com/problems/valid-anagram/)
## Description
> Given two strings s and t , write a function to determine if t is an anagram of s.
## Examples
* Example 1:
```
Input: s = "anagram", t = "nagaram"
Output: true
```
* Example 2:
```
Input: s = "rat", t = "car"
Output: false
```
* Note:You may assume the string contains only lowercase alphabets.
## Break Down
* What is Anagram in this problem mean?
  - Google says that Anagram is a pair of words have same characterset
  - length should be the same
  - occurance time of each character should be the same
  - null pairs is Anagram

## Tricky Part
* HashMap
  - HashMap build in functions `put` when treat same key, the value will overwrite
  - Key will be unique in HashMap
* equals
  - String1.equals(String2);
  - Arrays.equals(arr1,arr2);

## Solution
* [Sorted solution](https://github.com/VanessaTang95/Algorithm/blob/master/LeetCode/TOP_Interview_Solution/Valid_Anagram1.java)
  - `T(n)=O(nlogn); ` reason: Arrays.sort() Time comlexity would be that
  - `Space Complexity: O(1)` Attention: in java, using `.toCharArray()` actually make a copy of that String, the space complexity should be O(n),but considering different language have different space comsuming, take this part as O(1);
* [Use array to solve](https://github.com/VanessaTang95/Algorithm/blob/master/LeetCode/TOP_Interview_Solution/Valid_Anagram2.java)
  - T(n)=O(n);
  - S(n)=O(1);

## Related problem
* [Group Anagrams]()
* [Palindrome Permutation]()
* [Find All Anagrams in a String]()
