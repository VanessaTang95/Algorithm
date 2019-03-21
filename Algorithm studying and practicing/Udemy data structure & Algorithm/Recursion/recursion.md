# Recursion

## What is Recursion?
#### Property
* Same operation is performed multiple times with different input
* make the problem smaller
* have a base condition to stop the Recursion

#### Examples
* find the value of target in binary search tree

#### tips
* problem can be broken down into similar sub-problem
* it heavily used in DS like Tree, Graphs, etc
* it heavily used in "Divide and Conquer","Greedy" and **"Dynamic Programming"**

##  How to work with Recursion
#### Format
* Pattern:
  - Recursive Case: case where the function occur
  - Base Case: Case where the function does not recur any more

#### How it work internally
* function stored in stack(LIFO)
* System have a function invocation section

#### How to solve mathmatic problems using Recursion
* Factorial
  - n! problem
  ```java
  public int factorial(int n){
    if(n==0){// I think based on the requirement of problem, in integer case, this base case could be n<1
      return
    }else{
      return (n*factorial(n-1));
    }
  }
  ```
* Fibonacci Series
  - first 2 numbers by definition are 0 & 1
  - A series of numbers in which each number is the sum of two preceding numbers
  - example: 0, 1, 1, 2, 3, 5, 8, 13, ......
  ```java
  //this case it's return the nth number
  public int fibonacci(n){
      if(n<1){
        throw new IllegalArgument("Ilegal Input");
      }else if(n==1 || n==2){
        //System.out.println(n-1); if want to print out the fibonacci series, starts with 0 and 1
        return n-1;
      }else{
        //output fibonacci(n-1)+Fibonacci(n-2)
        return fibonacci(n-1)+fibonacci(n-2);
      }
  }
  ```
## Recursion vs Iteration
* Space Efficiency: Recursion << Iteration
* Time Efficiency: Recursion << Iteration
* Ease of Code: Recursion >> Iteration

## When to use and when to avoid Recursion
#### When to use
* easily break down a problem into similar sub-problems
* if the input is not huge and it's okay to compromise the time and Space
* if we need a quick working solution instead of effcient one
#### When not to use
* specifically asking for time complexity and space complexity

## Practical Use of Recursion
* Stack
* Tree - Traversal/Seaching in Binary Searching Tree/Deletion
* Sorting - Quick Sort, Merge Sort
* Divide and Conquer
* Dynamic Programming
