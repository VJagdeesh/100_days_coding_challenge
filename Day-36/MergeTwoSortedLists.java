// 21. Merge Two Sorted Lists

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

class MergeTwoSortedLists {

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    private static Node mergeTwoLists(Node l1, Node l2) {
        Node D = new Node();
        Node curr = D;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                curr = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                curr = l2;
                l2 = l2.next;
            }
        }
        curr.next = l1 != null ? l1 : l2;
        return D.next;
    }

    public static void main(String[] args) {
        Node l11 = new Node(3);
        Node l12 = new Node(2, l11);
        Node l13 = new Node(1, l12);

        Node l21 = new Node(3);
        Node l22 = new Node(2, l21);
        Node l23 = new Node(1, l22);

        printList(mergeTwoLists(l13, l23));
    }
}