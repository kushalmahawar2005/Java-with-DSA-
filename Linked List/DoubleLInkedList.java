class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Main {

    void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    void inserAtTail(int data) {
        Node newNode = new Node(data;)
        Node curr = head;
        
        
        while(curr != null) {
            curr.next = curr;
        }
        
        curr.next = newNode;
        newNode.prev = curr;
        
        
    }

    // Delete value at specific point

    void deleteAtAny(int data, Node head) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == key) {
                if (curr.prev != null) {
                    curr.prev.next = curr.next;
                } else {
                    head = curr.next;
                }

                if (curr.next != null) {
                    curr.next.prev = curr.prev;
                }

                return;
            }

            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
    }
}