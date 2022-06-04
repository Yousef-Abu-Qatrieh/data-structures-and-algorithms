/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree;

import org.junit.jupiter.api.Test;
import tree.data.BTNode;
import tree.structure.BinarySearchTree;
import tree.structure.BinaryTree;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    void testISEmptyTree() {
        BinaryTree binaryTree = new BinaryTree();
        assertNotNull(binaryTree);
    }

    @Test
    void testRootOFTree() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new BTNode(2));
        String expected = "BTNode{data=2, left=null, right=null}";
        assertEquals(expected, String.valueOf(binaryTree.getRoot()));
    }


    @Test
    void testAddLeftChildAndRightChild() {
        BinarySearchTree binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.add(20);
        binarySearchTree.add(40);
        binarySearchTree.add(60);
        String expected = "Node{data=20, leftNode=null, rightNode=Node{data=40, leftNode=null, rightNode=Node{data=60, leftNode=null, rightNode=null}}}";
        assertEquals(expected, binarySearchTree.getRoot().toString());
    }

    @Test
    void testINORDERTree() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.add(50);
        binarySearchTree.add(30);
        binarySearchTree.add(100);
        binarySearchTree.add(20);
        binarySearchTree.add(70);

        binarySearchTree.traverse(BinarySearchTree.TraversalOrder.INORDER);
        String expected = "Node{data=50, " +
                "leftNode=Node{data=30, leftNode=Node{data=20, leftNode=null, rightNode=null}, " +
                "rightNode=null}, rightNode=Node{data=100, leftNode=Node{data=70, leftNode=null, " +
                "rightNode=null}, rightNode=null}}";
        assertEquals(expected, binarySearchTree.getRoot().toString());
    }

    @Test
    void testBinaryTreePostOrder() {
        BinaryTree binaryTree = new BinaryTree();
        //root level 1
        binaryTree.setRoot(new BTNode(8));
        //level 2
        binaryTree.getRoot().setLeft(new BTNode(4));
        binaryTree.getRoot().setRight(new BTNode(15));
        //level 3
        binaryTree.getRoot().getLeft().setLeft(new BTNode(12));
        binaryTree.getRoot().getLeft().setRight(new BTNode(19));
        binaryTree.getRoot().getRight().setLeft(new BTNode(9));
        binaryTree.getRoot().getRight().setRight(new BTNode(17));

        binaryTree.traverse(BinaryTree.TraversalOrder.POSTORDER);
        String expected = "BTNode{data=8, left=BTNode{data=4, left=BTNode{data=12, " +
                "left=null, right=null}, right=BTNode{data=19, left=null, right=null}}" +
                ", right=BTNode{data=15, left=BTNode{data=9, left=null, right=null}" +
                ", right=BTNode{data=17, left=null, right=null}}}";
        assertEquals(expected, String.valueOf(binaryTree.getRoot()));

    }

    @Test
    void testBinaryTreePreOrder() {
        BinaryTree binaryTree = new BinaryTree();
        //root level 1
        binaryTree.setRoot(new BTNode(8));
        //level 2
        binaryTree.getRoot().setLeft(new BTNode(4));
        binaryTree.getRoot().setRight(new BTNode(15));
        //level 3
        binaryTree.getRoot().getLeft().setLeft(new BTNode(12));
        binaryTree.getRoot().getLeft().setRight(new BTNode(19));


        binaryTree.traverse(BinaryTree.TraversalOrder.PREORDER);
        String expected = "BTNode{data=8, left=BTNode{data=4, left=BTNode{data=12, left=null," +
                " right=null}, right=BTNode{data=19, left=null, right=null}}," +
                " right=BTNode{data=15, left=null, right=null}}";
        assertEquals(expected, String.valueOf(binaryTree.getRoot()));

    }
    @Test
    void testBinaryTreeInOrder() {
        BinaryTree binaryTree = new BinaryTree();
        //root level 1
        binaryTree.setRoot(new BTNode(8));
        //level 2
        binaryTree.getRoot().setLeft(new BTNode(4));
        binaryTree.getRoot().setRight(new BTNode(15));
        //level 3
        binaryTree.getRoot().getLeft().setLeft(new BTNode(12));
        binaryTree.getRoot().getLeft().setRight(new BTNode(19));


        binaryTree.traverse(BinaryTree.TraversalOrder.INORDER);
        String expected = "BTNode{data=8, left=BTNode{data=4, left=BTNode{data=12, left=null, right=null}," +
                " right=BTNode{data=19, left=null, right=null}}," +
                " right=BTNode{data=15, left=null, right=null}}";
        assertEquals(expected, String.valueOf(binaryTree.getRoot()));

    }


    @Test
    void testContainSearchTree(){
        BinarySearchTree<Integer> binarySearchTree= new BinarySearchTree<>();
        binarySearchTree.add(40);
        binarySearchTree.add(73);
        binarySearchTree.add(80);

        assertTrue(binarySearchTree.contains(73));

    }
    @Test
    void testMAXElementInBinaryTree(){
    BinaryTree binaryTree = new BinaryTree();

        binaryTree.setRoot( new BTNode(15));
        binaryTree.getRoot().setLeft( new BTNode(20));
        binaryTree.getRoot().setRight(new BTNode(35));
        binaryTree.getRoot().getLeft().setLeft(new BTNode(74));
        binaryTree.getRoot().getRight().setLeft( new BTNode(55));
        binaryTree.getRoot().getRight().setRight( new BTNode(6));
        int expected =74;


        assertEquals( expected,binaryTree.findMaxNodeValue(binaryTree.getRoot()));
        System.out.println("\n");
        System.out.println("Largest element in the binary tree: " + binaryTree.findMaxNodeValue(binaryTree.getRoot()));
}

}