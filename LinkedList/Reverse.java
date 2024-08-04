package LinkedList;

public class Reverse {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    static int size;

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        // update tail also
        tail = newNode;
    }

    public void reverseList() {
        Node prev = null;
        // updated tail value
        Node curr = tail = head;

        Node next;

        while (curr != null) {
            next = curr.next;// updated next
            curr.next = prev;
            prev = curr;// updated prev
            curr = next;// updated curr

        }
        head = prev;
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

    public static void main(String[] args) {
        Reverse ll = new Reverse();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.printLL();
        ll.reverseList();
        ll.printLL();
    }
}
