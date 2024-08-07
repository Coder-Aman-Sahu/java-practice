import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
    }
}

public class DoublyLinkedList {
    Node head;
    Node tail;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void deleteNode(int key) {
        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp == null) return;

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }

        if (temp == head) {
            head = temp.next;
        }

        if (temp == tail) {
            tail = temp.prev;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            list.addNode(data);
        }

        System.out.println("The doubly linked list is: ");
        list.printList();

        System.out.println("Enter the element to be deleted: ");
        int key = scanner.nextInt();
        list.deleteNode(key);

        System.out.println("The doubly linked list after deletion is: ");
        list.printList();
    }
}