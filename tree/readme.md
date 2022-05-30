# Trees
tree is non-linear and a hierarchical data structure consisting of a collection of nodes such that each node of the tree stores a value, a list of references to nodes (the “children”).    

## Challenge
in binary tree we use Queue to store data inside it  which mean that we use another data structure to enhance our algorithm  
## Approach & Efficiency
In binary search tree the search is Big O log(n) it is more efficient than binary tree which is O(n)
## API
Binary Tree
Create a Binary Tree class
Define a method for each of the depth first traversals:
pre order
in order
post order which returns an array of the values, ordered appropriately.  


Binary Search Tree  
Create a Binary Search Tree class   
This class should be a sub-class (or your languages equivalent) of the Binary Tree Class, with the following additional methods:   
Add    
Arguments: value   
Return: nothing    
Adds a new node with that value in the correct location in the binary search tree.   
Contains   
Argument: value   
Returns: boolean indicating whether or not the value is in the tree at least once.   

findMaxNodeValue
This method will search on the max node value  inside tree using binary tree    
![find max in tree](https://user-images.githubusercontent.com/97651232/162583139-ae6d528a-6589-4626-adca-1cd78df257f8.png)
bridthFirst   
This method will return array list of tree node value that traverse by each level   
![image](https://user-images.githubusercontent.com/97651232/163709601-e162630f-fda4-471b-bcd5-10e2019e2953.png)

FizzBuzz  
This method will return fizz the number mod 3 equal zero it will return also buzz if  the number mod 5 equal zero and it will return also FizzBuzz if  the number mod 15 equal zero  
![done](https://user-images.githubusercontent.com/97651232/164948262-7440cb79-d721-4d5a-88d8-a9561110ddd1.png)