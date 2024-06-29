public class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class LinkedList {
    public Node[] arr;
    public int size;

    public LinkedList(int size) {
        arr = new Node[size];
        this.size = 0;
    }

    public void add(int data) {
        if (size < arr.length) {
            arr[size++] = new Node(data);
        } else {
            System.out.println("List is full");
        }
    }

    public Node get(int index) {
        if (index < size) {
            return arr[index];
        } else {
            System.out.println("Index out of bounds");
            return null;
        }
    }
}

class BinaryTree {
    Node root;

    BinaryTree(LinkedList list) {
        root = list.get(0);
        
        for (int i = 0; i < list.size / 2; i++) {
            Node node = list.get(i);
            
            node.left = list.get(2 * i + 1);
            node.right = list.get(2 * i + 2);
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList(7);
        
        for (int i = 1; i <= 7; i++) {
            list.add(i);
        }
        
        BinaryTree tree = new BinaryTree(list);
        
        System.out.println("Root of the tree is: " + tree.root.data);
    }
}
