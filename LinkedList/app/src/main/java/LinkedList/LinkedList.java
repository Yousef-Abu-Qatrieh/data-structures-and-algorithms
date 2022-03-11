package LinkedList;


public class LinkedList<T> {
    Node head;
    public LinkedList(){
        this.head=null;
    }
    public void insert(T value){
        Node newNode=new Node(value);
        newNode.next=this.head;
        this.head=newNode;
    }
    public boolean include(T value){
        Node pointer=this.head;
        try {
            while (pointer!=null){
                if(pointer.value==value){
                    return true;
                }
                pointer=pointer.next;
            }
        }catch (NullPointerException exception){
            System.out.println(exception.toString());
        }
        return false;
    }
    public String toString(){
        Node pointer=this.head;
        StringBuffer stringBuffer=new StringBuffer();
        while (pointer !=null){
            stringBuffer.append("{").append(pointer.value).append("}").append("->");
            pointer=pointer.next;
        }
        stringBuffer.append("Null");
        return  stringBuffer.toString();
    }
}
