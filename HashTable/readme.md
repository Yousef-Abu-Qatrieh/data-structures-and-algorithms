# HashTable
A hash table is a type of data structure that stores key-value pairs. The key is sent to a hash function that performs arithmetic operations on it. The result (commonly called the hash value or hash) is the index of the key-value pair in the hash table.   

## Challenge
solve Collision if happened and Build HashTable from scratch.   

## Approach & Efficiency
set  
Time Complexity Big O(1) and Space Complexity Big O(n).

Get  
Time Complexity Big O(n) and Space Complexity Big O(1).    

Contains   
Time Complexity Big O(1) and Space Complexity Big O(n).    

Keys   
Time Complexity Big O(1) and Space Complexity Big O(n).   

Hash    
Time Complexity Big O(1) and Space Complexity Big O(1).    


## API

set  
Arguments: key, value  
Returns: nothing  
This method should hash the key, and set the key and value pair in the table, handling collisions as needed.  
Should a given key already exist, replace its value from the value argument given to this method.  

get  
Arguments: key   
Returns: Value associated with that key in the table  

contains   
Arguments: key   
Returns: Boolean, indicating if the key exists in the table already.   

keys    
Returns: Collection of keys    

hash
Arguments: key    
Returns: Index in the collection for that key  