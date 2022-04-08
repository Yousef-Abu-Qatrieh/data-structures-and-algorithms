package tree.structure;


import tree.data.BTNode;
import tree.data.Node;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public enum TraversalOrder {
        INORDER,
        PREORDER,
        POSTORDER
    }
    private BTNode root;

    public BTNode getRoot() {
        return root;
    }

    public void setRoot(BTNode root) {
        this.root = root;
    }



    public void levelOrderTraversal() {
        Queue<BTNode> queue = new LinkedList<BTNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BTNode tempNode = queue.poll();
            System.out.print(tempNode.getData() +"->");

            if (tempNode.getLeft() != null) {
                queue.add(tempNode.getLeft());
            }

            if (tempNode.getRight() != null) {
                queue.add(tempNode.getRight());
            }
        }
    }


    public void traverse(BinaryTree.TraversalOrder order) {
        switch (order) {
            case INORDER:
                inOrder(root);
                break;
            case PREORDER:
                preOrder(root);
                break;
            case POSTORDER:
                postOrder(root);
                break;
            default:
        }
    }

    private void inOrder(BTNode treeNode) {
        if (treeNode == null) { // base case
            return;
        }

        inOrder(treeNode.getLeft()); // left

        printNode(treeNode); // root

        inOrder(treeNode.getRight()); // right
    }

    private void preOrder(BTNode treeNode) {
        if (treeNode == null) {
            return;
        }

        printNode(treeNode);

        preOrder(treeNode.getLeft());

        preOrder(treeNode.getRight());
    }

    private void postOrder(BTNode treeNode) {

        if (treeNode == null) {
            return;
        }

        postOrder(treeNode.getLeft());

        postOrder(treeNode.getRight());

        printNode(treeNode);
    }
    private void printNode(BTNode node) {

        System.out.print(node.getData() + "->");
    }

}
