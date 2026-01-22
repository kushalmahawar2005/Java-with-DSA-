
public class LinkedList {

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

    //Define Methods 
    // add();
    // remove();
    // print();
    // search();

    public void addFirst(int data) {
        if(head == null) {
       head = tail = newNode;
       return;     
        }
        //Create New Node
        Node newNode = new Node(data);

        //step2 - newNode next = head;
        newNode.next = head; //LinK

        //Step 3 
        head = newNode;

    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.head = new Node(2);
        ll.head = new Node(3);

    }
}
