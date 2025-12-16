class Node1 {
    int val;
    Node1 left;
    Node1 right;

    Node1(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

class Tree {
    static int index = -1;

    Node1 buildTree(int[] arr) {
        index++;
        if (arr[index] == -1) {
            return null;
        }

        Node1 root = new Node1(arr[index]);
        root.left = buildTree(arr);
        root.right = buildTree(arr);

        return root;
    }
}

public class Count_Node {

    int countNodes(Node1 root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
int sumNodes(Node1 root) {
    if (root == null) {
        return 0;
    }
    return root.val + sumNodes(root.left) + sumNodes(root.right);
}


    public static void main(String[] args) {

        int[] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Tree tree = new Tree();
        Node1 root = tree.buildTree(arr);  
        Count_Node cn = new Count_Node();
        System.out.println("Total Nodes: " + cn.countNodes(root));
        System.out.println("Sum of Nodes: " + cn.sumNodes(root));
    }
}
