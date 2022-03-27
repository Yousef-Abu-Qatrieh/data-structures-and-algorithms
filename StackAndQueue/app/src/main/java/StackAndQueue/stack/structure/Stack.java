package StackAndQueue.stack.structure;

import StackAndQueue.stack.data.StackNode;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Stack<T> {
    private StackNode<T> top;

    public Stack(){
        this.top=top;
    }

    // isEmpty method that check if the stack is empty or not
    public boolean isEmpty(){
        if(top==null){
            return true;
        }else {
            return false;
        }
    }
    public StackNode<T> push (T value){
        StackNode<T> stackNode = new StackNode<>(value);
        if(isEmpty()){
            top= stackNode;
            return stackNode;
        }else {
            stackNode.setNext(top);
            top=  stackNode;
            return stackNode;
        }

    }
    public StackNode pop(){
      if (isEmpty()){
          throw new NoSuchElementException("Stack is empty");
      }
      StackNode value;
      value=top;
      top=top.getNext();
      value=null;

        return  top;
    }
    public T peek(){
        if (isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }
        return top.getValue();
    }



    @Override
    public String toString() {
        StackNode<T> pointer = top;
        String out = "";
        while (pointer != null){
            out +="{ "+ pointer.getValue()+" } -> ";
            pointer = pointer.getNext();
        }
        out +="{ NULL }";
        return out;
    }

}
