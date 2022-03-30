package StackAndQueue.queue.structure;

import StackAndQueue.queue.data.QueueNode;

public class Animal extends QueueNode {
    String name;

    public Animal(String name) {
        super(name);
                this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
