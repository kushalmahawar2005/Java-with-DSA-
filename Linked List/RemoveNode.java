public class RemoveNode {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void removeNthFromEnd(int n) {
        int size = 0;
        Node temp = head;

        // 1️⃣ calculate size
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // 2️⃣ remove first node
        if (n == size) {
            head = head.next;
            return;
        }

        // 3️⃣ reach (size - n)th node
        int i = 1;
        int iToFind = size - n;
        Node prev = head;

        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        // 4️⃣ delete node
        prev.next = prev.next.next;
    }
}
