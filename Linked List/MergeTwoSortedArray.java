class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Main {

    // 🔁 Reverse Linked List
    public static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node temp = curr.next; // save next
            curr.next = prev; // reverse link
            prev = curr; // move prev
            curr = temp; // move curr
        }
        return prev;
    }

    // 🔗 Merge Two Sorted Lists
    public static Node mergeTwoLists(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        // remaining nodes
        curr.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }

    public static void main(String[] args) {

        // List 1: 1 -> 3 -> 5
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);

        // List 2: 2 -> 4 -> 6
        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);

        // 🔗 Merge
        Node merged = mergeTwoLists(l1, l2);

        System.out.println("Merged List:");
        printList(merged);

        // 🔁 Reverse
        Node reversed = reverseLinkedList(merged);

        System.out.println("Reversed List:");
        printList(reversed);
    }

    // 🖨️ Print function
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}