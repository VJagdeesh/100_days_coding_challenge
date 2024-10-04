// 19. Remove Nth Node From End of List

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

class RemoveNthNodeFromEndOfList {

    private static void printList(Node head) {
        Node t = head;
        while (t != null) {
            System.out.print(t.val + " ");
            t = t.next;
        }
    }

    private static Node removeNthFromEnd(Node head, int n) {
        Node D = new Node();
        D.next = head;
        Node fast = D;
        Node slow = D;
        while ((n + 1) > 0) {
            n--;
            fast = fast.next;
        }
        if (fast == null) {
            slow.next = slow.next.next;
        } else {
            while (fast != null && slow != null) {
                fast = fast.next;
                slow = slow.next;
                if (fast == null) {
                    slow.next = slow.next.next;
                }
            }
        }
        return D.next;
    }

    public static void main(String[] args) {
        Node h1 = new Node(5);
        Node h2 = new Node(4, h1);
        Node h3 = new Node(3, h2);
        Node h4 = new Node(2, h3);
        Node h5 = new Node(1, h4);
        printList(h5);
        System.out.println();
        printList(removeNthFromEnd(h5, 3));
    }
}