package StackAndQueue.queue.structure;

import StackAndQueue.queue.data.QueueNode;

import java.util.NoSuchElementException;

public class AnimalShelter {
    private QueueNode front;
    private QueueNode back;


    private QueueNode pref;

    public AnimalShelter() {
    }


    public boolean isEmpty() {
        return front == null;
    }

    public QueueNode enqueue(Animal value) {
        if (isEmpty()) {
            front = value;
            back = value;

        } else {
            value.setNext(back);
            back = value;
        }


        return value;
    }

    public QueueNode<Animal> dequeue(String pref) {
        QueueNode<Animal> dog = front;
        QueueNode<Animal> cat = front;
        int dayArrived = 0;
        if (isEmpty()) {
            throw new NoSuchElementException("The Queue is empty");
        } else {
            while (dog != null) {
                if (dog.getNext() == null) {
//                    pref= String.valueOf(front);
                    front = front.getNext();
                } else {
                    if (pref == String.valueOf(dog)) {
                        cat = cat.getNext();
                        dog.setNext(cat.getNext());
                        cat.setNext(null);
                        dayArrived++;

                    }
                    dog = dog.getNext();
                    cat = cat.getNext();
                }

            }
return front;
        }


    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "front=" + front +
                ", back=" + back +

                '}';
    }

}
