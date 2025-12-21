import java.util.ArrayList;

class GraphList {
    int node;
    ArrayList<Integer> adj;
    

    //Constructor
    GraphList(int node) {
        node = node;
        adj = new ArrayList<>();
    } 

    public void addEdge(int node1, int node2) {
      adj.get(node1).add(node2);
      adj.get(node2).add(node1);
    }

    public void printMatix() {
        for(int i = 0 ; i < node; i++) {
            System.out.println(adj.get(i));
            for(int node : adj.get(i)) {
                System.out.println(node);
            }
            System.out.println();
        }
    }
}

