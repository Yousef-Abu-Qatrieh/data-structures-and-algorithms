package StackAndQueue.queue.structure;

import StackAndQueue.stack.data.StackNode;
import StackAndQueue.stack.structure.Stack;

public class PseudoQueue {
    public Stack stack1 = new Stack();
    public Stack stack2 = new Stack();


    public PseudoQueue() {

    }

    public void enqueue(StackNode value) {
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        stack2.push(value);
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());

        }



    }

    public Object dequeue() {
       Object value=stack2.peek();
        stack2.pop();
        return value;
    }

    @Override
    public String toString() {
        return "PseudoQueue{"+stack2+"}";
    }
}

