import java.util.LinkedList;

// Doubly Linked List Implementation
class DoublyLinkedList {
    class Node {
        String data;
        Node prev, next;

        public Node(String data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head, tail;

    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void display() {
        Node temp = head;
        System.out.print("Doubly Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// Circular Linked List Implementation
class CircularLinkedList {
    class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head, tail;

    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void display() {
        if (head == null) return;
        Node temp = head;
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

public class LinkedListExample {
    public static void main(String[] args) {
        // Using Java's built-in LinkedList
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        System.out.println("Singly LinkedList: " + list);

        // Doubly Linked List
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.add("Hello");
        dll.add("World");
        dll.add("Java");
        dll.display();

        // Circular Linked List
        CircularLinkedList cll = new CircularLinkedList();
        cll.add("Hello");
        cll.add("World");
        cll.add("Java");
        cll.display();
    }
}
