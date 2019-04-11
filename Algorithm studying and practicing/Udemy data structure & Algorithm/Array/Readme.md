# Array
linear data structure
### Q1:Why we need an array?

### Types of array
* One Dimension
* Multiple Dimension

### Store in memory
* Storage in RAM

### Common operation of an array
* declaring, instantiation,initializing
  - declare : create a reference to array
  - instantiation : creates an array, allocate the array, default is whole-zero array
  - initializing:assign values to cells in Array
* insert a value
  - index starts from 0 -- S(n)&T(n) = O(1)
* traverse a given Array
  - Traverse: visit each cell of the array
  - use a loop
  - T(n)=O(n),S(n)=O(1)
* CRUD array
  - access given cell S(n) & T(n)=O(1)
  - search - S(n)=O(1),T(n)=O(n)
  - delete - S(n)=O(1),T(n)=O(1)

### In Java
* declare and initialization:
  - `int arr[]={}`
  - `int arr[]=new int[size]`
