/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package LinkedList;

public class App {


    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(5);

        System.out.println(linkedList.include(4));
        System.out.println(linkedList.include(1));



        System.out.println(linkedList.toString());

        LinkedList <Integer> linkedList1=new LinkedList();
        linkedList1.insert(1);
        linkedList1.append(3);
        linkedList1.append(2);
        linkedList1.append(5);
        linkedList1.insertBefore(3,5);

        System.out.println(linkedList1);
        linkedList1.insertAfter(2,4);
        System.out.println(linkedList1);


        System.out.println("**********************************************");
        LinkedList list3=new LinkedList<Integer>();
        list3=linkedList1;
        list3.reverseSinglyLinkedList();

        System.out.println(list3);



    }
}
