package datastructs.linkedlist;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addHead(int val) {
        Node newNode = new Node(val);
        newNode.setNext(head);
        head = newNode;
    }

    public void addMiddle(int val, int pos) {
        if (pos <= 0 || head == null) {
            addHead(val);
            return;
        }
        Node cur = head;
        int count = 0;
        while (cur != null && count < pos) {
            cur = cur.getNext();
            count++;
        }
        Node newNode = new Node(val);
        newNode.setNext(cur.getNext());
        cur.setNext(newNode);
    }

    public void printList() {
        Node cur = this.head;
        while (cur != null) {
            System.out.printf("%d ->\n", cur.getValue());
            cur = cur.getNext();
        }
        System.out.println("THE END");
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}


