// 206. Reverse Linked List

class Node {
    int val;
    Node next;

    Node() {
    }

    Node(int val) {
        this.val = val;
    }

    Node(Node next, int val) {
        this.next = next;
        this.val = val;
    }
}

class ReverseLinkedList {

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node t = curr.next;
            curr.next = prev;
            prev = curr;
            curr = t;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node n = new Node(5);
        Node n2 = new Node(n, 4);
        Node n3 = new Node(n2, 3);
        Node n4 = new Node(n3, 2);
        Node n5 = new Node(n4, 1);
        printList(n5);
        printList(reverseList(n5));
    }
}