package LinkedList;

public class RemoveNthFromLast {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printLL() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void RemoveNthNode(int idx) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size = size + 1;
        }
        if (idx == size) {
            head = head.next;
        }
        int i = 0;
        Node prev = head;
        idx = (size - idx + 1);// 3
        while (i < idx - 2) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        RemoveNthFromLast ll = new RemoveNthFromLast();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printLL();
        ll.RemoveNthNode(3);
        ll.printLL();
    }

}
