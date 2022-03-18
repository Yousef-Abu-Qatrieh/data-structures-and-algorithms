package StackAndQueue.stack.structure;

import StackAndQueue.stack.data.StackNode;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Stack {
    private StackNode top;
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
    public StackNode push (StackNode value){
        if(isEmpty()){
            top= (StackNode) value;
            return (StackNode) value;
        }else {
            value.setNext(top);
            top=value;
            return value;
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
    public StackNode peek(){
        if (isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }
        return top;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                '}';
    }
}
