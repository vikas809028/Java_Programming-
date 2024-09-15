package LinkedList;

public class Basics {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    static void addAtPosition(int data, int pos) {
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;

        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    static void addAtIndex(int data, int pos) {
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;

        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    static void InsertAfterValue(int data, int value) {
        Node temp = head;
        Node newNode = new Node(data);
        while (temp.data != value) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    static void InsertBeforeValue(int data, int value) {
        Node temp = head;
        Node prev = null;
        Node newNode = new Node(data);
        while (temp.data != value) {
            prev = temp;
            temp = temp.next;
        }
        newNode.next = temp.next;
        prev.next = newNode;
    }

    static void addInMiddle(int data) {
        Node newNode = new Node(data);
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        newNode.next = slow.next;
        slow.next = newNode;

    }

    static void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    static void deleteFirst() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        head = head.next;
    }

    static void deleteLast() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        } else if (head.next == null) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    static void printll(Node head) {
        if (head == null) {
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    static void daleteParticularElement(int ele) {
        if (head == null) {
            System.out.println("Linked List empty");
            return;
        } else if (head.next.data == ele) {
            head = null;
            return;
        }
        Node prev = null;
        Node temp = head;
        while (temp.next == null && temp.data != ele) {
            prev = temp;
            temp = temp.next;
        }
        if (prev == null) {
            System.out.println("Element is not present");
            return;
        }
        prev.next = temp.next;
    }

    static void deleteAtposition(int pos){
        if(head == null){
            System.out.println("Linked List is empty");
        }
        else if(pos==1){
            head=head.next;
        }
        Node temp = head;
        Node prev = null;
        for(int i=1;i<pos;i++){
            prev = temp;
            temp = temp.next;
        } 
        prev.next=temp.next;
    }
    public static void main(String[] args) {
        Node ll = new Node(4);
        head = ll;
        addFirst(3);
        addLast(5);
        addLast(7);
        addLast(8);
        addLast(9);
        printll(head);

        System.out.print("\nAfter Inserting at middle : ");
        addInMiddle(6);
        printll(head);

        System.out.print("\nAfter Inserting at given position : ");
        addAtPosition(12, 2);
        printll(head);

        System.out.print("\nAfter Inserting after given value element : ");
        InsertAfterValue(13, 12);
        printll(head);

        System.out.print("\nAfter Inserting before given value element : ");
        InsertBeforeValue(11, 12);
        printll(head);

        System.out.print("\nAfter deleting first element : ");
        deleteFirst();
        printll(head);

        System.out.print("\nAfter deleting first element : ");
        deleteFirst();
        printll(head);

        System.out.print("\nAfter deleting last element : ");
        deleteLast();
        printll(head);

        System.out.print("\nAfter deleting paticular element : ");
        daleteParticularElement(66);
        printll(head);

    }
}
