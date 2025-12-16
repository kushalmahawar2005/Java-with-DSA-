class Node1{
    int val;
    Node1 left;
    Node1 right;
    Node1(int n)
    { 
	val = n;
        left = null;
        right = null;
    }
}

class Tree{
    static int index = -1;
    Node1 buildpre(int arr[]){
        index++;
        if(arr[index] == -1)
        {
            return null;
        }
        Node1 newNode = new Node1(arr[index]);
        newNode.left = buildpre(arr);
        newNode.right = buildpre(arr);
        return newNode;

    }
    void preOrder(Node1 element){
        if(element == null){
            return;
        }
        System.out.println(element.val);
        preOrder(element.left);
        preOrder(element.right);
    }

   
}


public class Tree_Preorder {
    public static void main(String[] args) {
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Tree tree = new Tree();
        Node1 root = tree.buildpre(arr);
        System.out.println(root.val);
        tree.preOrder(root);
    }
}




