/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package LinkedList;

public class App {


    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList();
        linkedList.insert("Ali");
        linkedList.insert("Ahmad");
        linkedList.insert("yousef");
        linkedList.insert("Jason");
        System.out.println(linkedList.include("Ali"));
        System.out.println(linkedList.include("osama"));

        System.out.println(linkedList.toString());
    }
}
