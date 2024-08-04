package LinkedList;

public class Implementation {

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

    public void addFirst(int data) {
        // create new node
        Node newNode = new Node(data);
        size++;

        // if head is empty then make head as new node
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // add at first
        newNode.next = head;
        head = newNode;
    }

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

    public void addAtIndex(int idx, int data) {
        Node newNode = new Node(data);
        size++;
        // if we want to start at 0 then we have to manage head
        if (head == null) {
            addFirst(data);
            return;
        } else if (idx == size) {
            addLast(data);
            return;
        }
        Node temp = head;
        // node it will traverse till idx-1
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
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

    public int removeFirst() {
        if (head == null) {
            System.out.println("Ll is empty");
            return Integer.MIN_VALUE;
        }
        // special case to manage head and tail both
        else if (size == 1) {
            int val = head.data;
            size--;
            head = tail = null;
            return val;
        }
        Node temp = head;
        int val = temp.data;
        head = temp.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int i = 0;
        Node prev = head;
        while (i < size - 2) {
            prev = prev.next;
            i++;
        }
        System.out.println(prev.data);
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // 0(n)
    public int iterativeSearch(int key) {
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.data == key) {
                return idx;
            }
            idx++;
            temp = temp.next;
        }
        return -1;
    }

    public int recursiveSearch(int key) {
        return searchHelper(key, 0, head.next);

    }

    public int searchHelper(int key, int idx, Node head) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return idx;
        }
        idx++;
        return searchHelper(key, idx++, head.next);

    }

    public static void main(String[] args) {
        Implementation ll = new Implementation();
        ll.printLL();
        ll.addFirst(1);
        ll.printLL();
        ll.addFirst(2);
        ll.printLL();
        ll.addFirst(3);
        ll.printLL();
        ll.addFirst(4);
        ll.printLL();
        ll.addLast(6);
        ll.printLL();
        ll.addAtIndex(4, 8);
        System.out.print("After inserting at index 4 is : ");
        ll.printLL();
        System.out.println("The size of ll is " + size);
        System.out.println("The deleted item is " + ll.removeFirst());
        ll.printLL();
        System.out.println("The size of ll is " + size);
        System.out.println("The deleted item is " + ll.removeLast());
        ll.printLL();
        System.out.println("The size of ll is " + size);

        // search a key in Linked List
        int a = ll.iterativeSearch(8);
        if (a == -1) {
            System.out.println("key is not found");

        } else {
            System.out.println("The key is found at " + a);
        }

        int b = ll.recursiveSearch(8);
        if (a == -1) {
            System.out.println("key is not found");

        } else {
            System.out.println("The key is found at " + b);
        }

    }
}
