# Find The First Non Duplicate Character in a String
---
## Leetcode
* [First Unique Character in a String]()
  - difference: this ask for character, leetcode ask for index

---
## Description
> Find the first non-duplicate character in a string. Return null if no unique character is found.

## Examples
```
firstNonRepeatedCharacter( "abcdcd" ) --> 'a'
firstNonRepeatedCharacter( "cbcd" ) --> 'b'
firstNonRepeatedCharacter( "cdcd" ) --> null
```

## First Thoughts
* Questions:
  - what if the string is null? return what value?
  - what value should return? index? character? boolean or both?
  - what if no unique character in this string? what should be return?
  - is the string all lowercase or uppercase?
* Thoughts: use a array to store the character's occurance
  - problems: if use `char-'a'`,Array count[] is in alphabet order, cannot promise the first letter with 1 occurance is the first unique letter in a String
  - Thus, use HashMap

## Solution
* [HashMap Solution]()
* [Array Solution]()
