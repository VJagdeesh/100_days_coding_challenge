// 138. Copy List with Random Pointer

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class CopyListWithRandomPointer {
    private static Node copyRandomList(Node head) {
        HashMap<Node, Node> hm = new HashMap<>();
        Node temp = head;
        while (temp != null) {
            hm.put(temp, new Node(temp.val));
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            hm.get(temp).next = hm.get(temp.next);
            hm.get(temp).random = hm.get(temp.random);
            temp = temp.next;
        }
        return hm.get(head);
    }

    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print("[" + temp.val + ", ");
            if (temp.random != null) {
                System.out.print(temp.random.val + "]");
            } else {
                System.out.print("null]");
            }
            temp = temp.next;
            if (temp != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node node1 = new Node(7);
        Node node2 = new Node(13);
        Node node3 = new Node(11);
        Node node4 = new Node(10);
        Node node5 = new Node(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        node2.random = node1; // 13 -> 7
        node3.random = node5; // 11 -> 1
        node4.random = node3; // 10 -> 11
        node5.random = node1; // 1 -> 7

        System.out.println("Original list:");
        printList(node1);

        Node copiedList = copyRandomList(node1);

        System.out.println("Copied list: " + (copiedList == node1));
        printList(copiedList);
    }
}