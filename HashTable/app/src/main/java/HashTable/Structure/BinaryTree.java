package HashTable.Structure;


import HashTable.data.BTNode;


import java.util.ArrayList;
import java.util.List;


public class BinaryTree<T extends Comparable<T>> {

    private BTNode root;
    List BinaryList = new ArrayList<>();

    public enum TraversalOrder {
        INORDER,
        PREORDER,
        POSTORDER
    }

    public BTNode getRoot() {
        return root;
    }

    public void setRoot(BTNode root) {
        this.root = root;
    }

    public List levelOrderTraverser(BinaryTree.TraversalOrder order) {
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
                System.out.println("Incorrect Type");
        }
        return BinaryList;
    }


    private List inOrder(BTNode treeNode) {
        if (treeNode == null) {
            return BinaryList;
        }

        inOrder(treeNode.getLeft());

        BinaryList.add(treeNode.getData());

        printNode(treeNode);

        inOrder(treeNode.getRight());


        return BinaryList;
    }

    List preOrder(BTNode treeNode) {
        if (treeNode == null) {
            return BinaryList;
        }

        printNode(treeNode);

        BinaryList.add(treeNode.getData());

        preOrder(treeNode.getLeft());

        preOrder(treeNode.getRight());


        return BinaryList;
    }

    private List postOrder(BTNode treeNode) {
        if (treeNode == null) {
            return BinaryList;
        }

        postOrder(treeNode.getLeft());

        postOrder(treeNode.getRight());

        BinaryList.add(treeNode.getData());

        printNode(treeNode);

        return BinaryList;

    }

    private void printNode(BTNode node) {
        System.out.print(node.getData()+",");
    }


}