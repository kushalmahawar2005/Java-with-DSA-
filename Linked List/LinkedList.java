
public class LinkedList {

    // Node class
    public class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and Tail (non-static)
    public Node head;
    public Node tail;
    public static int size;

    // Add at beginning
    public void addFirst(int data) {
       
        Node newNode = new Node(data);
         size++;
        // Agar list empty hai
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Link and move head
        newNode.next = head;
        head = newNode;
    }
    //Add at Last 
    public void addLast(int data) {
     
        Node newNode = new Node(data);
            size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    //Add at Middle 

    public void add(int idx , int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
         size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1) {
            temp = temp.next;
            i++;
        }
        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;

    }


    public int remFirst() {
        if(size == 0) {
            System.out.println("Linked List is Empty");
            return Integer.MAX_VALUE;
        } else 
            if(size == 1) {
                int val = head.data;
                head=tail=null;
                size--;
                return val;
            }
       
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int remLast() {
        if(size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }

        //Prev : i = size - 2
        Node prev = head;
        for(int i = 0; i < size-2 ; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    //Search in LL (Iterator Search)

    public int search(int key) { //o(n)
        int i = 0; 
        Node temp = head;
        while(temp != null) {
            if(temp.data == key) {
                return i;

            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // For Recursive Search 
    
    // Print LinkedList
    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);
        ll.print();
        System.out.println(ll.size);
        ll.remFirst();
        ll.print();
        ll.remLast();
        ll.print();
        System.out.println(ll.search(3));
    }
}
