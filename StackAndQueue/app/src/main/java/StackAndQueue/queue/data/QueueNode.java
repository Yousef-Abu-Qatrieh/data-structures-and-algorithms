package StackAndQueue.queue.data;

public class QueueNode<T> {
    private QueueNode next;
    private final T value;

    public QueueNode(T value) {
        this.value = value;
    }

    public QueueNode getNext() {
        return next;
    }

    public T getValue() {
        return value;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "QueueNode{" +

                "value=" + value +
                '}';
    }
}
