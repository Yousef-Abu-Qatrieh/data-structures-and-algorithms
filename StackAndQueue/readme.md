# Stacks and Queues
A stack is a data structure that consists of Nodes. Each Node references the next Node in the stack, but does not reference its previous.
## FILO
First In Last Out

This means that the first item added in the stack will be the last item popped out of the stack.

## LIFO
Last In First Out

This means that the last item added to the stack will be the first item popped out of the stack.    
Queues follow these concepts:
# Equeue
A queue is a data structure that consists of Nodes. Each Node references the next Node in the queue, but does not reference its previous.
## FIFO
First In First Out

This means that the first item in the queue will be the first item out of the queue.

## LILO
Last In Last Out

This means that the last item in the queue will be the last item out of the queue.

## Challenge for stack
Push - Nodes or items that are put into the stack are pushed
Pop - Nodes or items that are removed from the stack are popped. When you attempt to
## Challenge for queue
Enqueue - Nodes or items that are added to the queue.  
Dequeue - Nodes or items that are removed from the queue. If called when the queue is empty an exception will be raised.

## Approach & Efficiency
big o(1)
## API
1- push it will add node at the top stack  
2- isEmpty check if stack or not   
3- pop remove node from the top stack   
4-peek return last node in the top without remove it   
5-enqueue add node to the queue    
6-peek return last node in the top without remove it   
7-dequeue remove node from the front of queue
8- isEmpty check if Queue is empty or not     
PseudoQueue that implement Queue using stack   
![image](https://user-images.githubusercontent.com/97651232/160261910-709f4774-9e30-487f-9d2b-d0dc2bbac63c.png)  

GetMax that implement Stack to find max Node value in stack   
![Picture2](https://user-images.githubusercontent.com/97651232/160303418-c1ce79c1-f541-44b6-81c1-1b20a5ea2044.png)
