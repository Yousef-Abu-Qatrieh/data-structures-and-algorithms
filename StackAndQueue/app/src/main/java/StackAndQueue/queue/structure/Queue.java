package StackAndQueue.queue.structure;

import StackAndQueue.queue.data.QueueNode;

import java.util.NoSuchElementException;

public class Queue {
    private QueueNode front;
    private QueueNode back;

    public boolean isEmpty(){
        return front==null;
    }
    public QueueNode enqueue(QueueNode value){
if (isEmpty()){
    front=(QueueNode) value;
    back=(QueueNode) value;

}else {
    value.setNext(back);
    back=value;
}


        return value;
    }
    public QueueNode dequeue(){
        QueueNode tempFront;
        if(isEmpty()){
            throw new NoSuchElementException("The Queue is empty");
        }else {
        tempFront=front;
        front=front.getNext();
        }
        return tempFront;
    }
    public  QueueNode peek(){
        if (isEmpty()){
         throw new NoSuchElementException("The Queue is empty");
        }
        return front;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", back=" + back +
                '}';
    }
}
