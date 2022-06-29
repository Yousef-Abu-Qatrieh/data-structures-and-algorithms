# Graph

Graph is a data structure that stores a certain of data.   
The concept of the graph has been stolen from the mathematics that fulfills the need of the computer science field.    
It represents a network that connects multiple points to each other.  

## Challenge
Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

1.add node  
2.add edge   
3.get nodes   
4.get neighbors  
5.size
## Approach & Efficiency
Using hashmap tp store vertex as key and the edges as array list  

Time :
Big O (n)  
Space :
O(n + 2e) // e is number of edge

## Api
add node :
it will Add new vertex  
add edge: 
Add new edges  
get nodes: 
get all nodes   
get neighbors: 
get all neighbors of specific node
size: 
get the size of all graph node

BreadthFirstTravers  
![image](https://user-images.githubusercontent.com/97651232/176350204-c253c890-c445-487d-9393-0ab9f53dad85.png)   

BusinessTrip
![image](https://user-images.githubusercontent.com/97651232/176357086-20b34c61-f4c9-472a-978e-88f5c1ed7093.png)   

DepthFirstTravers
![image](https://user-images.githubusercontent.com/97651232/176360689-58866ffc-6a2c-467e-9cba-d3d5b9cb640f.png)  


