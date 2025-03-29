public class SingleLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public SingleLinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
    }

    public void prepend(int value) {
    }

    public boolean insert(int index, int value) {
        return true;
    }

    class Node {
        int value;
        Node next = null;

        public Node(int value) {
            this.value = value;
        }
    }
}
