//jshint esversion:6
//In javascript
//declare and initialization
const strings=["a","b","c","d"];
//use 4*4 =16 bytes of storage

//access
let letter3=strings[2];

//push
//add to the end of the array
//T(n)=O(1)
strings.push("e");

//add to the first
//unshift
//T(n)=O(n)
strings.unshift('x');

//add to the middle
//O(n)
//splice(startIndex,deleteCount,insertion)

//delete the last element of the Array
//pop
//T(n)=O(1)
strings.pop();

//delete the 1st element
//shift
//T(n)=O(1)
string.shift();
