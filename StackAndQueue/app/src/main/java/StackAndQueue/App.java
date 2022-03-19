/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package StackAndQueue;

import StackAndQueue.queue.data.QueueNode;
import StackAndQueue.queue.structure.Queue;
import StackAndQueue.stack.data.StackNode;
import StackAndQueue.stack.structure.Stack;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Stack stack =new Stack();
        if (stack.isEmpty()){
            System.out.println("Stack is empty");
        }
        stack.push(new StackNode(1));
        stack.push(new StackNode(2));
        stack.push(new StackNode(3));
        stack.push(new StackNode(4));
        System.out.println(stack);
        System.out.println( stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println("*********************************Queue*********************************");
        Queue queue=new Queue();
        System.out.println( queue.isEmpty());
        queue.enqueue(new QueueNode(1));
        queue.enqueue(new QueueNode(2));
        queue.enqueue(new QueueNode(3));
        queue.enqueue(new QueueNode(4));
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());


    }

}