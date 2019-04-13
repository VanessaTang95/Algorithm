# First Unique Character in a String
Address:[Leetcode 387](https://leetcode.com/problems/first-unique-character-in-a-string/)

## Description
> Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

>Examples:
```
s = "leetcode"
return 0.
```
```
s = "loveleetcode",
return 2.
```
* Note: You may assume the string contain only lowercase letters.

## First Thoughts
* Questions:
  - what if the string is null? return what value?
  - what value should return? index? character? boolean or both?
  - what if no unique character in this string? what should be return?
  - is the string all lowercase or uppercase?
* Thoughts: use a array to store the character's occurance
  - problems: if use `char-'a'`,Array count[] is in alphabet order, cannot promise the first letter with 1 occurance is the first unique letter in a String -- this should not be worried, since counts acts like a dictionary

## Solution Idea
Use sth to store the occurance of each character in String

## Solutions
* [HashMap](https://github.com/VanessaTang95/Algorithm/blob/master/LeetCode/Tag_Easy_Solution/Find_1st_Unique_Char.java)
  - T(n)=O(n)
  - S(n)=O(n)
* [Array](https://github.com/VanessaTang95/Algorithm/blob/master/LeetCode/Tag_Easy_Solution/Find_1st_Unique_Char2.java)
  - T(n)=O(n)
  - S(n)=O(n)
  - But this is a fixed array, so in this case, it's faster than hashmap

## related problems
* [Sort Charaters by Frequency]()
