class Node1 {
    int val;
    Node1 left;
    Node1 right;

    Node1(int val) {
        this.val = val;
        left = null;
        right = null;
    }

    public class BST {

    // Insert a node
    Node insert(Node root, int value) {

        if (root == null) {
            return new Node(value);
        }

        if (root.val == value) {
            return root;
        }

        if (root.val > value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // Search a node
    Node search(Node root, int value) {

        if (root == null || root.val == value) {
            return root;
        }

        if (root.val > value) {
            return search(root.left, value);
        } else {
            return search(root.right, value);
        }
    }

    // Find inorder successor (smallest in right subtree)
    Node successor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Delete a node
    Node deleteNode(Node root, int value) {

        if (root == null) {
            return root;
        }

        if (root.val > value) {
            root.left = deleteNode(root.left, value);
        } 
        else if (root.val < value) {
            root.right = deleteNode(root.right, value);
        } 
        else {
            // Case 1: No left child
            if (root.left == null) {
                return root.right;
            }
            // Case 2: No right child
            if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            Node succ = successor(root.right);
            root.val = succ.val;
            root.right = deleteNode(root.right, succ.val);
        }

        return root;
    }

    // Inorder traversal
    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // Main method for testing
    public static void main(String[] args) {

        BST tree = new BST();
        Node root = null;

        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int v : values) {
            root = tree.insert(root, v);
        }

        System.out.print("Inorder Traversal: ");
        tree.inorder(root);

        System.out.println("\nSearch 40: " + (tree.search(root, 40) != null));
        System.out.println("Search 90: " + (tree.search(root, 90) != null));

        root = tree.deleteNode(root, 50);

        System.out.print("After Deleting 50: ");
        tree.inorder(root);
    }
}

}
