package StackAndQueue;

import StackAndQueue.queue.data.QueueNode;
import StackAndQueue.queue.structure.PseudoQueue;
import StackAndQueue.queue.structure.Queue;
import StackAndQueue.stack.data.StackNode;
import StackAndQueue.stack.structure.MaxStack;
import StackAndQueue.stack.structure.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;


public class StackAndQueueTest {

    Stack stack;
    Queue queue;

    @BeforeEach
    void setUp() {
        stack = new Stack();
        queue = new Queue();

    }

    @Test
    @DisplayName("testStackPush")
    void testStackPush() {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(6);
        stack.push(7);

        String expected = "{ 7 } -> { 6 } -> { 5 } -> { NULL }";
        String actual = String.valueOf(stack);

        assertEquals(expected, actual);
    }

    @Test
    void testpop() {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.pop();
        System.out.println(stack);
        String actual = String.valueOf(stack);
        String exp = "{ 7 } -> { 6 } -> { 5 } -> { NULL }";
        assertEquals(exp, actual);

    }

    @Test
    void testMultiPopIsEmpty() {
        StackNode expected = new StackNode(5);
        StackNode expected1 = new StackNode(6);
        StackNode expected2 = new StackNode(7);
        StackNode expected3 = new StackNode(8);
        StackNode actual = stack.push(expected);
        StackNode actual1 = stack.push(expected1);
        StackNode actual2 = stack.push(expected2);
        StackNode actual3 = stack.push(expected3);
        StackNode actual4 = stack.pop();
        StackNode actual5 = stack.pop();
        StackNode actual6 = stack.pop();
        StackNode actual7 = stack.pop();
        boolean expected4 = true;
        boolean actual8 = stack.isEmpty();

        assertEquals(expected4, actual8);

    }


    @Test
    void testpeek() {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        int expected = 8;
        int actual = stack.peek();
        assertEquals(expected, actual);

    }

    @Test
    void testIsEmpty() {
        boolean expected = true;

        boolean actual = stack.isEmpty();
        assertEquals(expected, actual);

    }


    @Test
    void testQueueEnqueue() {
        QueueNode expected = new QueueNode(5);
        QueueNode expected1 = new QueueNode(6);
        QueueNode expected2 = new QueueNode(7);
        QueueNode expected3 = new QueueNode(8);
        QueueNode actual = queue.enqueue(expected);
        QueueNode actual1 = queue.enqueue(expected1);
        QueueNode actual2 = queue.enqueue(expected2);
        QueueNode actual3 = queue.enqueue(expected3);


        assertEquals(expected3, actual3);
    }

    @Test
    void testQueueDequeue() {
        QueueNode expected = new QueueNode(5);
        QueueNode expected1 = new QueueNode(6);
        QueueNode expected2 = new QueueNode(7);
        QueueNode expected3 = new QueueNode(8);
        QueueNode actual = queue.enqueue(expected);
        QueueNode actual1 = queue.enqueue(expected1);
        QueueNode actual2 = queue.enqueue(expected2);
        QueueNode actual3 = queue.enqueue(expected3);
        QueueNode actual4 = queue.dequeue();


        assertEquals(expected, actual4);
    }

    @Test
    void testQueuePeek() {
        QueueNode expected = new QueueNode(5);
        QueueNode expected1 = new QueueNode(6);
        QueueNode expected2 = new QueueNode(7);
        QueueNode expected3 = new QueueNode(8);
        QueueNode actual = queue.enqueue(expected);
        QueueNode actual1 = queue.enqueue(expected1);
        QueueNode actual2 = queue.enqueue(expected2);
        QueueNode actual3 = queue.enqueue(expected3);
        QueueNode actual4 = queue.peek();


        assertEquals(expected, actual4);
    }

    @Test
    void testQueueIsEmpty() {
        boolean expected = true;
        boolean actual = queue.isEmpty();

        assertEquals(expected, actual);
    }
@Test
void testGetMax(){
    MaxStack maxStack=new MaxStack();
    maxStack.pushMax(20);
    maxStack.pushMax(45);
    maxStack.pushMax(30);
    maxStack.pushMax(25);
    int expected=45;
    int actual=maxStack.getMax();
    assertEquals(expected,actual);
}


}
