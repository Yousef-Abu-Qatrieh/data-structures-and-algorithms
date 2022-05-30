package tree.structure;


import tree.data.BinaryNode;
import tree.data.Node;

public class BinarySearchTree<T extends Comparable<T>> {

    public enum TraversalOrder {
        INORDER,
        PREORDER,
        POSTORDER
    }

    private Node<T> root;
    public Node<T> getRoot() {
        return root;
    }
    private int size;

    public void add(T data) {
        if (isTreeEmpty()) {
            root = new BinaryNode<>(data);
            size++;
        } else {
            add(data, root);
        }
    }

    private void add(T data, Node<T> root) {
        if (data.compareTo(root.getData()) < 0) {
            if (root.getLeftNode() != null) {
                add(data, root.getLeftNode());
            } else {
                Node<T> newNode = new BinaryNode<>(data);
                root.setLeftNode(newNode);
                size++;
            }
        } else if (data.compareTo(root.getData()) > 0) {
            if (root.getRightNode() != null) {
                add(data, root.getRightNode());
            } else {
                Node<T> newNode = new BinaryNode<>(data);
                root.setRightNode(newNode);
                size++;
            }
        }
    }


    public void traverse(TraversalOrder order) {
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

    private void inOrder(Node<T> treeNode) {
        if (treeNode == null) { // base case
            return;
        }

        inOrder(treeNode.getLeftNode()); // left

        printNode(treeNode); // root

        inOrder(treeNode.getRightNode()); // right
    }

    private void preOrder(Node<T> treeNode) {
        if (treeNode == null) {
            return;
        }

        printNode(treeNode);

        preOrder(treeNode.getLeftNode());

        preOrder(treeNode.getRightNode());
    }

    private void postOrder(Node<T> treeNode) {
        if (treeNode == null) {
            return;
        }

        postOrder(treeNode.getLeftNode());

        postOrder(treeNode.getRightNode());

        printNode(treeNode);
    }

    private void printNode(Node<T> node) {

        System.out.print(node.getData() + "->");
    }

    public int size() {
        return size;
    }

    public boolean isTreeEmpty() {
        return root == null;
    }

    public boolean contains(T searchTerm) {
        if (isTreeEmpty()) {
            return false;
        } else {
            return contains(searchTerm, root);
        }
    }

    private boolean contains(T searchTerm, Node<T> root) {
        if (root == null)
            return false;
        int compareResult = searchTerm.compareTo(root.getData());
        if (compareResult < 0)
            return contains(searchTerm, root.getLeftNode());
        else if (compareResult > 0)
            return contains(searchTerm, root.getRightNode());
        else
            return true;
    }
   public void oddNode(Node root)
    { int sum=0;
        if (root != null) {
            oddNode(root.getLeftNode());

            // if node is odd then print it
            if (root.getData() % 2 != 0)
                System.out.print(sum+=root.getData() );

            oddNode(root.getRightNode());
        }
    }

}


