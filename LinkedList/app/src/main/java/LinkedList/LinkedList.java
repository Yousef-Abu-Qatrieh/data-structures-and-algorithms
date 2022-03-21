package LinkedList;


import java.util.NoSuchElementException;

public class LinkedList<T> {
    Node head;
    Node tail;


    public LinkedList() {
        this.head = null;
        this.tail=null;

    }

    public void insert(T value) {
        Node newNode = new Node(value);
        newNode.next = this.head;
        if(this.head == null){
            this.tail = newNode;
        }else{
            newNode.next.previous = newNode;
        }
        this.head = newNode;
    }

    public void append(T value) {
        Node newNode = new Node(value);
        Node pointer = head;
        while (pointer != null) {
            if (pointer.next == null) {
                pointer.next = newNode;
            }

            newNode.next = null;
            pointer = pointer.next;
        }
    }

    public void insertBefore(T value, T newValue) {
        Node pointer = head;
        Node newNode = new Node(newValue);
        while (pointer != null) {
            if (pointer.next == null) {
                insert(newValue);
            }

            if (pointer.next.value == value) {
                newNode.next = pointer.next;
                pointer.next = newNode;
                break;
            }
            pointer=pointer.next;

        }


    }
    public void insertAfter(T value,T newValue){
        Node pointer =head;
        Node newNode=new Node(newValue);
        if (pointer.next == null) {
            insert(newValue);
        }
        while (pointer !=null){

            if (pointer.value==value){
                newNode.next= pointer.next;
                pointer.next= newNode;
                break;
            }
            pointer=pointer.next;
        }




    }
    public int kthFromFront(int k){

        Node current = head;
        int count = 0;
        while (current != null)
        {
            if (count == k){
                return (int) current.value;}
            count++;
            current = current.next;



        }

        throw new NoSuchElementException("the key you are looking for not found ");
    }





    public boolean include(T value) {
        Node pointer = this.head;
        try {
            while (pointer != null) {
                if (pointer.value == value) {
                    return true;
                }
                pointer = pointer.next;
            }
        } catch (NullPointerException exception) {
            System.out.println(exception.toString());
        }
        return false;
    }
    public void  reverseSinglyLinkedList(){
        Node pointer =this.head;
        Node previous =null;
        Node newNode;
        while (pointer!= null){
            newNode=pointer;
            pointer=pointer.next;
            newNode.next=previous;
            previous=newNode;
            head=newNode;
        }

    }

    public String toString() {
        Node pointer = this.head;
        StringBuffer stringBuffer = new StringBuffer();
        while (pointer != null) {
            stringBuffer.append("{").append(pointer.value).append("}").append("->");
            pointer = pointer.next;
        }
        stringBuffer.append("Null");
        return stringBuffer.toString();
    }
}
