// 876. Middle of the Linked List

class Node {
    int val;
    Node next;

    Node() {

    }

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

class MiddleOfTheLinkedList {

    private static Node middleNode(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + "   ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node h1 = new Node(6);
        Node h2 = new Node(5, h1);
        Node h3 = new Node(4, h2);
        Node h4 = new Node(3, h3);
        Node h5 = new Node(2, h4);
        Node h6 = new Node(1, h5);
        printList(h6);
        System.out.println("\n ");
        printList(middleNode(h6));
    }
}