class Node {
    int value;
    Node next;
    Node(int value) {
        this(value, null);
    }
    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

public class MyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        int i = 0;
        Node iterator = head;
        while (i < index && iterator != null) {
            iterator = iterator.next;
            i++;
        }
        if (iterator != null) {
            return iterator.value;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        length++;
        if (head == null) {
            head = new Node(val);
            tail = head;
            return;
        }
        Node newHead = new Node(val, head);
        head = newHead;
    }
    
    public void addAtTail(int val) {
        length++;
        if (tail ==null) {
            tail = new Node(val);
            head = tail;
            return;
        }

        Node newTail = new Node(val);
        tail.next = newTail;
        tail = newTail;
    }
    
    public void addAtIndex(int index, int val) {
        if (index > length) {
            return;
        }
        length++;

        
        if (index == 0) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode; 
            return;
        }

        Node iterator = head;
        int i = 0; 
        while (i < index - 1) {
            iterator = iterator.next;
            i++;
        }
        Node newNode = new Node(val);
        newNode.next = iterator.next;
        iterator.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
    }
    
    public void deleteAtIndex(int index) {
        if (length == 0) {
            return;
        }

        if (index > length-1) {
            return;
        }
        length--;
        if (index == 0) {
            head = head.next;
            return;
        }
        Node iterator = head;
        int i = 0;
        while (i < index - 1) {
            iterator = iterator.next; 
            i++;
        }

        iterator.next = iterator.next.next;
        if (iterator.next == null) {
            tail = iterator;
        }
        
    }

    public void printLinkedList() {
        Node iterator = head;
        while (iterator != null) {
            System.out.print (iterator.value + " ");
            iterator = iterator.next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

