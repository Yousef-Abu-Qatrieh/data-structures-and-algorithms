package StackAndQueue.stack.data;

public class StackNode<T> {
    private StackNode next;
    private final T value;

    public StackNode(T value) {
        this.value = value;
    }

    public StackNode getNext() {
        return next;
    }

    public T getValue() {
        return value;
    }

    public void setNext(StackNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "StackNode{" +

                "value=" + value +
                '}';
    }
}
