package tree.structure;


import tree.data.BTNode;
import tree.data.Node;

import java.util.ArrayList;
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
            System.out.print(tempNode.getData() + "->");

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

    public void inOrder(BTNode treeNode) {
        if (treeNode == null) { // base case
            return;
        }

        inOrder(treeNode.getLeft()); // left

        printNode(treeNode); // root

        inOrder(treeNode.getRight()); // right
    }

    public void preOrder(BTNode treeNode) {
        if (treeNode == null) {
            return;
        }

        printNode(treeNode);

        preOrder(treeNode.getLeft());

        preOrder(treeNode.getRight());
    }

    public void postOrder(BTNode treeNode) {

        if (treeNode == null) {
            return;
        }

        postOrder(treeNode.getLeft());

        postOrder(treeNode.getRight());

        printNode(treeNode);
    }

    public void printNode(BTNode node) {

        System.out.print(node.getData() + "->");
    }

    public int findMaxNodeValue(BTNode<Integer> node) {
        if (root == null) {
            System.out.println("Tree is empty");
            return 0;
        } else {
            int leftMaxNode;
            int rightMaxNode;
            int maxNode = node.getData();
            if (node.getLeft() != null) {
                leftMaxNode = findMaxNodeValue(node.getLeft());
                maxNode = Math.max(maxNode, leftMaxNode);
            }
            if (node.getRight() != null) {
                rightMaxNode = findMaxNodeValue(node.getRight());
                maxNode = Math.max(maxNode, rightMaxNode);
            }
            return maxNode;
        }

    }
    public ArrayList breadthFirst() {
        ArrayList<Integer> arrayList=new ArrayList();
        Queue<BTNode> queue = new LinkedList<BTNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BTNode tempNode = queue.poll();
//            System.out.print(tempNode.getData() + "->");
            arrayList.add((Integer) tempNode.getData());

            if (tempNode.getLeft() != null) {
                queue.add(tempNode.getLeft());
            }

            if (tempNode.getRight() != null) {
                queue.add(tempNode.getRight());
            }
        }
        return arrayList;
    }


    public  BinaryTree fizzBuzzTree (BinaryTree tree, BTNode<String> node) {

        if (node !=null){
            if ((Integer.parseInt(node.getData()) % 3)==0){
                node.setData("Fizz");
            }

            else if ((Integer.parseInt(node.getData()) % 5)==0){
                node.setData("Buzz");
            }
            else if ((Integer.parseInt(node.getData()) % 15)==0){
                node.setData("FizzBuzz");
            }

            if (tree.root.getLeft()!= null){
                fizzBuzzTree(tree, node);
            }
            if (tree.root.getRight()!= null){
                fizzBuzzTree(tree, node);
            }
        }
        return tree;
    }
    public int calculateSum(BTNode temp){
        int sum, sumLeft, sumRight;
        sum = sumRight = sumLeft = 0;

        //Check whether tree is empty
        if(root == null) {
            System.out.println("Tree is empty");
            return 0;
        }
        else {
            //Calculate the sum of nodes present in left subtree
            if(temp.getLeft() != null)
                if ((int)(temp.getData()) % 2 != 0)
                sumLeft = calculateSum(temp.getLeft());

            //Calculate the sum of nodes present in right subtree
            if(temp.getRight() != null)

                sumRight = calculateSum(temp.getRight());

            //Calculate the sum of all nodes by adding sumLeft, sumRight and root node's data
            sum = ((int)temp.getData() )+ sumLeft + sumRight;
            return sum;
        }

    }
}





