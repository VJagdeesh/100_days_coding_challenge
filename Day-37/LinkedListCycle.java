// 141. Linked List Cycle

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

class LinkedListCycle {

    private static boolean hasCycle(Node head) {
        Node D = head;
        if (head != null) {
            D = head.next;
        }
        Node f = D;
        Node s = D;
        while (f.next != null && s.next != null) {
            if (f.next != null && f.next.next != null) {
                f = f.next.next;
                s = s.next;
                if (s == f) {
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        Node second = new Node(2);
        Node third = new Node(0);
        Node fourth = new Node(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Creates the cycle

        // Test the hasCycle function
        boolean result = hasCycle(head);
        System.out.println("Has cycle: " + result);
    }
}