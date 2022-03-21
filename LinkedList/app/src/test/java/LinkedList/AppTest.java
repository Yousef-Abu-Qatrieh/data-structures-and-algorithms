/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
//        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }


    @Test
    void emptyLinkedList() {

    @Test void emptyLinkedList(){

        LinkedList<Integer> linkedList = new LinkedList();
        assertNotNull(linkedList);


    }


    @Test
    void testInsertLinkedList() {
        LinkedList<String> linkedList = new LinkedList();
        linkedList.insert("Ali");
        String expected = "{Ali}->Null";
        assertEquals(expected, String.valueOf(linkedList));
    }

    @Test
    void testHeadProperty() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert("yousef");
        String expected = "yousef";
        assertEquals(expected, String.valueOf(linkedList.head.value));
    }

    @Test
    void testInsertMultipleNodes() {
        LinkedList<Double> linkedList = new LinkedList();
        linkedList.insert(2.5);
        linkedList.insert(3.66);
        linkedList.insert(5.55);
        String expected = "{5.55}->{3.66}->{2.5}->Null";
        assertEquals(expected, String.valueOf(linkedList));
    }

    @Test
    void testIncludeFindingValue() {
        LinkedList<String> linkedList = new LinkedList();

    @Test void testInsertLinkedList(){
        LinkedList<String> linkedList=new LinkedList();
        linkedList.insert("Ali");
        String expected="{Ali}->Null";
        assertEquals(expected,String.valueOf(linkedList));
    }
    @Test void  testHeadProperty(){
        LinkedList linkedList=new LinkedList();
        linkedList.insert("yousef");
        String expected="yousef";
        assertEquals(expected,String.valueOf(linkedList.head.value));
    }
    @Test void testInsertMultipleNodes(){
        LinkedList <Double> linkedList=new LinkedList();
        linkedList.insert(2.5);
        linkedList.insert(3.66);
        linkedList.insert(5.55);
      String expected="{5.55}->{3.66}->{2.5}->Null";
      assertEquals(expected,String.valueOf(linkedList));
    }
    @Test void  testIncludeFindingValue(){
        LinkedList <String> linkedList=new LinkedList();

        linkedList.insert("ali");
        linkedList.insert("ahmad");
        linkedList.insert("waleed");
        linkedList.insert("yousef");
        assertTrue(linkedList.include("yousef"));
    }


    @Test
    void testNottIncludeValue() {
        LinkedList<String> linkedList = new LinkedList();

    @Test void  testNottIncludeValue(){
        LinkedList <String> linkedList=new LinkedList();

        linkedList.insert("ali");
        linkedList.insert("ahmad");
        linkedList.insert("waleed");
        linkedList.insert("yousef");

        String expected = "false";
        assertEquals(expected, String.valueOf(linkedList.include("mohammad")));
    }

    @Test
    void tesAllIncludeValue() {
        LinkedList<String> linkedList = new LinkedList();

        String expected="false";
        assertEquals(expected, String.valueOf(linkedList.include("mohammad")));
    }
    @Test void  tesAllIncludeValue(){
        LinkedList <String> linkedList=new LinkedList();

        linkedList.insert("ali");
        linkedList.insert("ahmad");
        linkedList.insert("waleed");


        String expected = "{waleed}->{ahmad}->{ali}->Null";
        ;

        String expected="{waleed}->{ahmad}->{ali}->Null";;

        assertEquals(expected, String.valueOf(linkedList));
    }

    @Test
    void testAppend() {
        LinkedList<String> linkedList = new LinkedList();
        linkedList.insert("ali");
        linkedList.append("ahmad");
        String expected = "{ali}->{ahmad}->Null";
        assertEquals(expected, String.valueOf(linkedList));

    }

    @Test
    void testMultiAppend() {
        LinkedList<String> linkedList = new LinkedList();
        linkedList.insert("ali");
        linkedList.append("ahmad");
        linkedList.append("yousef");
        String expected = "{ali}->{ahmad}->{yousef}->Null";
        assertEquals(expected, String.valueOf(linkedList));

    }
    @Test
    void testInsertBefore() {
        LinkedList <Integer> linkedList1=new LinkedList();
        linkedList1.insert(1);
        linkedList1.append(2);

        linkedList1.insertBefore(2,3);
        String expected="{1}->{3}->{2}->Null";
        assertEquals(expected, String.valueOf(linkedList1));



    }
    @Test
    void testInsertAfter() {
        LinkedList <Integer> linkedList1=new LinkedList();
        linkedList1.insert(1);
        linkedList1.append(2);

        linkedList1.insertBefore(2,3);
        linkedList1.insertAfter(2,4);
        String expected="{1}->{3}->{2}->{4}->Null";
        assertEquals(expected, String.valueOf(linkedList1));



    }


}
